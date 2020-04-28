package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class HungryModelClient {
    public static void main(String[] args) throws Exception {
        /*//测试反射破解懒汉式
        Class<SingletonDemo02> clazz=SingletonDemo02.class;
        Constructor<SingletonDemo02> c=clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o1=c.newInstance();
        Method mo1=clazz.getDeclaredMethod("getInstance");
        mo1.setAccessible(true);
        mo1.invoke(clazz);
        SingletonDemo02 s1= (SingletonDemo02) mo1.invoke(clazz);
        Object o2=c.newInstance();
        Method mo2=clazz.getDeclaredMethod("getInstance");
        mo2.setAccessible(true);
        SingletonDemo02 s2= (SingletonDemo02) mo2.invoke(clazz);
        //结论：通过反射实例化的对象绕过了（类加载+调用方法）的实例化过程，不会进行单例判断
        //      但通过反射调用方法获得的结果是单例（理所当然）
        System.out.println(o1==o2);
        System.out.println(s1==s2);*/
        //反序列化获取多个对象

        Class<SingletonDemo02> clazz=SingletonDemo02.class;
        Constructor<SingletonDemo02> c=clazz.getDeclaredConstructor((Class<?>) null);
        c.setAccessible(true);
        Object o3=c.newInstance();
        //
        FileOutputStream fos=new FileOutputStream("D:\\Object.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(o3);
        oos.close();
        fos.close();
        //
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Object.txt"));
        Object o4=ois.readObject();
        //Object o5=ois.readObject();
        System.out.println(o3==o4);
    }

}
