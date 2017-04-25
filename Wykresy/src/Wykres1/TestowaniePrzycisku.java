/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wykres1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author jaroslaw.ziolkowski
 */
public class TestowaniePrzycisku {

    
    public static void main(String[] args) {

        JFileChooser chooserOne = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        String filename = JOptionPane.showInputDialog("Name this file");
        chooserOne.setSelectedFile(new File(filename + ".png"));
        BufferedWriter writer;
        int returnValue = chooserOne.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooserOne.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            String my = selectedFile.getAbsolutePath();
                        
            //===================== Zapisywanie pliku =========================
            try {
                writer = new BufferedWriter(new FileWriter(my,false));
                JOptionPane.showMessageDialog(null, "File has been saved", "File Saved", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                e.printStackTrace();
            }
            //=================================================================
        }

    }
}
