package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xxbb
 */
public class PromotionStrategyFactory {
    interface PromotionKey{
        String COUPON="COUPON";
        String CASHBACK="CASHBACK";
        String GROUP_BUY="GROUP_BUY";
        String EMPTY="EMPTY";
    }
    private static Map<String,PromotionStrategy> promotionStrategyMap=new HashMap<>(10);

    static{
        promotionStrategyMap.put(PromotionKey.COUPON,new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.CASHBACK,new CashbackStrategy());
        promotionStrategyMap.put(PromotionKey.GROUP_BUY,new GroupBuyStrategy());
    }
    private static final PromotionStrategy NON_PROMOTION=new EmptyStrategy();
    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy=promotionStrategyMap.get(promotionKey);
        return promotionStrategy==null?NON_PROMOTION:promotionStrategy;
    }
}
