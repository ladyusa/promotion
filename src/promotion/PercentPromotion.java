package promotion;

public class PercentPromotion implements Promotion {

    private double percent;

    public PercentPromotion(double percent) {
        this.percent = percent;
    }

    @Override
    public double discount(double price) {
        return price * percent;
    }
}
