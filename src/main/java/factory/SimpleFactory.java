package factory;

/**
 * 简单工厂，比较简单，但违反开闭原则，需要修改工厂代码
 */
public class SimpleFactory {
    public Hero callMasterYi(){
        return new MasterYi();
    }
    public Hero callRiven(){
        return new Riven();
    }
}
