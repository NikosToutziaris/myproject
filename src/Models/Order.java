package Models;

public class Order extends OnlineCustomer{

    String date;
    boolean DeliveryStatus;

    public Order(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Order(boolean deliveryStatus) {
        DeliveryStatus = deliveryStatus;
    }

    public boolean isDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        DeliveryStatus = deliveryStatus;
    }

}
