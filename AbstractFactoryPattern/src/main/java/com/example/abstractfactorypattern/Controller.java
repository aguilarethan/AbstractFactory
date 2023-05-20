package com.example.abstractfactorypattern;

import com.example.abstractfactorypattern.interfaces.ThemeFactory;
import com.example.abstractfactorypattern.themes.DarkThemeFactory;
import com.example.abstractfactorypattern.themes.LightThemeFactory;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Controller {

    public Button button;
    @FXML
    public VBox root;

    private Scene scene;
    private ThemeFactory themeFactory;

    public void setTheme(Scene scene, ThemeFactory themeFactory) {
        this.scene = scene;
        this.themeFactory = themeFactory;
        applyTheme();
    }

    public void applyTheme() {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(themeFactory.createStyleSheet());
        root.setStyle(themeFactory.createVBoxStyle());
    }

    public void changeTheme() {
        if (themeFactory instanceof LightThemeFactory) {
            themeFactory = new DarkThemeFactory();
        } else {
            themeFactory = new LightThemeFactory();
        }
        applyTheme();
    }

}
