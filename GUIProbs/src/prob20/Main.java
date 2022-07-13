package prob20;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.util.*;

// a simple JavaFX calculator.
public class Main extends Application {
    private static final String[][] template = {
            { "7", "8", "9", "/" },
            { "4", "5", "6", "*" },
            { "1", "2", "3", "-" },
            { "0", "c", "=", "+" }
    };

    private final Map<String, Button> accelerators = new HashMap<>();

    private final DoubleProperty stackValue = new SimpleDoubleProperty();
    private final DoubleProperty value = new SimpleDoubleProperty();

    private enum Operations {
        NOOP, ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private Operations currOp = Operations.NOOP;
    private Operations stackOp = Operations.NOOP;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final TextField screen = createScreen();
        final TilePane buttons = createButtons();

        stage.setTitle("Calculator");
        stage.setScene(new Scene(createLayout(screen, buttons)));
        stage.show();
    }

    private VBox createLayout(TextField screen, TilePane buttons) {
        final VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().setAll(screen, buttons);
        layout.setStyle("-fx-padding: 20;");
        handleAccelerators(layout);
        screen.prefWidthProperty().bind(buttons.widthProperty());
        return layout;
    }

    private void handleAccelerators(VBox layout) {
        layout.addEventFilter(KeyEvent.KEY_PRESSED, keyEvent -> {
            Button activated = accelerators.get(keyEvent.getText());
            if (activated != null) {
                activated.fire();
            }
        });
    }

    private TextField createScreen() {
        final TextField screen = new TextField();
        screen.setAlignment(Pos.CENTER_RIGHT);
        screen.setEditable(false);
        screen.textProperty().bind(Bindings.format("%.0f", value));
        return screen;
    }

    private TilePane createButtons() {
        TilePane buttons = new TilePane();
        buttons.setVgap(7);
        buttons.setHgap(7);
        buttons.setPrefColumns(template[0].length);
        for (String[] r : template) {
            for (String s : r) {
                buttons.getChildren().add(createButton(s));
            }
        }
        return buttons;
    }

    private Button createButton(final String s) {
        Button button = makeStandardButton(s);

        if (s.matches("[0-9]")) {
            makeNumericButton(s, button);
        } else {
            final ObjectProperty<Operations> triggerOp = determineOperand(s);
            if (triggerOp.get() != Operations.NOOP) {
                makeOperandButton(button, triggerOp);
            } else if ("c".equals(s)) {
                makeClearButton(button);
            } else if ("=".equals(s)) {
                makeEqualsButton(button);
            }
        }

        return button;
    }

    private ObjectProperty<Operations> determineOperand(String s) {
        final ObjectProperty<Operations> triggerOp = new SimpleObjectProperty<>(Operations.NOOP);
        switch (s) {
            case "+" -> triggerOp.set(Operations.ADD);
            case "-" -> triggerOp.set(Operations.SUBTRACT);
            case "*" -> triggerOp.set(Operations.MULTIPLY);
            case "/" -> triggerOp.set(Operations.DIVIDE);
        }
        return triggerOp;
    }

    private void makeOperandButton(Button button, final ObjectProperty<Operations> triggerOp) {
        button.setOnAction(actionEvent -> currOp = triggerOp.get());
    }

    private Button makeStandardButton(String s) {
        Button button = new Button(s);
        accelerators.put(s, button);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

    private void makeNumericButton(final String s, Button button) {
        button.setOnAction(actionEvent -> {
            if (currOp == Operations.NOOP) {
                value.set(value.get() * 10 + Integer.parseInt(s));
            } else {
                stackValue.set(value.get());
                value.set(Integer.parseInt(s));
                stackOp = currOp;
                currOp = Operations.NOOP;
            }
        });
    }

    private void makeClearButton(Button button) {
        button.setOnAction(actionEvent -> value.set(0));
    }

    private void makeEqualsButton(Button button) {
        button.setOnAction(actionEvent -> {
            switch (stackOp) {
                case ADD -> value.set(stackValue.get() + value.get());
                case SUBTRACT -> value.set(stackValue.get() - value.get());
                case MULTIPLY -> value.set(stackValue.get() * value.get());
                case DIVIDE -> value.set(stackValue.get() / value.get());
                default -> throw new IllegalArgumentException("Unexpected value: " + stackOp);
            }
        });
    }
}