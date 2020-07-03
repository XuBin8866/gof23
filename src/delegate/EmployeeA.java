package delegate;

/**
 * @author xxbb
 */
public class EmployeeA implements IEmployee{
    @Override
    public void working(String command) {
        System.out.println("我是员工A,正在执行"+command+"工作");
    }
}
