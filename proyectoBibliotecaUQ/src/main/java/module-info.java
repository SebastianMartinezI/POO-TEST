module co.edu.uniquindio.poo.proyectobibliotecauq {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.proyectobibliotecauq to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectobibliotecauq;
}