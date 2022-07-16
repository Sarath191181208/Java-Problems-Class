package AssignmentProblems;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class prob34 extends Application {

    final double SCREEN_WIDTH = 250.0;
    final double SCREEN_HEIGHT = 360.0;
    final String[] QUALIFICATIONS = { "BE", "ME", "PHD", "BTECH", "BSC" };
    final String[] DEPARTMENTS = { "CSE", "ECE", "EEE", "MECH" };

    Label nameLabel = new Label("Name");
    TextField nameTextField = new TextField();

    Label addressLabel = new Label("Address");
    TextField addressTextField = new TextField();

    Label genderLabel = new Label("Gender");
    VBox genderRadioField = createRadioButtons("Female", "Male");

    Label eduQualificationLabel = new Label("Educational Qualification");
    ComboBox<String> stateField = new ComboBox<>(FXCollections
            .observableArrayList(QUALIFICATIONS));

    Label specialization = new Label("SPECIALIZATION");
    ListView<String> specField = new ListView<>(FXCollections.observableArrayList(DEPARTMENTS));

    Button submitBtn = new Button("submit");
    Label welcomeText = new Label();

    VBox screenLayout = new VBox();

    @Override
    public void start(Stage stage) throws Exception {
        submitBtn.setOnAction(e -> {
            String name = nameTextField.getText();
            welcomeText.setText(name + " Welcome");
        });

        setLayout();
        addCss();
        Scene sc = new Scene(screenLayout, SCREEN_WIDTH, SCREEN_HEIGHT);
        stage.setScene(sc);
        stage.show();
    }

    void addCss() {
        screenLayout.setStyle("-fx-padding: 20;");
        screenLayout.setAlignment(Pos.CENTER);
        screenLayout.setSpacing(5.0);
    }

    void setLayout() {
        screenLayout.getChildren().addAll(nameLabel, nameTextField, addressLabel, addressTextField, genderLabel,
                genderRadioField, eduQualificationLabel, stateField, specialization, specField, submitBtn, welcomeText);
    }

    public static VBox createRadioButtons(String... labels) {
        ToggleGroup tg = new ToggleGroup();
        VBox container = new VBox();

        for (String label : labels) {
            var r = new RadioButton(label);
            container.getChildren().add(r);
            r.setToggleGroup(tg);

        }
        return container;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
