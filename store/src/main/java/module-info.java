module edu.fatec.narima.store {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.fatec.narima.store to javafx.fxml;
    exports edu.fatec.narima.store;
}