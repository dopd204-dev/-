public abstract class Delivery {
    protected double distance;

    public Delivery(double distance) {
        this.distance = distance;
    }


    public abstract double calculatePrice();
}
