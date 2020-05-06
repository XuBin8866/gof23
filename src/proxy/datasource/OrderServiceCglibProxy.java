package proxy.datasource;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xxbb
 */
public class OrderServiceCglibProxy implements MethodInterceptor {
    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");
    private Object target;

    public OrderServiceCglibProxy(Object target){
        this.target=target;
    }
    public Object getInstance(){
        return Enhancer.create(target.getClass(),this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before(objects[0]);
        Object object=methodProxy.invokeSuper(o,objects);
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
