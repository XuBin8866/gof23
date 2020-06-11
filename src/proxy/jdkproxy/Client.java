package proxy.jdkproxy;

import proxy.datasource.*;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //由于OrderDao没有接口 会报错
        OrderDao preDao=new OrderDao();
        OrderDao dao= (OrderDao) Proxy.newProxyInstance(preDao.getClass().getClassLoader(), preDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("测试基于接口的动态代理");

                return method.invoke(preDao,args);
            }
        });
        dao.insert(new Order());
    }
    public void proxyClassTest() throws IOException{
        IOrderSerivce orderService= (IOrderSerivce) new OrderServiceDynamicProxy(new OrderService()).getInstance();
        byte[] bytes= ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{OrderService.class});
        FileOutputStream fos=new FileOutputStream(new File("$Proxy0.class"));
        fos.write(bytes);
        fos.close();
    }
}
