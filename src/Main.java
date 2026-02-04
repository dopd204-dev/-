
public static void main(String[] args) {
    Delivery courier = new CourierDelivery(3);
    Delivery drone = new DroneDelivery(10);
    Delivery truck = new TruckDelivery(100);

    System.out.println("Курьер: " + courier.calculatePrice());
    System.out.println("Дрон: " + drone.calculatePrice());
    System.out.println("Грузовик: " + truck.calculatePrice());
}