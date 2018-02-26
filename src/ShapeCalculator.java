public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        double circleArea = Math.PI * circle.getRadius() * circle.getRadius();
        return circleArea;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double rectangleArea = rectangle.getSideA() * rectangle.getSideB();
        return rectangleArea;
    }

    @Override
    public double ballVolume(Ball ball) {
        double ballVolume = 4/3 * Math.PI * Math.pow(ball.getRadius(), 3);
        return ballVolume;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double cubeVolume = Math.pow(cube.getSideA(), 3);
        return cubeVolume;
    }
}
