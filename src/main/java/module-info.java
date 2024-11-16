module org.example.p {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.p to javafx.fxml;
    exports org.example.p;
}