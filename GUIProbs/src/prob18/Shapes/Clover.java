package prob18.Shapes;

import java.lang.Math;

public class Clover extends shapeClass {
    @Override
    public double[] getPoint(double angle) {
        int _size = size + 5;
        double rad = Math.toRadians(angle);

        double a = Math.sin((3 * rad) / 2);
        double b = Math.sin((9 * rad) / 2) / 5;

        double t = Math.pow(_size * (a + b), 2);

        double x = t * Math.cos(rad);
        double y = t * Math.sin(rad);

        return new double[] { x, y };
    }

}
