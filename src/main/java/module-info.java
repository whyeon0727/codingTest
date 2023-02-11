module com.example.codingtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codingtest to javafx.fxml;
    exports com.example.codingtest;
    exports com.example.codingtest.class1;
    opens com.example.codingtest.class1 to javafx.fxml;
}