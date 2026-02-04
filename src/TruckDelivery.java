public class TruckDelivery extends Delivery {

    private static final double BASE_PRICE = 1000;
    private static final double PRICE_PER_KM = 40;

    public TruckDelivery(double distance) {
        super(distance);
    }

    @Override
    public double calculatePrice() {
        return BASE_PRICE + distance * PRICE_PER_KM;
    }
}


