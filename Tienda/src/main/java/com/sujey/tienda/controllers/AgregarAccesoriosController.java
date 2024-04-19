package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Accesorio;
import com.sujey.tienda.models.Administracion;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarAccesoriosController {
    @FXML
    private Button offWindow;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField tipoProducto;

    @FXML
    private TextField precioProducto;

    @FXML
    private Button inGuardar;

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

        Accesorio accesorio = new Accesorio(nombre, precio, tipo);
        Administracion administracion = Decathlon.getAdmin();
        administracion.addAccesorio(accesorio);

        nombreProducto.clear();
        precioProducto.clear();
        tipoProducto.clear();

        mostrarMensajeGuardado();
    }
    private void mostrarMensajeGuardado() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Guardado exitoso");
        alert.setHeaderText(null);
        alert.setContentText("Se ha añadido el accesorio con éxito.");
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