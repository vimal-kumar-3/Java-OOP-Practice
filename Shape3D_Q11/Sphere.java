package Shape3D_Q11;

public class Sphere extends Shape3D {
    private int radius;

    Sphere(int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }


    double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
