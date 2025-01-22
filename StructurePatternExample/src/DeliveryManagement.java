public class DeliveryManagement {
    DeliveryService deliveryService;

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    void placeDelivery(String name, int weight, int distance){
        System.out.println("Delivery is dispatched to : " + name + " and cost is : " + deliveryService.computeDeliveryCost(weight, distance));
    }
}
