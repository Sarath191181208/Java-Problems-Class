package prob18.Shapes;

import java.lang.Math;

public class Star extends shapeClass {

    public double[] getPoint(double angle) {
        int _size = size + 7;
        double rad = Math.toRadians(angle);
        double x = 4 * Math.cos(rad) + Math.cos(4 * rad);
        x *= _size;
        double y = 4 * Math.sin(rad) - Math.sin(4 * rad);
        y *= _size;
        return new double[] { x, y };
    }

}
