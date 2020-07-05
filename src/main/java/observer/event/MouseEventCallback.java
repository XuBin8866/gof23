package observer.event;

/**
 * @author xxbb
 */
public class MouseEventCallback {
    public void onClick(Event e){
        System.out.println("=====================onClick====================="+e);
    }
    public void onDoubleClick(Event e){
        System.out.println("=====================onDoubleClick====================="+e);
    }

    public void onUp(Event e){
        System.out.println("=====================onUp====================="+e);
    }
    public void onDown(Event e){
        System.out.println("=====================onDown====================="+e);
    }
    public void onMove(Event e){
        System.out.println("=====================onMove====================="+e);
    }
    public void onWheel(Event e){
        System.out.println("=====================onWheel====================="+e);
    }
    public void onOver(Event e){
        System.out.println("=====================onOver====================="+e);
    }
    public void onBlur(Event e){
        System.out.println("=====================onBlur====================="+e);
    }
    public void onFocus(Event e){
        System.out.println("=====================onFocus====================="+e);
    }
}
