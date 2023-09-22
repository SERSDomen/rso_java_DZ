module com.example.rso_java_dz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.rso_java_dz to javafx.fxml;
    exports com.example.rso_java_dz;
}