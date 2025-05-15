package co.edu.uniquindio.poo.bibliotecaUQ.viewController;

import co.edu.uniquindio.poo.bibliotecaUQ.App;
import co.edu.uniquindio.poo.bibliotecaUQ.controller.AdministradorController;
import co.edu.uniquindio.poo.bibliotecaUQ.model.Empleado;
import co.edu.uniquindio.poo.bibliotecaUQ.model.TipoEmpleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdministradorViewController {

    private AdministradorController administradorController;
    private ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    private Empleado selectedEmpleado;
    private App app;

    @FXML private TableView<Empleado> tblListEmpleado;
    @FXML private TableColumn<Empleado, String> tbcNombre;
    @FXML private TableColumn<Empleado, String> tbcUsuario;
    @FXML private ComboBox<TipoEmpleado> cmbTipo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;
    @FXML private Button btnAgregar, btnEliminar, btnLimpiar;

    @FXML
    public void initialize() {
        administradorController = new AdministradorController(app.getControladorEmpleado());
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
        listEmpleados.addAll(administradorController.controladorEmpleado.obtenerEmpleados());
    }

    private void listenerSelection() {
        tblListEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, old, selected) -> {
            selectedEmpleado = selected;
            if (selected != null) {
                txtNombre.setText(selected.getNombre());
                txtUsuario.setText(selected.getUsuario());
                cmbTipo.setValue(selected.getTipo());
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
        );

        if (administradorController.registrarEmpleado(empleado.getNombre(), empleado.getUsuario(), empleado.getContrasena(), empleado.getTipo())) {
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