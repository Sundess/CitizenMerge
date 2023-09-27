 module com.example.javafx_1_home {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencsv;

    opens com.example.javafx_1_home to javafx.fxml;
    exports com.example.javafx_1_home;
}
