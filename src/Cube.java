public class Cube extends Shape3d {
    private double sideA;

    public Cube() {}

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
