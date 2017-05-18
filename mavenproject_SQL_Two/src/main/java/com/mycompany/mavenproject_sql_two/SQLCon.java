package com.mycompany.mavenproject_sql_two;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 *
 * @author jaroslaw.ziolkowski
 */
public class SQLCon {
    
    public String conection(String name) {
        String response = "";
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:DatabaseJarek.db");
            Statement stm = c.createStatement();
            String sqlCreate = "CREATE TABLE "+name+" (imie text,"
                    + "nazwisko text,"
                    + "wiek integer);";
            stm.execute(sqlCreate);
            stm.close();
            c.close();
            response = "Table created";
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            response = "Table already exists!!!";
        }
        return response;
    }
    
    public ObservableList<String> conection1() {
        ObservableList<String> items =FXCollections.observableArrayList ();
        try {
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:DatabaseJarek.db");            
            DatabaseMetaData md = conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);             
            while (rs.next()) {
                System.out.println(rs.getString(3));
                items.add(rs.getString(3));
            }
            conn.close();                      
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
            System.out.println("===");
            System.out.println(items);
            
            return items;
            
    }

}
