package com.example.abstractfactorypattern.themes;

import com.example.abstractfactorypattern.interfaces.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {

    @Override
    public String createStyleSheet() {
        return getClass().getResource("/com/example/abstractfactorypattern/dark.css").toExternalForm();
    }

    @Override
    public String createVBoxStyle() {
        return "-fx-background-color: #333333";
    }

}
