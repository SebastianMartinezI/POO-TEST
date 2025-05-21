package co.edu.uniquindio.poo.proyectobibliotecauq.viewController;

import co.edu.uniquindio.poo.proyectobibliotecauq.App;
import co.edu.uniquindio.poo.proyectobibliotecauq.controller.AdministradorController;
import co.edu.uniquindio.poo.proyectobibliotecauq.controller.BibliotecarioController;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class LoginViewController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;
    @FXML private Label lblMensaje;

    private App app;

    @FXML
    private void onLogin() {
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        Empleado empleado = autenticar(usuario, contrasena);

        if (empleado != null) {
            lblMensaje.setText("");

            if (empleado.getTipoEmpleado() == TipoEmpleado.ADMINISTRADOR) {
                cargarVentana("/fxml/crudAdministrador.fxml", "Administrador");
            } else if (empleado.getTipoEmpleado() == TipoEmpleado.BIBLIOTECARIO) {
                cargarVentana("/fxml/crudBibliotecario.fxml", "Bibliotecario");
            }

        } else {
            lblMensaje.setText("Credenciales incorrectas");
        }
    }

    private Empleado autenticar(String usuario, String contrasena) {
        // Aquí puedes simular la lista de empleados registrada
        if (usuario.equals("admin") && contrasena.equals("admin123")) {
            return new Empleado("Administrador", "admin", "admin123", TipoEmpleado.ADMINISTRADOR) {
                @Override public void mostrarRol() {}
            };
        }

        if (usuario.equals("biblio") && contrasena.equals("biblio123")) {
            return new Empleado("Bibliotecario", "biblio", "biblio123", TipoEmpleado.BIBLIOTECARIO) {
                @Override public void mostrarRol() {}
            };
        }

        return null;
    }

    private void cargarVentana(String rutaFXML, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();

            // Cerrar ventana de login
            Stage actual = (Stage) txtUsuario.getScene().getWindow();
            actual.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setApp(App app) {
        this.app = app;
    }
}
