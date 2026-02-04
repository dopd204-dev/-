public class DroneDelivery extends Delivery {

    private static final double PRICE_PER_KM = 150;
    private static final double MAX_DISTANCE = 20;

    public DroneDelivery(double distance) {
        super(distance);
    }

    @Override
    public double calculatePrice() {
        if (distance > MAX_DISTANCE) {
            throw new IllegalArgumentException(
                    "Дрон не может доставлять на расстояние больше " + MAX_DISTANCE + " км"
            );
        }
        return distance * PRICE_PER_KM;
    }
}
