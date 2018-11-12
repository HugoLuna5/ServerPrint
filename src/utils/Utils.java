/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author HugoLuna
 */
public class Utils {
    
    
   
    
    public static String[] filesSelector() {

           String nameFiles[] = null;
        try {
            
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setMultiSelectionEnabled(true);

            jfc.setDialogTitle("Selecciona un archivo");
            int returnValue = jfc.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {

                int totalFiles = jfc.getSelectedFiles().length;
                nameFiles = new String[totalFiles];
                for (int i = 0; i < totalFiles; i++) {
                   

                    nameFiles[i] = jfc.getSelectedFiles()[i].getName();

                }

            }

        }catch(NullPointerException nullPointer){
            System.err.println("Error: "+nullPointer.getMessage());

        }catch (OutOfMemoryError outOfMemoryError){
            System.err.println("Error: "+outOfMemoryError.getMessage());
        }


        return nameFiles;

    }

    
}
