package AssignmentProblems;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class prob31 extends Application {

    String question = "What is 10 + 20?";
    String[] options = { "10", "20", "30", "40" };
    int ansIdx = 2;

    Label questionLabel = new Label(question);
    Button submitButton = new Button("Submit");
    ArrayList<RadioButton> radioBtnGrp = new ArrayList<>();
    ToggleGroup toggleGrp = new ToggleGroup();
    Label labelresponse = new Label();

    VBox screenLayout = new VBox(5);

    @Override
    public void start(Stage primaryStage) {
        createButtons();
        primaryStage.setTitle("Test Question 1");

        for (RadioButton rb : radioBtnGrp) {
            rb.setToggleGroup(toggleGrp);
            rb.setOnAction(e -> submitButton.setDisable(false));
        }

        submitButton.setDisable(true);

        submitButton.setOnAction(e -> {
            RadioButton crctBtn = radioBtnGrp.get(ansIdx);
            var b = (crctBtn.isSelected()) ? showCorrectAnswer() : showCorrectAnswer();
        });

        applyCss();
        setLayout();

        Scene scene1 = new Scene(screenLayout, 400, 250);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    void createButtons() {
        for (String optionTxt : options) {
            var rb = new RadioButton(optionTxt);
            radioBtnGrp.add(rb);
        }
    }

    void applyCss() {
        questionLabel.setStyle("-fx-font-size: 20;");
        screenLayout.setStyle("-fx-padding: 20;");
    }

    void setLayout() {
        screenLayout.getChildren().addAll(questionLabel);
        screenLayout.getChildren().addAll(radioBtnGrp);
        screenLayout.getChildren().addAll(submitButton, labelresponse);
    }

    boolean showCorrectAnswer() {
        labelresponse.setStyle("-fx-text-fill: green;");
        labelresponse.setText("Correct answer");
        submitButton.setDisable(true);
        return true;
    }

    boolean showWrongAnswer() {
        labelresponse.setStyle("-fx-text-fill: red;");
        labelresponse.setText("Wrong answer");
        submitButton.setDisable(true);
        return false;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
