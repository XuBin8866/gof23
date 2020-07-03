package strategy;

/**
 * @author xxbb
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromote() {
        System.out.println("无促销策略");
    }
}
