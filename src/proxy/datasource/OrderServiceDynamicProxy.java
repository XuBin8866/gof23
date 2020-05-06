package proxy.datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xxbb
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");
    private Object target;

    public OrderServiceDynamicProxy(Object target){
        this.target=target;
    }
    public Object getInstance(){
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object=method.invoke(target,args);
        System.out.println("Proxy after method");
        return object;
    }
    private void before(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Proxy before method");
        Long time= (Long) obj.getClass().getDeclaredMethod("getCreateTime").invoke(obj);
        int dbRouter= Integer.parseInt(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到DB_"+dbRouter+"数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
    }
}
