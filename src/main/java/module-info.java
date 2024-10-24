module org.example.manejoeventos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.manejoeventos to javafx.fxml;
    exports org.example.manejoeventos;
}