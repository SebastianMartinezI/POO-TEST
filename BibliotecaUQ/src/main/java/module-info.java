module co.edu.uniquindio.poo.bibliotecaUQ {

    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.bibliotecaUQ to javafx.fxml;
    exports co.edu.uniquindio.poo.bibliotecaUQ;
    exports co.edu.uniquindio.poo.bibliotecaUQ.viewController;
    opens co.edu.uniquindio.poo.bibliotecaUQ.viewController to javafx.fxml;

}