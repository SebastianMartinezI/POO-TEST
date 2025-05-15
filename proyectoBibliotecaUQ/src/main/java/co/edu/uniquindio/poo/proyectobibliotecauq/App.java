package co.edu.uniquindio.poo.proyectobibliotecauq;

import co.edu.uniquindio.poo.proyectobibliotecauq.controller.BibliotecarioController;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage primaryStage;
    public static Biblioteca bibliotecaUQ = new Biblioteca("UQ", "Calle 15 N");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Clientes");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudBibliotecario.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            BibliotecarioController bibliotecarioController = loader.getController();
            bibliotecarioController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void inicializarData(){
        Libro libro = new LibroDigital("Cien años de soledad", "Gabriel", "Novela", 1990, Estado.DISPONIBLE, Formato.PDF, "WWW");

        Bibliotecario bibliotecario = new Bibliotecario("Juan", "juan12", "12345", libro, usuario, prestamo);
        bibliotecario.agregarBibliotecario(bibliotecario);
    }

}
