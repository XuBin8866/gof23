package strategy;



/**
 * @author xxbb
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromote() {
        System.out.println("领取优惠券，满100-39");
    }
}
