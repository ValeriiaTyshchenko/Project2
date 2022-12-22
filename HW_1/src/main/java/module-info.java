module com.example.hw_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw_1 to javafx.fxml;
    exports com.example.hw_1;
}