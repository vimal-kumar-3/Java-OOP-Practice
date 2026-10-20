package ElectronicsProduct_Q3;

public class ElectronicsProduct {

    private int  productId;
    private String name;
    private double price;

    ElectronicsProduct(int productId, String name, double price){
        this.name=name;
        this.productId=productId;
        this.price=price;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public int getProductId(){
        return productId;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

//    void applyDiscount(double discountPercent) {
//        price = price - (price * discountPercent / 100);
//    }

    double calculateFinalPrice(double discountPercent) {
        return  price - (price * discountPercent / 100);
    }

    void display(double discountPercent) {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Final Price: " + calculateFinalPrice(discountPercent));
    }
}
