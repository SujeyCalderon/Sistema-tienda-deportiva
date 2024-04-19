package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class VenderProductosController {
    @FXML
    private Button offWindow;
    @FXML
    private Button inAcc;

    @FXML
    private Button inSuple;

    @FXML
    private Button OnRopa;

    Stage callAcs = new Stage();
    Stage callVe = new Stage();
    Stage callRos = new Stage();

    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedinAcc(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("vender-accesorios-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callAcs.setTitle("Vender Accesorios");
            callAcs.setScene(scene);
            callAcs.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onMouseClickedOnRopa(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("vender-ropa-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callVe.setTitle("Vender Ropa");
            callVe.setScene(scene);
            callVe.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void OnMouseClickedSuple(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("vender-suplementos-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callRos.setTitle("Vender Suplementos");
            callRos.setScene(scene);
            callRos.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}