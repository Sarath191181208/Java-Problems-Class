package prob18;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import prob18.Shapes.*;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Canvas canvas;
    @FXML
    private Button StarBtn;
    @FXML
    private Button CloverBtn;
    @FXML
    private Button HeartBtn;

    private GraphicsContext ctx;

    public void initialize() {
        ctx = canvas.getGraphicsContext2D();
        ConfigBtns();
        resetCanvas();
        drawShape(new Star());

    }

    final private void ConfigBtns() {
        StarBtn.setOnAction(e -> {
            resetCanvas();
            drawShape(new Star());
        });
        CloverBtn.setOnAction(e -> {
            resetCanvas();
            drawShape(new Clover());
        });
        HeartBtn.setOnAction(e -> {
            resetCanvas();
            drawShape(new Heart());
        });
    }

    private void fillBg() {
        ctx.setFill(Color.BLACK);
        ctx.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void resetCanvas() {
        ctx.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        fillBg();
    }

    private void drawPoint(double x, double y, int r) {
        ctx.fillOval(x - r, y - r, r, r);
    }

    private void drawShape(shapeClass shape) {
        ctx.setFill(Color.web("#00FF7F"));

        int PI = 360;
        for (int i = 0; i < 2 * PI; i++) {
            double[] point = shape.getPoint(i);
            drawPoint(point[0] + 300, point[1] + 300, 1);
        }
    }
}