package com.example.abstractfactorypattern.themes;

import com.example.abstractfactorypattern.interfaces.ThemeFactory;

public class LightThemeFactory implements ThemeFactory {

    @Override
    public String createStyleSheet() {
        return getClass().getResource("/com/example/abstractfactorypattern/light.css").toExternalForm();
    }

    @Override
    public String createVBoxStyle() {
        return "-fx-background-color: #FFFFFF";
    }

}
