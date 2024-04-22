module org.example.week4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.week4 to javafx.fxml;
    exports org.example.week4;
    exports org.example.week4.controller;
    opens org.example.week4.controller to javafx.fxml;
    exports org.example.week4.model;
    opens org.example.week4.model to javafx.fxml;
}