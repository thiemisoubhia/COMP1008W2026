package COMP1008W2026.Lab05;

//Thiemi Soubhia Doi
//200645138
//2026-03-25

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Step 1: Create TextFields for input
        TextField input1 = new TextField();
        input1.setPromptText("Enter first number");

        TextField input2 = new TextField();
        input2.setPromptText("Enter second number");

        // Step 2: Create Buttons for operations
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");

        // Step 3: Create Label for result
        Label resultLabel = new Label("Result");

        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);

        // Step 5: VBox main layout
        VBox root = new VBox(10);
        root.getChildren().addAll(input1, input2, buttonBox, resultLabel);

        // Step 6: Event handling for buttons

        //addition
        addBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (Exception ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        
        // Step 7: Create scene and show stage

    }

    public static void main(String[] args) {
        launch(args);
    }
}

// TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)

// TODO:Enter numbers in the two TextFields.

// TODO:Click any operation button to see the result in the Label.

// TODO:Test for division by zero.

// TODO:Try entering invalid input (letters) and observe program behavior
// (optional: you can handle exceptions for invalid input).
