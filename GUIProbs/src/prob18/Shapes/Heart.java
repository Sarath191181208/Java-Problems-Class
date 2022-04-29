package prob18.Shapes;

import java.lang.Math;

public class Heart extends shapeClass {
    @Override
    public double[] getPoint(double angle) {
        double rad = Math.toRadians(angle);
        double x = size * 16 * Math.pow(Math.sin(rad), 3) - 10;
        double y = -size * (13 * Math.cos(rad) - 5 * Math.cos(2 * rad) - 2 * Math.cos(3 * rad) - Math.cos(4 * rad));
        return new double[] { x, y };
    }

}
