module co.edu.poli.Examen1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.Examen1.controlador to javafx.fxml;
    
    exports co.edu.poli.Examen1.vista;
}
