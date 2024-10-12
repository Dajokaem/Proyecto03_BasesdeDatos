/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import PersistenciaMySQL.empleadoJpaControllerMySQL;
import PersistenciaMySQL.exceptions.NonexistentEntityException;
import PersistenciaPostgreSQL.empleadoJpaControllerPostgreSQL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jos56
 */
public class Control {

    empleadoJpaControllerMySQL mysql = new empleadoJpaControllerMySQL();
    empleadoJpaControllerPostgreSQL postgre = new empleadoJpaControllerPostgreSQL();

    public Control() {

    }

    public void InsertarEmpleadoPostGre(empleado emp) {
        try {
            postgre.create(emp);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarEmpleadoMySQL(empleado emp) {
        try {
            mysql.create(emp);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<empleado> TraerEmpleadosMySQL() {
        return mysql.findempleadoEntities();
    }

    public List<empleado> TraerEmpladosPost() {
        return postgre.findempleadoEntities();
    }

    public List<empleado> TraerEmpladosMySQL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void EliminarTodo()  {
        System.out.println("Entro");
        List<empleado> mytodo = mysql.findempleadoEntities();
        List<empleado> posttodo = postgre.findempleadoEntities();
        System.out.println(mytodo.size());
        for (int i = 0; i < mytodo.size(); i++) {
            try {
                mysql.destroy(mytodo.get(i).getId());
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        for (int i = 0; i < posttodo.size(); i++) {

            try {
                postgre.destroy(posttodo.get(i).getId());
            } catch (PersistenciaPostgreSQL.exceptions.NonexistentEntityException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        for(int i = 0; i<Bases.General.size();i++ ){
            try {
                System.out.println("insercion");
                mysql.create(Bases.General.get(i));
                postgre.create(Bases.General.get(i));
            } catch (Exception ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        Bases.General = null;
        Bases.MyEmps = null;
        Bases.PostEmps = null;

    }
}
