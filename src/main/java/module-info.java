module com.example.deligabor_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deligabor_javafxrestclientdolgozat to javafx.fxml;
    exports com.example.deligabor_javafxrestclientdolgozat;
}