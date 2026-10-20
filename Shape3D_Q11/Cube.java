package Shape3D_Q11;

public class Cube extends Shape3D{
    private int side;

    Cube(int side){
        this.side=side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    double calculateVolume() {
        return side * side * side;
    }

    double calculateSurfaceArea() {
        return 6 * side * side;
    }
}
