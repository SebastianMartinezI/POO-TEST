package co.edu.uniquindio.poo.proyectobibliotecauq.viewController;

import co.edu.uniquindio.poo.proyectobibliotecauq.App;
import co.edu.uniquindio.poo.proyectobibliotecauq.controller.BibliotecarioController;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;
        import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class BibliotecarioViewController {

    private BibliotecarioController bibliotecarioController;
    private ObservableList<Libro> listLibros = FXCollections.observableArrayList();
    private ObservableList<Persona> listUsuarios = FXCollections.observableArrayList();
    private ObservableList<Prestamo> listPrestamos = FXCollections.observableArrayList();
    private App app;

    @FXML private TextField txtTitulo, txtAutor, txtGenero, txtAnio, txtPaginas, txtUbicacion, txtEditorial;
    @FXML private ComboBox<Formato> cmbFormato;
    @FXML private TextField txtLinkDescarga, txtReferencia;

    @FXML private TextField txtNombre, txtApellido, txtCedula, txtCorreo, txtId, txtLimite;
    @FXML private ComboBox<TipoEmpleado> cmbTipoUsuario;

    @FXML private TableView<Libro> tblLibros;
    @FXML private TableColumn<Libro, String> tbcTitulo, tbcAutor;

    @FXML private TableView<Persona> tblUsuarios;
    @FXML private TableColumn<Persona, String> tbcNombreUsuario, tbcCedulaUsuario;

    @FXML private TableView<Prestamo> tblPrestamos;
    @FXML private TableColumn<Prestamo, String> tbcLibroPrestado, tbcUsuarioPrestamo, tbcFechaDevolucion;

    @FXML private Button btnAgregarLibro, btnAgregarUsuario, btnPrestar, btnDevolver, btnGenerarReporte;

    @FXML
    public void initialize() {
        this.app = app;
        bibliotecarioController = new BibliotecarioController(app.proyectoBibliotecaUQ);
        initTablas();
        cargarDatos();
    }

    private void initTablas() {
        // Tabla de libros
        tbcTitulo.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getTitulo()));
        tbcAutor.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getAutor()));
        tblLibros.setItems(listLibros);

        // Tabla de usuarios
        tbcNombreUsuario.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        tbcCedulaUsuario.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCedula()));
        tblUsuarios.setItems(listUsuarios);

        // Tabla de préstamos
        tbcLibroPrestado.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getLibro().getTitulo()));
        tbcUsuarioPrestamo.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getUsuario().getNombre()));
        tbcFechaDevolucion.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getFechaDevolucion().toString()));
        tblPrestamos.setItems(listPrestamos);
    }

    private void cargarDatos() {
        listLibros.setAll(bibliotecarioController.obtenerLibros());
        listUsuarios.setAll(bibliotecarioController.obtenerUsuarios());
        listPrestamos.setAll(bibliotecarioController.obtenerPrestamos());
    }

    @FXML
    private void onAgregarLibro() {
        bibliotecarioController.registrarLibroFisico(
                txtTitulo.getText(),
                txtAutor.getText(),
                txtGenero.getText(),
                Integer.parseInt(txtAnio.getText()),
                Estado.DISPONIBLE,
                Integer.parseInt(txtPaginas.getText()),
                txtUbicacion.getText(),
                txtEditorial.getText()
        );
        cargarDatos();
    }

    @FXML
    private void onAgregarUsuario() {
        bibliotecarioController.registrarEstudiante(
                txtNombre.getText(),
                txtApellido.getText(),
                txtCedula.getText(),
                txtCorreo.getText(),
                Integer.parseInt(txtLimite.getText()),
                txtId.getText()
        );
        cargarDatos();
    }

    @FXML
    private void onPrestarLibro() {
        Libro libro = tblLibros.getSelectionModel().getSelectedItem();
        Persona usuario = tblUsuarios.getSelectionModel().getSelectedItem();
        if (libro != null && usuario != null) {
            bibliotecarioController.prestarLibro(usuario, libro);
            cargarDatos();
        }
    }

    @FXML
    private void onDevolverLibro() {
        Prestamo prestamo = tblPrestamos.getSelectionModel().getSelectedItem();
        if (prestamo != null) {
            bibliotecarioController.devolverLibro(prestamo.getLibro());
            cargarDatos();
        }
    }

    @FXML
    private void onGenerarReporte() {
        List<Prestamo> tarde = bibliotecarioController.obtenerDevolucionesTardias();
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Reporte de Devoluciones Tardías");
        alerta.setHeaderText("Total devoluciones tardías: " + tarde.size());
        alerta.setContentText("Ver consola para detalles.");
        alerta.show();

        for (Prestamo p : tarde) {
            System.out.println("TARDÍA → Usuario: " + p.getUsuario().getNombre() + ", Libro: " + p.getLibro().getTitulo());
        }
    }

    public void setApp(App app) {
        this.app = app;
    }
}

