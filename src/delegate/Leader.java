package delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xxbb
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> employeeMap=new HashMap<>(5);

    public Leader(){
        employeeMap.put("登录",new EmployeeA());
        employeeMap.put("加密",new EmployeeB());
    }

    /**
     * 经理委派员工干活
     * @param command 命令
     */
    @Override
    public void working(String command) {
        employeeMap.get(command).working(command);
    }
}
