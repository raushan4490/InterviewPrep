public class StandardDeliveryService implements DeliveryService {
    @Override
    public double computeDeliveryCost(int weight, int distance) {
        return weight * distance * 0.05;
    }
}
