package com.example.javafx_1_home;

import com.example.javafx_1_home.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class RegistrationController {
    @FXML
    public ComboBox userGender;

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML
    private DatePicker date;

    @FXML
    private TextField nationality;

    @FXML
    private TextField r_email;

    @FXML
    private PasswordField r_pass;

    @FXML
    private  PasswordField r_pass1;

    @FXML
    private Label registerStatus;

    private Main main;

    public RegistrationController(){
    }



    public void  setApplication(Main main){
        this.main = main;
    }

    public void register() throws IOException{

        UserModel user = new UserModel(fName.getText(), lName.getText(), r_email.getText(), userGender.getValue().toString(), date.getValue().toString(), nationality.getText(), r_pass.getText());
        user.writeToFile(); //save the details in csv format

//        registerStatus.setText("Registration Successful");
//        registerStatus.getStyleClass().clear();
//        registerStatus.getStyleClass().add("login-success");

        goToLogin();


    }

    public void goToLogin () throws IOException {
        main.loginScene();
    }



}
