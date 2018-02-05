public class LineCalc {

    public double lineLength(Line2d line) {
        double lineLength = Math.sqrt(Math.pow((line.getX2() - line.getX1()), 2) + Math.pow((line.getY2() -
                line.getY1()), 2));
        return lineLength;
    }
}
