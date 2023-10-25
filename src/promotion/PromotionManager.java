package promotion;

import java.util.List;

public class PromotionManager {

    public double applyPromotion(List<Promotion> promotions, double price) {
        double discountedPrice = price;
        for (Promotion promotion : promotions) {
            discountedPrice -= promotion.discount(discountedPrice);
        }
        return discountedPrice;
    }
}
