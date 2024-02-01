module siothibault.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens siothibault.demo1 to javafx.fxml;
    exports siothibault.demo1;
}