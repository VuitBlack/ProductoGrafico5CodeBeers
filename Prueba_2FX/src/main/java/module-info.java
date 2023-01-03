module com.example.prueba_2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prueba_2fx to javafx.fxml;
    exports com.example.prueba_2fx;
}