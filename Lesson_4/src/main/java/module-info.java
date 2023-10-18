module com.example.lesson_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.lesson_4 to javafx.fxml;
    exports com.example.lesson_4;
}