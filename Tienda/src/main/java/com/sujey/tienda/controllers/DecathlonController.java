package com.sujey.tienda.controllers;

import java.io.IOException;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DecathlonController {
    Usuario usuario = new Usuario();

    @FXML
    private PasswordField inContrasena;

    @FXML
    private TextField inUsuario;

    @FXML
    private Button IniciarSesion;
    private String Usuario;
    private String Contrasena;
    Stage callMenu = new Stage();
    Stage callMenu2 = new Stage();
    @FXML
    private Button offWindow;
    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onMouseClickedIniciarSesion(MouseEvent event) {
        String nombreUsuario = inUsuario.getText();
        String contrasena = inContrasena.getText();
        if (nombreUsuario.equals(usuario.getUsuario()) && contrasena.equals(usuario.getContrasenia())) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("menu-admin-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                MenuAdminController menuAdminController = fxmlLoader.getController();
                menuAdminController.setPrimaryStage(callMenu);
                callMenu.setTitle("Menú de Administrador");
                callMenu.setScene(scene);
                callMenu.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (nombreUsuario.equals(usuario.getUsuario2()) && contrasena.equals(usuario.getContrasenia2())) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Decathlon.class.getResource("menu-empleado-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                MenuEmpleadoController menuEmpleadoController = fxmlLoader.getController();
                menuEmpleadoController.setPrimaryStage(callMenu2);
                callMenu2.setTitle("Menú de empleado");
                callMenu2.setScene(scene);
                callMenu2.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}