package promotion;

public class ConditionPromotion implements Promotion {
    private double discountValue;
    private double minimumPurchase;

    public ConditionPromotion(double discountValue, double minimumPurchase) {
        this.discountValue = discountValue;
        this.minimumPurchase = minimumPurchase;
    }

    @Override
    public double discount(double price) {
        if (price >= minimumPurchase)
            return discountValue;
        return 0;
    }
}
