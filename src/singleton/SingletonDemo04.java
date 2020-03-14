package singleton;


/**
 * 静态内部类实现
 * 延迟加载，线程同步 效率高
 */
public class SingletonDemo04 {
    //定义一个内部类，天然线程安全
    private static class SingletonClassInstance {
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }

    public static SingletonDemo04 getInstance() {
        return SingletonClassInstance.instance;
    }
    private SingletonDemo04(){}

}
