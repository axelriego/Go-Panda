module com.example.go_panda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.go_panda to javafx.fxml;
    exports com.example.go_panda;
}