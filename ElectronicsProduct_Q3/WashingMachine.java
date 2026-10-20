package ElectronicsProduct_Q3;

public class WashingMachine extends ElectronicsProduct {
    private int WarrantyPeriod;

    WashingMachine(int productId, String name, double price, int WarrantyPeriod){
        super(productId, name, price);
        this.WarrantyPeriod=WarrantyPeriod;
    }

    public void setWarrantyPeriod(int WarrantyPeriod) {
        this.WarrantyPeriod = WarrantyPeriod;
    }

    public int getWarrantyPeriod(){
        return WarrantyPeriod;
    }

   public void ExtendWarranty(int  additionalYears){
        WarrantyPeriod+= additionalYears;
   }

    void displayWashingMachine(double discountPercent) {
        display(discountPercent);
        System.out.println("Warranty: " + WarrantyPeriod + " years");
    }
}
