module com.example.lesson_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_1 to javafx.fxml;
    exports com.example.lesson_1;
}