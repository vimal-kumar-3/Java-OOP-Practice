package CustomerOrder_Q5;

public class CustomerOrderMainClass {
    public static void main(String []args){
        OnlineOrder order=new OnlineOrder(
                101,
                "Kapil",
                "12-08-2026",
                "Delhi",
                "TRK023",
                "Order Placed"
        );


        System.out.println("Delivery Time: "
                + order.calculateDeliveryTime() + " days");

//        order.updateTrackingStatus("Shipped");

        System.out.println("Tracking Status: " + order.getTrackingStatus());
    }
}
