package prob19;

// Java program to create a button and add event handler to it
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage s) {
        s.setTitle("creating buttons");
        HBox root = new HBox();

        Label lbl = new Label("Count: ");
        TextField tf = new TextField("0");
        Button btn = new Button("Count");

        btn.setOnAction(e -> {
            try {
                int count = Integer.parseInt(tf.getText());
                count++;
                tf.setText(String.valueOf(count));
            } catch (NumberFormatException ex) {
                tf.setText("0");
            }
        });

        // adding elements
        root.getChildren().add(lbl);
        root.getChildren().add(tf);
        root.getChildren().add(btn);

        // create a scene
        Scene sc = new Scene(root, 300, 50);

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}
