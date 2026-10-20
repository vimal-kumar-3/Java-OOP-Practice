package CustomerOrder_Q5;

public class OnlineOrder extends CustomerOrder{

    private String  deliveryAddress;
    private String trackingNumber;
    private String  trackingStatus;

    OnlineOrder(int orderId, String customerName, String orderDate, String deliveryAddress, String trackingNumber,String trackingStatus){

        super(orderId,customerName,orderDate);
        this.deliveryAddress=deliveryAddress;
        this.trackingNumber=trackingNumber;
        this.trackingStatus=trackingStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingStatus() {
        return trackingStatus;
    }

    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    int calculateDeliveryTime(){
        if (deliveryAddress.equalsIgnoreCase("Delhi")) {
            return 2;
        } else if (deliveryAddress.equalsIgnoreCase("Mumbai")) {
            return 4;
        } else {
            return 5;
        }
    }

    void updateTrackingStatus(String status) {
        trackingStatus = status;
    }
}
