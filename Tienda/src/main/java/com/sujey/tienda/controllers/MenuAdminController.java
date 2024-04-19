package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuAdminController {

    @FXML
    private Button AgregarButton;

    @FXML
    private Button inVer;

    @FXML
    private Button inVer1;

    @FXML
    private Button offWindow;

    @FXML
    private Button inver2;
    private Stage primaryStage;

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedinVer2(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("productos-vendidos-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage callVender = new Stage();
            callVender.setTitle("Productos Vendidos");
            callVender.setScene(scene);
            callVender.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onMouseClickedAgregarButton(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("agregar-productos-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage callAgregar = new Stage();
            callAgregar.setTitle("Agregar Productos");
            callAgregar.setScene(scene);
            callAgregar.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onMouseClickedinVer(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("productos-disponibles-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage callVer = new Stage();
            callVer.setTitle("Productos Disponibles");
            callVer.setScene(scene);
            callVer.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
