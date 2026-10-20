package Smartphone_Q2;

public class SmartPhoneMain {
    public static void main(String []args){

        SmartPhone phone=new SmartPhone("Samsung", "Galaxy S25", 128);

        System.out.println("Brand: "+ phone.getBrand());
        System.out.println("Model: "+ phone.getModel());
        System.out.println("Storage:"+phone.getStorageCapacity() + " GB");

        phone.increaseStorage(64);
        System.out.println("Storage: " + phone.getStorageCapacity() + " GB");
    }
}
