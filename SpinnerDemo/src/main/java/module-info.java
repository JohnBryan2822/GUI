module com.example.spinnerdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.spinnerdemo to javafx.fxml;
    exports com.example.spinnerdemo;
}