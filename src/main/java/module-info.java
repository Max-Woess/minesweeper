module com.example.minesweeper1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minesweeper1 to javafx.fxml;
    exports com.example.minesweeper1;
}