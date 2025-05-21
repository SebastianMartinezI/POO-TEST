package co.edu.uniquindio.poo.proyectobibliotecauq.viewController;
import co.edu.uniquindio.poo.proyectobibliotecauq.App;
import co.edu.uniquindio.poo.proyectobibliotecauq.controller.AdministradorController;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.Bibliotecario;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.Empleado;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.TipoEmpleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AdministradorViewController {

    private AdministradorController administradorController;
    private ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    private Empleado selectedEmpleado;
    private App app;

    @FXML
    private TableView<Empleado> tblListEmpleado;
    @FXML
    private TableColumn<Empleado, String> tbcNombre;
    @FXML
    private TableColumn<Empleado, String> tbcUsuario;
    @FXML
    private ComboBox<TipoEmpleado> cmbTipo;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena;
    @FXML
    private Button btnAgregar, btnEliminar, btnLimpiar;

    @FXML
    public void initialize() {
        this.app=app;
        administradorController = new AdministradorController(app.proyectoBibliotecaUQ);
        initView();
    }

    private void initView() {
        cmbTipo.setItems(FXCollections.observableArrayList(TipoEmpleado.values()));
        initDataBinding();
        obtenerEmpleados();
        tblListEmpleado.setItems(listEmpleados);
        listenerSelection();
    }

    private void initDataBinding() {
        tbcNombre.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        tbcUsuario.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getUsuario()));
    }

    private void obtenerEmpleados() {
        listEmpleados.clear();
        listEmpleados.addAll(administradorController.gestionEmpleado.obtenerEmpleados());
    }

    private void listenerSelection() {
        tblListEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, old, selected) -> {
            selectedEmpleado = selected;
            if (selected != null) {
                txtNombre.setText(selected.getNombre());
                txtUsuario.setText(selected.getUsuario());
                cmbTipo.setValue(selected.getTipoEmpleado());
            }
        });
    }

    @FXML
    private void onAgregarEmpleado() {
        Empleado empleado = new Empleado(
                txtNombre.getText(),
                txtUsuario.getText(),
                txtContrasena.getText(),
                cmbTipo.getValue()
        ) {
            @Override
            public void mostrarRol() {

            }

            @Override
            public void agregarBibliotecario(Bibliotecario bibliotecario) {

            }
        };

        if (administradorController.registrarEmpleado(empleado.getNombre(), empleado.getUsuario(), empleado.getContrasena(), empleado.getTipoEmpleado())) {
            listEmpleados.add(empleado);
            limpiarCampos();
        }
    }

    @FXML
    private void onEliminarEmpleado() {
        if (selectedEmpleado != null) {
            administradorController.eliminarEmpleado(selectedEmpleado.getUsuario());
            listEmpleados.remove(selectedEmpleado);
            limpiarCampos();
        }
    }

    @FXML
    private void onLimpiar() {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtUsuario.clear();
        txtContrasena.clear();
        cmbTipo.getSelectionModel().clearSelection();
        tblListEmpleado.getSelectionModel().clearSelection();
    }

    public void setApp(App app) {
        this.app = app;
    }
}

