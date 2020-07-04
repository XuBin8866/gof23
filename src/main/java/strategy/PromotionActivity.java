package strategy;

/**
 * @author xxbb
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy=promotionStrategy;
    }
    public void executor(){
        promotionStrategy.doPromote();
    }
}
