module com.example.newflowers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newflowers to javafx.fxml;
    exports com.example.newflowers;
}