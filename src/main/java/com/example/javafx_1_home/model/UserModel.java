package com.example.javafx_1_home.model;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserModel {
    String fName;
    String lName;

    String email;

    String gender;

    String dob;

    String nationality;

    String password;

    public UserModel(String fName, String lName, String email, String gender, String dob, String nationality, String password){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.nationality = nationality;
        this.password = password;

    }


    public void writeToFile(){
        String pathToCsv = "src/main/resources/userData.csv";
        try {
            FileWriter fileWriter = new FileWriter(pathToCsv, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            String[] csvData = {fName, lName, email, gender, dob,nationality, password};
            csvWriter.writeNext(csvData);
            csvWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validateLogin(String email, String password) {
        String csvPath = "src/main/resources/userData.csv";
        try (CSVReader reader = new CSVReader(new FileReader(csvPath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line.length == 3 && line[1].equals(email) && line[2].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}