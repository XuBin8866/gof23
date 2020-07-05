package observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author xxbb
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String args){
        System.out.println("执行subscribe方法，传入参数是："+args);
    }
}
