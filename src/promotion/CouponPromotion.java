package promotion;

public class CouponPromotion implements Promotion {

    private double value;

    public CouponPromotion(double value) {
        this.value = value;
    }

    @Override
    public double discount(double price) {
        return value;
    }
}
