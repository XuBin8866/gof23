package singleton;

import factory.INote;

/**
 * 枚举
 * 实现简单，JVM从根本上提供保障，避免反射和反序列化的漏洞
 * 无法延迟加载
 * @author Administrator
 */
public enum  SingletonDemo05 {
    /**
     * 枚举类对象
     */
    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public static SingletonDemo05 getInstance(){
        return INSTANCE;
    }
}
