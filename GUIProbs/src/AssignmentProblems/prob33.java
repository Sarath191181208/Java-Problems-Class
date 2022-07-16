package AssignmentProblems;

import java.util.function.Function;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class prob33 extends Application {

    Label nameLabel = new Label("Name: ");
    Label genderLabel = new Label("Gender: ");
    Label passwordLabel = new Label("Password: ");
    Label DateOfBirthLabel = new Label("DateOfBirth: ");
    Label moblieNumberLabel = new Label("MoblieNumber: ");
    Label eMailLabel = new Label("E Mail: ");
    Label areaLabel = new Label("Area: ");
    Label stateLabel = new Label("State: ");

    Label[] labelLst = {
            nameLabel, genderLabel, passwordLabel,
            DateOfBirthLabel, moblieNumberLabel, eMailLabel,
            areaLabel, stateLabel
    };

    TextField nameTextField = new TextField();
    HBox genderRadioField = createRadioButtons("Female", "Male");
    PasswordField passwordTextField = new PasswordField();
    HBox DateOfBirthField = createDateOfBrithField();
    TextField moblieNumberField = new TextField();
    TextField eMailField = new TextField();
    TextField areaField = new TextField();
    ComboBox<String> stateField = new ComboBox<>(FXCollections
            .observableArrayList(getStatesLst.get()));

    Node[] FieldLst = { nameTextField, genderRadioField, passwordTextField, DateOfBirthField, moblieNumberField,
            eMailField, areaField, stateField };

    // VBox col1 = new VBox();
    // VBox col2 = new VBox();
    GridPane screenLayout = new GridPane();

    @Override
    public void start(Stage stage) throws Exception {
        setLayout();
        addCss();
        Scene sc = new Scene(screenLayout, 400, 350);
        stage.setScene(sc);
        stage.show();
    }

    public void addCss() {
        screenLayout.setStyle("-fx-padding: 20;");
        screenLayout.setVgap(5);
        screenLayout.setHgap(5);
    }

    public void setLayout() {
        for (int i = 0; i < FieldLst.length; i++) {
            screenLayout.add(labelLst[i], 0, i + 1);
            screenLayout.add(FieldLst[i], 1, i + 1);
        }
    }

    public static HBox createRadioButtons(String... labels) {
        ToggleGroup tg = new ToggleGroup();
        HBox container = new HBox();

        for (String label : labels) {
            var r = new RadioButton(label);
            container.getChildren().add(r);
            r.setToggleGroup(tg);

        }
        return container;
    }

    public static HBox createDateOfBrithField() {

        Function<Double, TextField> fnCreateField = (Double width) -> {
            TextField baseField = new TextField();
            baseField.setMaxWidth(width);
            baseField.setPrefWidth(width);
            return baseField;
        };

        var container = new HBox();
        // container.setgap(10);
        // container.setVgap(12);

        String sep = "/";
        var sep1 = new Label(sep);
        var sep2 = new Label(sep);

        TextField dateField = fnCreateField.apply(30.0);
        TextField MonthField = fnCreateField.apply(30.0);
        TextField yearField = fnCreateField.apply(70.0);

        var dateFormatLabel = new Label("DD/MM/YY");

        dateField.setPrefWidth(80);
        MonthField.setPrefWidth(80);
        yearField.setPrefWidth(80);

        container.getChildren().addAll(dateField, sep1, MonthField, sep2, yearField, dateFormatLabel);
        container.setAlignment(Pos.CENTER_LEFT);
        container.setSpacing(10);
        return container;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

class getStatesLst {
    static String[] get() {
        String[] statesLst = {
                "AndhraPradesh", "Assam", "ArunachalPradesh", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana",
                "HimachalPradesh", "Jharkhand", "Karnataka", "Kerala", "MadhyaPradesh", "Maharashtra", "Manipur",
                "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "TamilNadu", "Telangana",
                "Tripura", "UttarPradesh", "Uttarakhand", "WestBengal"
        };
        return statesLst;
    }
}
