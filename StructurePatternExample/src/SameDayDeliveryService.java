public class SameDayDeliveryService implements DeliveryService {
    @Override
    public double computeDeliveryCost(int weight, int distance) {
        return weight * distance * 0.2 + 25;
    }
}
