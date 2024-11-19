package com.example.budgetapp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigation {
    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void loadScene(String fxml) throws Exception {
        Parent root = FXMLLoader.load(Navigation.class.getResource("/fxml/" + fxml));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
