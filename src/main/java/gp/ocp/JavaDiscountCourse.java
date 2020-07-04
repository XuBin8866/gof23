package gp.ocp;

/**
 * @author xxbb
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 不符合里氏替换原则，父类的方法到子类后内容被修改，无法里氏替换，也违背了开闭原则
     * @return price
     */
    @Override
    public Double getPrice(){
        return super.getPrice()*0.76;
    }
}
