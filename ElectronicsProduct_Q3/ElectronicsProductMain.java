package ElectronicsProduct_Q3;

public class ElectronicsProductMain {
    public static void main(String []args){

        WashingMachine wm=new WashingMachine(101,"LG Washing Machine",3000,2);

        wm.ExtendWarranty(2);

        wm.displayWashingMachine(10);
    }
}
