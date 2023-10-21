module com.example.lesson_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_6 to javafx.fxml;
    exports com.example.lesson_6;
}