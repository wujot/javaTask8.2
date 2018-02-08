public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public static double ballVolume(Ball ball) {
        double ballVolume = 4/3 * Math.PI * Math.pow(ball.getRadius(), 3);
        return ballVolume;
    }

    public static double cubeVolume(Cube cube) {
        double cubeVolume = Math.pow(cube.getSideA(), 3);
        return cubeVolume;
    }

    public static double circleArea(Circle circle) {
        double circleArea = Math.PI * circle.getRadius() * circle.getRadius();
        return circleArea;
    }

    public static double rectangleArea(Rectangle rectangle) {
        double rectangleArea = rectangle.getSideA() * rectangle.getSideB();
        return rectangleArea;
    }
}
