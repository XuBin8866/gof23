package delegate;

/**
 * @author xxbb
 */
public class TestMain {

    public static void main(String[] args) {
        //代理模式注重过程，委派模式注重结果
        //策略模式注重可扩展性（外部可扩展性），委派模式注重内部的灵活性和可重复性
        //委派模式的核心是分发，调度，派遣，委派模式是静态代理模式和策略模式的一种特殊组合
        new Boss().command("登录",new Leader());
    }
}
