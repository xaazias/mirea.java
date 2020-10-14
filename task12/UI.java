package ru.mirea.java.task12;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label ins = new Label("- Выберите планету");
        Label res = new Label();

        ComboBox<Planet> cmb = new ComboBox<>(FXCollections.observableArrayList(Planet.values()));
        cmb.setMinWidth(320);

        cmb.setOnAction(actionEvent -> {
            res.setText("Ускорение свободного падения на планете " + cmb.valueProperty().getValue().toString()
                    + " равно " + cmb.valueProperty().getValue().getGravity() + " м/c²");
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, ins, cmb, res);
        root.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Planet Gravity");
        primaryStage.setScene(new Scene(root, 600, 245));
        primaryStage.show();
    }
}