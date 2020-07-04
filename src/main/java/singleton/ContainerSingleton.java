package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xxbb
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static final Map<String,Object> ioc=new ConcurrentHashMap<>();
    public static Object getBean(String className){
        synchronized(ioc){
            if(!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj=Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }


}
