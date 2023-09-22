package com.example.rso_java_dz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Button button1 = new Button("press for sex");
        button1.setLayoutX(40);
        button1.setLayoutY(40);
        root.getChildren().add(button1);

        button1.setOnAction(e ->{
            System.out.println("sex");
        });
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("sex generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
