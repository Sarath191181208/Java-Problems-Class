package AssignmentProblems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class prob32 extends Application {
    Button clgButton = new Button("College");
    Button depButton = new Button("Department");
    Button nameButton = new Button("Name");

    String[] dispActions = {
            "I am Studying in VIT-AP University",
            "I belong to the branch SCOPE",
            "You can call me V.S.Sarath Chandra-21BCE9853"
    };

    Button[] btnLst = { clgButton, depButton, nameButton };

    FlowPane flowLayout = new FlowPane();
    Alert alertWindow = new Alert(AlertType.NONE);

    @Override
    public void start(Stage stage) throws Exception {

        int i = 0;
        for (i = 0; i < btnLst.length; i++) {
            final int idx = i;
            btnLst[i].setOnAction(e -> {
                showAlert(idx);
            });
        }

        applyCss();
        setLayout();
        stage.setTitle("Personal Info");
        Scene sc = new Scene(flowLayout, 285, 200);
        stage.setScene(sc);
        stage.show();
    }

    void showAlert(int index) {
        String prompt;
        if (index > btnLst.length) {
            prompt = "prompt isn't set in dispActions";
        } else {
            prompt = dispActions[index];
        }
        alertWindow.setAlertType(AlertType.INFORMATION);
        alertWindow.setContentText(prompt);
        alertWindow.show();
    }

    void applyCss() {
        flowLayout.setStyle("-fx-padding: 20;");
        flowLayout.setHgap(25);
        flowLayout.setVgap(25);
    }

    void setLayout() {
        flowLayout.getChildren().addAll(btnLst);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
