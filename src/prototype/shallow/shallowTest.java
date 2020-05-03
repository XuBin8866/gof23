package prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxbb
 */
public class shallowTest {
    public static void main(String[] args) {
        //创建一个需要克隆的对象
        ConcretePrototypeA c1=new ConcretePrototypeA();
        List list=new ArrayList<>();
        ArrayList arrayList=new ArrayList();
        arrayList.clone();
        list.add("listlistlist");
        //设置属性
        c1.setId(1);
        c1.setName("xxbb");
        c1.setHobby(list);
        System.out.println(c1);

        //开始克隆
        Client client=new Client();
        ConcretePrototypeA  c2= (ConcretePrototypeA) client.startClone(c1);
        System.out.println(c2);
        //c1和c2的对比
        System.out.println("c1和c2的地址是否相同："+(c1==c2));
        System.out.println("c1和c2的list属性hobby的地址是否相同："+(c1.getHobby()==c2.getHobby()));
        System.out.println("c1和c2的name属性的地址是否相同："+(c1.getName()==c2.getName()));
        //修改c1中的hobby对象
        list.add("hobbyhobby");
        System.out.println(c1);
        System.out.println(c2);
    }
}
