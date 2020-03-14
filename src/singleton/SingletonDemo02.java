package singleton;

import java.io.Serializable;

/**
 * 懒汉式测试
 */
public class SingletonDemo02 implements Serializable {
    private  static SingletonDemo02 instance;//懒加载
    private SingletonDemo02(){
        //防止反射通过反射实例化对象而跳过getInstace
        if(instance !=null){
            throw new RuntimeException("Object has been instanced!!!");
        }
    }

    //使用方法时才加载类,资源利用率高了，但需要线程同步
    public static synchronized SingletonDemo02 getInstance(){
        if(instance==null){
            instance=new SingletonDemo02();
        }
        return instance;
    }
    //防止反序列化构建不同实例，无法达到视频中的效果
    private Object readResolve(){
        return instance;
    }



}
