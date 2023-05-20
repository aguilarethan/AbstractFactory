package com.example.abstractfactorypattern;

import com.example.abstractfactorypattern.themes.LightThemeFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/abstractfactorypattern/Sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        Scene scene = new Scene(root, 400, 300);
        controller.setTheme(scene, new LightThemeFactory()); // Tema claro inicial

        primaryStage.setTitle("Abstract Factory Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}