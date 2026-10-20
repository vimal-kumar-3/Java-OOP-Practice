package Shape3D_Q11;

public class Shape3DMainClass {
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);
        System.out.println("Volume of a sphere: " + sphere.calculateVolume());
        System.out.println("Surface area of a sphere: " + sphere.calculateSurfaceArea());

        Cube cube = new Cube(4);
        System.out.println("Volume of a cube: " + cube.calculateVolume());
        System.out.println("Surface area of a cube: " + cube.calculateSurfaceArea());
    }
}
