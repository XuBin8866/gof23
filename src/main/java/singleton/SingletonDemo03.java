package singleton;

/**
 * 双重检测锁
 * @author Administrator
 */
public class SingletonDemo03 {
    private static volatile SingletonDemo03 instance;
    private  SingletonDemo03(){}



    /**
     * 结合懒汉式和饿汉式的优势，但由于jvm底层（指令重排）问题可能会出bug，将实例改为 volatile可避免指令重排
     * @return 单例对象
     */
    private static SingletonDemo03 getInstance(){
        if(null!=instance){
            synchronized (SingletonDemo03.class){
                if(null!=instance){
                    instance=new SingletonDemo03();
                }
            }
        }
        return instance;
    }

//    //这个有问题，已经加锁后就不需要判断了，只有一个线程能获取到这个类
//    public static SingletonDemo03 getInstance(){
//        if(instance==null){
//            SingletonDemo03 sc;
//            synchronized (SingletonDemo03.class){
//                sc=instance;
//                if(sc==null){
//                    synchronized (SingletonDemo03.class){
//                        if(sc==null){
//                            sc=new SingletonDemo03();
//                        }
//                    }
//                    instance=sc;
//                }
//            }
//        }
//        return instance;
//    }
}
