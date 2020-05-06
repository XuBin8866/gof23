package proxy.jdkproxy;

import proxy.datasource.IOrderSerivce;
import proxy.datasource.OrderService;
import proxy.datasource.OrderServiceDynamicProxy;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) throws IOException {
        IOrderSerivce orderService= (IOrderSerivce) new OrderServiceDynamicProxy(new OrderService()).getInstance();
        byte[] bytes= ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{OrderService.class});
        FileOutputStream fos=new FileOutputStream(new File("$Proxy0.class"));
        fos.write(bytes);
        fos.close();
    }
}
