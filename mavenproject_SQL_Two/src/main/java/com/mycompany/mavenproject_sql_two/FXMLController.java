package com.mycompany.mavenproject_sql_two;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {
    
    //=== Anchor panes ======
 
    @FXML
    private Label label;
    
    //======= Combo box declaration ===========================
    @FXML
    private ComboBox<String> ComboBox1TableCreation;
    ObservableList<String> list1 = FXCollections.observableArrayList("Steel, ASTM A514", "Stainless steel, AISI304", "Aluminum, 6061-T6");
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ComboBox1TableCreation.setItems(list1);
    }    
}
