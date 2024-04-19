package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.SupleVenta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VenderSuplementosController {

    @FXML
    private Button guard;

    @FXML
    private TextField marcaProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private Button offWindow;

    @FXML
    private TextField precioProducto;

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

        Administracion administracion = Decathlon.getAdmin();
        if (administracion.verificarDisponibilidad(nombre, precio, marca)) {
            SupleVenta supleVenta = new SupleVenta(nombre, precio, marca);
            administracion.addSupleVenta(supleVenta);

            nombreProducto.clear();
            marcaProducto.clear();
            precioProducto.clear();

            mostrarMensajeVentaExitosa();
        }else {
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