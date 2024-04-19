package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuEmpleadoController {
    @FXML
    private Button offWindow;
    @FXML
    private Button inVend;
    private Stage primaryStage;

    Stage callVende = new Stage();
    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }
    @FXML
    void OnMouseClickedinVend(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("vender-productos-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callVende.setTitle("Vender Productos");
            callVende.setScene(scene);
            callVende.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
