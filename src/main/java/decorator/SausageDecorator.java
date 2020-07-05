package decorator;

/**
 * @author xxbb
 */
public class SausageDecorator extends BascialBattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根火腿";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
