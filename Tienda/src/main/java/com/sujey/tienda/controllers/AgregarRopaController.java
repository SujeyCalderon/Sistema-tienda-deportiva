package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.Ropa;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarRopaController {

    @FXML
    private Button offWindow;

    @FXML
    private TextField precioProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private Button inGua;

    @FXML
    private TextField tallaProducto;

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedinGua(MouseEvent event) {
        String nombre = nombreProducto.getText();
        String talla = tallaProducto.getText();
        double precio;
        try {
            precio = Double.parseDouble(precioProducto.getText());
        } catch (NumberFormatException e) {
            mostrarError();
            return;
        }

        Ropa ropa = new Ropa(nombre, precio, talla);
        Administracion administracion = Decathlon.getAdmin();
        administracion.addRopa(ropa);

        nombreProducto.clear();
        precioProducto.clear();
        tallaProducto.clear();

        mostrarMensajeGuardado();
    }
    private void mostrarMensajeGuardado() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Guardado exitoso");
        alert.setHeaderText(null);
        alert.setContentText("Se ha añadido la ropa con éxito.");
        alert.showAndWait();
    }
    private void mostrarError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText("El precio debe ser un número valido.");
        alert.showAndWait();
    }
}