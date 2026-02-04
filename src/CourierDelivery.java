public class CourierDelivery extends Delivery {

    private static final double PRICE_PER_KM = 50;
    private static final double MIN_PRICE = 200;

    public CourierDelivery(double distance) {
        super(distance);
    }

    @Override
    public double calculatePrice() {
        double price = distance * PRICE_PER_KM;
        return Math.max(price, MIN_PRICE);
    }
}
