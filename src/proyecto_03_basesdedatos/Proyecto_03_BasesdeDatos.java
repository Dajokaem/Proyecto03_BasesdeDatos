/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_03_basesdedatos;

import GUI.MostrarTodo_MySQL;
import GUI.MostrarTodo_Postgre;
import GUI.NewJFrame;
import GUI.Principal;
import GUI.menu_mysql;
import Clases.Bases;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author jos56
 */
public class Proyecto_03_BasesdeDatos {

    public static void main(String[] args) {
        /*
        System.out.println("Iniciando la aplicación..."); // Para confirmar que main se ejecuta.
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
            System.out.println("Ventana Principal mostrada."); // Para confirmar que se creó el JFrame.
        });
        */
        System.out.println("Hola, esto es una prueba");
        int a = 4564+1;
        System.out.println(a);
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fecha.format(formato);
        Bases.escribir("**********"+fechaHoraFormateada+"****************");
        
       Principal p = new Principal();
       p.show();
    }

}
