module com.sujey.tienda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sujey.tienda to javafx.fxml;
    exports com.sujey.tienda;
    exports com.sujey.tienda.controllers;
    opens com.sujey.tienda.controllers to javafx.fxml;
    exports com.sujey.tienda.models;
    opens com.sujey.tienda.models to javafx.fxml;
}