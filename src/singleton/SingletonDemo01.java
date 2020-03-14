package singleton;

/**
 * 测试饿汉式代理模式
 */
public class SingletonDemo01 {
    //一旦有加载了类就new出对象
    //类加载时对象就加载，天然线程安全
    private static SingletonDemo01 instance=new SingletonDemo01();
    //不允许其他类访问
    private SingletonDemo01(){};
    //外部访问的接口
    public static SingletonDemo01 getInstance(){
        return instance;
    }
}
