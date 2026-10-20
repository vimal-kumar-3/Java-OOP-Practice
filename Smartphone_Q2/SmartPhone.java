package Smartphone_Q2;

public class SmartPhone {
    private String brand;
    private String model;
    private int StorageCapacity;

    SmartPhone(String brand, String model, int StorageCapacity){
        this.brand=brand;
        this.model=model;
        this.StorageCapacity=StorageCapacity;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setStorageCapacity(int model){
        this.StorageCapacity=StorageCapacity;
    }
    public int getStorageCapacity(){
        return StorageCapacity;
    }

    public void increaseStorage(int value) {
        StorageCapacity += value;
    }

}
