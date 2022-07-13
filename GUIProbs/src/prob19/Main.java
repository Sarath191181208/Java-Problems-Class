package prob19;

// Java program to create a button and add event handler to it
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {

    BorderPane root = new BorderPane();

    Label lbl1 = new Label("Numerator: ");
    TextField tf1 = new TextField("0");
    Label lbl2 = new Label("Denominator: ");
    TextField tf2 = new TextField("0");

    Label output_label = new Label("0");
    Button btn = new Button("Calculate");

    Alert zeroDivisionAlert = new Alert(AlertType.NONE);

    public void start(Stage s) {
        s.setTitle("creating buttons");

        btn.setOnAction(e -> {

            try {
                int count1 = Integer.parseInt(tf1.getText());
                int count2 = Integer.parseInt(tf2.getText());

                int res = count1 / count2;

                output_label.setText(res + " ");
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                tf1.setText("0");
            } catch (ArithmeticException ex) {
                zeroDivisionAlert.setAlertType(AlertType.ERROR);
                zeroDivisionAlert.setContentText("Can't divide by zero(0)");
                zeroDivisionAlert.show();
            }
        });

        // adding elements
        createLayout();

        // create a scene
        Scene sc = new Scene(root, 300, 50);

        // set the scene
        s.setScene(sc);

        s.setTitle("Division Calculator");
        s.show();
    }

    public void createLayout() {

        VBox v1 = new VBox(lbl1, tf1);
        VBox v2 = new VBox(lbl2, tf2);
        v1.setStyle("-fx-padding: 20;");
        v2.setStyle("-fx-padding: 20;");
        HBox top = new HBox(v1, v2);

        output_label.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        VBox mid = new VBox(output_label, btn);
        mid.setStyle("-fx-padding: 20;");
        mid.setAlignment(Pos.CENTER);

        root.setTop(top);
        root.setCenter(mid);
    }

    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}
