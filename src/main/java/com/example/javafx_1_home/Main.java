package com.example.javafx_1_home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    private Stage stage;

    //this is just test
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Login Please");
//        stage.setScene(scene);
//        stage.show();x
        this.stage = stage;
        registerScene();
    }

    public void loginScene() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

//        LoginController loginController = fxmlLoader.getController();
//        loginController.setApplication(this);
    }

    public void registerScene() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("registration-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Register");
        stage.setScene(scene);
        stage.show();

        RegistrationController registrationController = fxmlLoader.getController();
        registrationController.setApplication(this);
    }

    public static void main(String[] args) {
        launch();
    }
}