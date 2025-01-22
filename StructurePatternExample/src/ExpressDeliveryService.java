public class ExpressDeliveryService implements DeliveryService {
    @Override
    public double computeDeliveryCost(int weight, int distance) {
        return weight * distance * 0.1 + 10;
    }
}
