package CustomerOrder_Q5;

public class CustomerOrder {
    private int orderId;
    private String customerName;
    private String orderDate;

    CustomerOrder(int orderId, String customerName, String orderDate){
        this.customerName=customerName;
        this.orderDate=orderDate;
        this.orderId=orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }


}
