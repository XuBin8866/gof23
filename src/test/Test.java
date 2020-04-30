package test;


import singleton.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        reflectTest();
    }
    private static void reflectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Constructor c1 = SingletonDemo04.class.getDeclaredConstructor();
        c1.setAccessible(true);
        Object obj1=c1.newInstance();
        Constructor c2 = SingletonDemo04.class.getDeclaredConstructor();
        c2.setAccessible(true);
        Object obj2=c1.newInstance();
        System.out.println("创建的两个对象是否相同："+(obj1==obj2));
    }
    private static void finalTest(){
        final List<Object> lists=new ArrayList<>();
        lists.add(new String());
        lists.add(new Integer(5));
        System.out.println(lists);
    }
}
