package observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author xxbb
 */
public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        GuavaEvent event1=new GuavaEvent();
        GuavaEvent event2=new GuavaEvent();
        eventBus.register(event1);
        eventBus.register(event2);
        eventBus.post("tom");
    }
}
