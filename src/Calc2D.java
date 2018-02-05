public interface Calc2D {

    public static double circleArea(Circle circle) {
        double circleArea = Math.PI * circle.getRadius() * circle.getRadius();
        return circleArea;
    }

    public static double rectangleArea(Rectangle rectangle) {
        double rectangleArea = rectangle.getSideA() * rectangle.getSideB();
        return rectangleArea;
    }
}
