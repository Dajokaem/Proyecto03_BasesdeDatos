/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jos56
 */
public class Bases {
    public static List<empleado> General = null;
    
    public static  List<empleado> MyEmps = null;
    public static  List<empleado> PostEmps = null;
    static FileWriter registro = null;
    public static void escribir(String linea){
        try {
            registro = new FileWriter("Registro.txt", true);
            registro.write(linea+"\n");
            registro.close();
        } catch (IOException ex) {
            Logger.getLogger(Bases.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
