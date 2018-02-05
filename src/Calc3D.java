public interface Calc3D {

    public static double ballVolume(Ball ball) {
            double ballVolume = 4/3 * Math.PI * Math.pow(ball.getRadius(), 3);
            return ballVolume;
    }

    public static double cubeVolume(Cube cube) {
        double cubeVolume = Math.pow(cube.getSideA(), 3);
        return cubeVolume;
    }
}
