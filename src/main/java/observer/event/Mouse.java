package observer.event;

/**
 * @author xxbb
 */
public class Mouse extends EventListener{
    public void click(){
        System.out.println("单击");
        this.trigger(MouseEventType.ON_CLICK);
    }
    public void doubleClick(){
        System.out.println("双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }
    public void up(){
        System.out.println("弹起");
        this.trigger(MouseEventType.ON_UP);
    }
    public void down(){
        System.out.println("按下");
        this.trigger(MouseEventType.ON_DOWN);
    }
    public void move(){
        System.out.println("移动");
        this.trigger(MouseEventType.ON_MOVE);
    }
    public void wheel(){
        System.out.println("滚动");
        this.trigger(MouseEventType.ON_WHEEL);
    }
    public void over(){
        System.out.println("悬停");
        this.trigger(MouseEventType.ON_OVER);
    }
    public void blur(){
        System.out.println("失去焦点");
        this.trigger(MouseEventType.ON_BLUR);
    }
    public void focus(){
        System.out.println("获取焦点");
        this.trigger(MouseEventType.ON_FOCUS);
    }
}

