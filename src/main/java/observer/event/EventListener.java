package observer.event;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xxbb
 */
public class EventListener {
    /**
     * JDK底层的Listener通常也是这样设计的
     */
    protected Map<String,Event> events=new HashMap<>();

    public void addListener(String eventType,Object target){
        try {
            Method method=target.getClass().getDeclaredMethod("on"+toUpperFirstCase(eventType),Event.class);
            this.addListener(eventType,target,method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public void addListener(String eventType, Object target, Method callback){
        //注册事件
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try{
            //发起回调方法
            if(event.getCallback()!=null){
                //反射调用回调方法
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){
            return;
        }
        Event event=this.events.get(trigger);
        event.setTrigger(trigger);
        trigger(event);
    }
    private String toUpperFirstCase(String eventType) {
        char[] chars=eventType.toCharArray();
        chars[0]-=32;
        return String.valueOf(chars);
    }
}
