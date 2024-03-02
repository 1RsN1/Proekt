module kur.project0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kur.project0 to javafx.fxml;
    exports kur.project0;
}