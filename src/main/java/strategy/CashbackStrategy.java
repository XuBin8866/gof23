package strategy;

/**
 * @author xxbb
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromote() {
        System.out.println("返现促销，满100返现39，次日转回付款账号");
    }
}
