package gp.lsp;

/**
 * @author xxbb
 */
public class Test {
    /**
     * 将矩形变成正方形
     * @param rectangle 矩形
     */
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()>=rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight()+1);
            System.out.println("width:"+rectangle.getWidth()+"  "+"height:"+rectangle.getHeight());
        }
        System.out.println("over");
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setHeight(10);
        r.setWidth(20);
        resize(r);

        Square sq=new Square();
        sq.setLength(10);
    }
}
