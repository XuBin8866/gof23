package singleton;

/**
 * 双重检测锁Old，在实例化时构建了又构建了一个实例对象的引用，进行了两次双重检查
 */
public class SingletonDemo03 {
    private static SingletonDemo03 instance;
    private  SingletonDemo03(){}



    /**
     * 结合懒汉式和饿汉式的优势，但由于jvm底层问题可能会出bug（指令重排），将实例改为 volatile可避免指令重排
     * 进行了两次双重检查，视频没有进行讲解
     * @return
     */
    public static SingletonDemo03 getInstance(){
        if(instance==null){
            SingletonDemo03 sc;
            synchronized (SingletonDemo03.class){
                sc=instance;
                if(sc==null){
                    synchronized (SingletonDemo03.class){
                        if(sc==null){
                            sc=new SingletonDemo03();
                        }
                    }
                    instance=sc;
                }
            }
        }
        return instance;
    }
}
