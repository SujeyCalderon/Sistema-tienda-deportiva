package com.sujey.tienda;

import com.sujey.tienda.models.Administracion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Decathlon extends Application {
    public static Administracion admin  = new Administracion();
    public static Administracion getAdmin(){
        return admin;
    }
    public static void setAdmin(Administracion newAdmin){
        admin=newAdmin;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("decathlon-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Decathlon / Inicio de sesion");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
        });
    }


    public static void main(String[] args) {
        launch();
    }
}
