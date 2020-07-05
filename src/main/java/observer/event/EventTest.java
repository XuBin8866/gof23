package observer.event;

/**
 * @author xxbb
 */
public class EventTest {
    public static void main(String[] args) {
        try {
            MouseEventCallback callback=new MouseEventCallback();
            //注册事件
            Mouse mouse=new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK,callback);
            mouse.addListener(MouseEventType.ON_MOVE,callback);
            mouse.addListener(MouseEventType.ON_WHEEL,callback);
            mouse.addListener(MouseEventType.ON_OVER,callback);
            mouse.addListener(MouseEventType.ON_BLUR,callback);

            //调用方法
            mouse.click();
            mouse.blur();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
