package decorator;

/**
 * @author xxbb
 */
public abstract class BascialBattercakeDecorator extends Battercake{
    private Battercake battercake;
    public BascialBattercakeDecorator(Battercake battercake){
        this.battercake=battercake;
    }


    protected  abstract  void doSomething();
    @Override
    protected String getMsg() {
        return battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return battercake.getPrice();
    }
}
