module javaprogram.javafinalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    requires java.base;
    requires org.jetbrains.annotations;
    requires java.desktop;


    exports application_backend.content to javafx.graphics, javafx.media;
    opens application_backend.content to javafx.fxml;
    exports application_backend.structure to javafx.graphics, javafx.media;
    opens application_backend.structure to javafx.fxml;
}