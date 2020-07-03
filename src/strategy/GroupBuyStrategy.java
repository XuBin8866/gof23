package strategy;

/**
 * @author xxbb
 */
public class GroupBuyStrategy implements PromotionStrategy{
    @Override
    public void doPromote() {
        System.out.println("拼团优惠,满5人成团，享受8折优惠");
    }
}
