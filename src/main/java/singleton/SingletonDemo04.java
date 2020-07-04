package singleton;


/**
 * 静态内部类实现
 * 延迟加载，线程同步 效率高
 */
public class SingletonDemo04 {
    private static Integer count;
    static{
        System.out.println("外部类开始加载 ");
        count=0;
    }

    /**
     * 定义一个内部类，天然线程安全
     * 内部类只有被使用时才会加载，instance才会实例化
     */
    private static final class SingletonClassInstance {
        static{
            System.out.println("内部类开始加载");
        }
        private static final SingletonDemo04 instance = new SingletonDemo04();

    }

    public static SingletonDemo04 getInstance() {
        return SingletonClassInstance.instance;
    }

    /**
     * 该类的构造方法
     +
     * 第一次调用构造方法进行判断时第一次调用SingletonClassInstance.instance对象，SingletonClassInstance类开始加载，instance对象实例化，第二次调用构造方法，进行判断，由于此时正是instance实例化的过程中，instance仍然为空，判断结果为false，不抛出异常，完成实例化。
     +
     * 此时回到第一次调用构造方法的if判断中，instance实例化完成，判断结果为true，抛出异常
     */
    private SingletonDemo04() {
        System.out.println("外部类开始实例化！！！");
        boolean flag=(null!=SingletonClassInstance.instance);
        System.out.println(SingletonClassInstance.instance);
        System.out.println("instance对象是否实例化："+flag);
        if(flag){
            throw new RuntimeException("Object has been instanced,reject create Object by Reflect!!!");
        }
        System.out.println("完成实例化次数"+(++count));
    }

}
