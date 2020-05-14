package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式测试
 * @author Administrator
 */
public class SingletonDemo02 implements Serializable {
    /**
     * 懒加载
     */
    private  static SingletonDemo02 instance;
    private SingletonDemo02(String test){
        //防止反射通过反射实例化对象而跳过getInstance方法
        if(instance !=null){
            throw new RuntimeException("Object has been instanced!!!");
        }
    }

    /**
     * 使用方法时才加载类,资源利用率高了，但需要线程同步
     * @return SingletonDemo02
     */
    public static synchronized SingletonDemo02 getInstance(){
        if(instance==null){
            instance=new SingletonDemo02("ttt");
        }
        return instance;
    }

    /**
     * 提供readResolve()方法
     * 当JVM反序列化地恢复一个新对象时，
     * 系统会自动调用这个readResolve()方法返回指定好的对象，
     * 从而保证系统通过反序列化机制不会产生多个java对象
     *
     * @return 单例对象
     * @throws ObjectStreamException 异常
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }



}
