package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.AccesoriosVenta;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.RopaVenta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VenderAccesoriosController {
    @FXML
    private Button inGuardar;

    @FXML
    private TextField nombreProducto;

    @FXML
    private Button offWindow;

    @FXML
    private TextField precioProducto;

    @FXML
    private TextField tipoProducto;

    private Administracion administracion;

    @FXML
    void initialize() {
        administracion = Decathlon.getAdmin();
    }

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedinGuardar(MouseEvent event) {
        String nombre = nombreProducto.getText();
        String tipo = tipoProducto.getText();
        double precio;
        try {
            precio = Double.parseDouble(precioProducto.getText());
        } catch (NumberFormatException e) {
            mostrarError();
            return;
        }

        Administracion administracion = Decathlon.getAdmin();

        if (administracion.verificarDisponibilidad(nombre, precio, tipo)) {
            AccesoriosVenta accesoriosVenta = new AccesoriosVenta(nombre, precio, tipo);
            administracion.addAccesoriosVenta(accesoriosVenta);

            nombreProducto.clear();
            precioProducto.clear();
            tipoProducto.clear();

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
}