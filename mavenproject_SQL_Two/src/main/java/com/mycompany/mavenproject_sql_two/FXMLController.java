package com.mycompany.mavenproject_sql_two;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {

    //=== Anchor panes ====== 
    @FXML
    private Label label;
    //======= Combo box declaration ===========================   
    @FXML
    private ComboBox<String> ComboBox2TableCreation;
    @FXML
    private ComboBox<String> ComboBox3TableCreation;
    ObservableList<String> list1 = FXCollections.observableArrayList("Add", "Delete");
    ObservableList<String> list2 = FXCollections.observableArrayList("INTEGER", "TEXT", "NUMERIC");
    @FXML
    private TextField textField1TableStructure;
    @FXML
    private TextField textField2TableStructure;
    //=============== List view ===============================
//    @FXML
    private ListView<String> listViewOne;
    ObservableList<String> items; 
    ObservableList<String> items1= FXCollections.observableArrayList("Julia", "Ian");

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ComboBox2TableCreation.setItems(list1);
        ComboBox3TableCreation.setItems(list2);
       // listViewOne.setItems(items1);
        System.out.println(items1);
    }

    @FXML
    public void ButtonAction1() {
        String name = textField1TableStructure.getText();
        if (textField1TableStructure.getText().trim().equals("")) {
            textField2TableStructure.setText("Enter table name. No table created.");
        } else {
            SQLCon myCon1 = new SQLCon();
            String response = myCon1.conection(name);
            textField2TableStructure.setText(response);            
        }
        SQLCon myCon2 = new SQLCon();
        items = myCon2.conection1();
        //listViewOne.setItems(items1);
    }
}
