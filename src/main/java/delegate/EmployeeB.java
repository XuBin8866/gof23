package delegate;

/**
 * @author xxbb
 */
public class EmployeeB implements IEmployee{
    @Override
    public void working(String command) {
        System.out.println("我是员工B,正在执行"+command+"工作");
    }
}
