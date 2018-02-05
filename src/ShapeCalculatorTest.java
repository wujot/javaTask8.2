public class ShapeCalculatorTest {

    public static void main(String[] args) {

        // create geometric objects
        Line2d line = new Line2d(1, 1, 5, 5);

        Circle circle = new Circle(5);

        Rectangle rectangle = new Rectangle(2, 6);

        Ball ball = new Ball(5);

        Cube cube = new Cube(6);

        ShapeCalculator calculator = new ShapeCalculator();

        // calculate length of the line
        double l = calculator.lineLength(line);
        System.out.printf("Length of the line is: %f\n", l);

        // calculate circle area
        double ca = Calc2D.circleArea(circle);
        System.out.printf("Area of the circle is: %f\n", ca);

        // calculate area of rectangle
        double ra = Calc2D.rectangleArea(rectangle);
        System.out.printf("Area of rectangle is: %f\n", ra);

        // calculate ball volume
        double bv = Calc3D.ballVolume(ball);
        System.out.printf("Volume of the ball is: %f\n", bv);

        // calculate cube volume
        double cv = Calc3D.cubeVolume(cube);
        System.out.printf("Volume of the cube is: %f\n", cv);
    }
}
