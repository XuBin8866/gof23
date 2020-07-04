package strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) {
        String promotionKey= "COUPON";
        PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executor();





//        PromotionActivity couponActivity=new PromotionActivity(new CouponStrategy());
//        PromotionActivity cashbackActivity=new PromotionActivity(new CashbackStrategy());
//        couponActivity.executor();
//        cashbackActivity.executor();
    }
}
