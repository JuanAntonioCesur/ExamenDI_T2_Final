package com.mycompany.hellojasper;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import net.sf.jasperreports.engine.JRException;

public class PrimaryController {

    @FXML
    private Button primaryButton;
        
    @FXML
    public TableColumn colnombre;
    @FXML
    public TableColumn colapellidos;
    @FXML
    public TableColumn colAD;
    @FXML
    public TableColumn colSGE;
    @FXML
    public TableColumn colDI;
    @FXML
    public TableColumn colPMDM;
    @FXML
    public TableColumn colPSP;
    @FXML
    public TableColumn colEIE;
    @FXML
    public TableColumn colHLC;
    
    @FXML
    public TextField tfnewnombre;
    @FXML
    public TextField tfnewapellidos;
    @FXML
    public TextField tfnewAD;
    @FXML
    public TextField tfnewSGE;
    @FXML
    public TextField tfnewDI;
    @FXML
    public TextField tfnewPMDM;
    @FXML
    public TextField tfnewPSP;
    @FXML
    public TextField tfnewEIE;
    @FXML
    public TextField tfnewHLC;
    
    

    @FXML
    private void verInforme(ActionEvent event) {
        try {
            //Informe.showReport( tipo.getText() );
            Informe.showReport();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Informe.pdfReport( tipo.getText() );
            Informe.pdfReport();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
