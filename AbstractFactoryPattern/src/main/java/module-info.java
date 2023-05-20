module com.example.abstractfactorypattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abstractfactorypattern to javafx.fxml;
    exports com.example.abstractfactorypattern;
    exports com.example.abstractfactorypattern.interfaces;
    opens com.example.abstractfactorypattern.interfaces to javafx.fxml;
    exports com.example.abstractfactorypattern.themes;
    opens com.example.abstractfactorypattern.themes to javafx.fxml;
}