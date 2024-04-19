package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.Suplemento;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarSuplementosController {
    @FXML
    private Button offWindow;

    @FXML
    private Button Guard;

    @FXML
    private TextField precioProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField marcaProducto;


    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedGuard(MouseEvent event) {
        String nombre = nombreProducto.getText();
        String marca = marcaProducto.getText();
        double precio;
        try {
            precio = Double.parseDouble(precioProducto.getText());
        } catch (NumberFormatException e) {
            mostrarError();
            return;
        }

        Suplemento suplemento = new Suplemento(nombre, precio, marca);
        Administracion administracion = Decathlon.getAdmin();
        administracion.addSuplemento(suplemento);

        nombreProducto.clear();
        precioProducto.clear();
        marcaProducto.clear();

        mostrarMensajeGuardado();
    }
    private void mostrarMensajeGuardado() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Guardado exitoso");
        alert.setHeaderText(null);
        alert.setContentText("Se ha añadido el suplemento con éxito.");
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