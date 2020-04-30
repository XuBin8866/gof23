package singleton;

/**
 * 测试饿汉式代理模式
 * @author Administrator
 */
public class SingletonDemo01 {
    /**
     * 一旦有加载了类就new出对象，类加载时对象就加载，天然线程安全
     */
    private static SingletonDemo01 instance=new SingletonDemo01();

    /**
     * 饿汉式构造方法，/不允许其他类访问
     */
    private SingletonDemo01(){
        //防止反射破坏单例
        //防止反射通过反射实例化对象而跳过getInstance方法
        //只能在已通过getInstance方法创建好对象后起作用
        //如果一开始就使用反射创建对象的话，由于instance对象并没有被实例化，所以能够一直用反射创建对象
        //要想使用反射创建必须满足instance对象为空。
        if (instance != null) {
            throw new RuntimeException("Object has been instanced,reject create Object by Reflect!!!");
        }
    }

    /**
     * //外部访问的接口
     * @return 单例类对象
     */
    public static SingletonDemo01 getInstance(){
        return instance ;
    }
}
