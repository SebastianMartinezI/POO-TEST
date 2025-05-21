package co.edu.uniquindio.poo.proyectobibliotecauq;

import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal que lanza la aplicación JavaFX y carga la pantalla de login.
 */
public class App extends Application {

    public Biblioteca biblioteca = new Biblioteca("UQ", "Calle 15 N");
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Biblioteca UQ - Login");

        inicializarDatos(); // Datos simulados

        // Cargar login.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Inicializa datos de prueba (usuarios predefinidos).
     */
    private void inicializarDatos() {
        // Puedes simular empleados para el login
        Administrador administrador = new Administrador("Admin", "admin", "admin123", TipoEmpleado.ADMINISTRADOR);
        Bibliotecario bibliotecario = new Bibliotecario("Biblio", "biblio", "biblio123", TipoEmpleado.BIBLIOTECARIO);

        administrador.registrarEmpleado("Admin", "admin", "admin123", TipoEmpleado.ADMINISTRADOR);
        biblioteca.agregarEmpleado(bibliotecario);

        Libro l1 = new LibroFisico("Don Quijote", "Cervantes", "Novela", 1605, Estado.DISPONIBLE, 400, "Estantería A", "Planeta");
        biblioteca.agregarLibro(l1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

