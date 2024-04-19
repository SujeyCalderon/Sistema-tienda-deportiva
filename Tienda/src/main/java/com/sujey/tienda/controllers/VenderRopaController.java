package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.RopaVenta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VenderRopaController {

    @FXML
    private Button inGua;


    @FXML
    private TextField nombreProducto;

    @FXML
    private Button offWindow;

    @FXML
    private TextField precioProducto;

    @FXML
    private TextField tallaProducto;

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

        Administracion administracion = Decathlon.getAdmin();

        if (administracion.verificarDisponibilidad(nombre, precio, talla)) {
            RopaVenta ropaVenta = new RopaVenta(nombre, precio, talla);
            administracion.addRopaVenta(ropaVenta);

            nombreProducto.clear();
            precioProducto.clear();
            tallaProducto.clear();

            mostrarMensajeVentaExitosa();
        } else {
            mostrarMensajeArticuloNoDisponible();
        }
    }
    private void mostrarError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText("El precio debe ser un número valido.");
        alert.showAndWait();
    }
    private void mostrarMensajeVentaExitosa() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Venta exitosa");
        alert.setHeaderText(null);
        alert.setContentText("La venta se ha realizado con éxito.");
        alert.showAndWait();
    }
    private void mostrarMensajeArticuloNoDisponible() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Artículo no disponible");
        alert.setHeaderText(null);
        alert.setContentText("El artículo no está disponible en el inventario.");
        alert.showAndWait();
    }

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }
}