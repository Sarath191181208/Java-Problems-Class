package prob20;

// Java program to create a button and add event handler to it
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage s) {
        s.setTitle("creating buttons");
        HBox root = new HBox();

        Label lbl = new Label("Count: ");
        Button btn = new Button("Count");

        btn.setOnAction(e -> {
            // lbl.setText(arg0);
        });

        // adding elements
        root.getChildren().add(lbl);
        root.getChildren().add(btn);

        // create a scene
        Scene sc = new Scene(root, 500, 500);

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}
