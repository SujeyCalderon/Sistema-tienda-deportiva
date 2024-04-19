package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AgregarProductosController {
    @FXML
    private Button OnRopa;

    @FXML
    private Button inAcc;

    @FXML
    private Button inSuple;

    @FXML
    private Button offWindow;
    Stage callAccesorios = new Stage();
    Stage callRopa = new Stage();
    Stage callSuplementos = new Stage();

    @FXML
    void OnMouseClickedSuple(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("agregar-suplementos-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callSuplementos.setTitle("Agregar Suplementos");
            callSuplementos.setScene(scene);
            callSuplementos.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void OnMouseClickedinAcc(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("agregar-accesorios-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callAccesorios.setTitle("Agregar Accesorios");
            callAccesorios.setScene(scene);
            callAccesorios.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }
    @FXML
    void onMouseClickedOnRopa(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("agregar-ropa-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callRopa.setTitle("Agregar Ropa");
        callRopa.setScene(scene);
        callRopa.show();
    }

}