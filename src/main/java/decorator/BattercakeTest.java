package decorator;

/**
 * @author xxbb
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake=new BascialBattercake();
        //加两个鸡蛋一根香肠
        battercake=new EggDecorator(battercake);
        battercake=new EggDecorator(battercake);
        battercake=new SausageDecorator(battercake);
        //装饰者和静态代理最大的区别是职责不同
        //静态代理不一定满足is-a的关系，代理中新增的行为可以和被代理对象毫无关联
        //装饰器模式增强的功能一定是在基本功能的基础上有联系地增强-
        System.out.println(battercake.getMsg()+"花费："+battercake.getPrice());
    }
}
