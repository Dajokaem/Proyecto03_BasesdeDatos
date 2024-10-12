package Clases;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long DPI;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String Direccion;
    private long Telefono;
    private long celular;
    private double salario;
    private double bonificacion;

    public empleado(long DPI, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, String Direccion, long Telefono, long celular, double salario, double bonificacion) {
        this.DPI = DPI;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.celular = celular;
        this.salario = salario;
        this.bonificacion = bonificacion;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Override
public String toString() {
    return "Empleado {" +
            "id=" + id +
            ", DPI=" + DPI +
            ", PrimerNombre='" + PrimerNombre + '\'' +
            ", SegundoNombre='" + SegundoNombre + '\'' +
            ", PrimerApellido='" + PrimerApellido + '\'' +
            ", SegundoApellido='" + SegundoApellido + '\'' +
            ", Direccion='" + Direccion + '\'' +
            ", Telefono=" + Telefono +
            ", Celular=" + celular +
            ", Salario=" + salario +
            ", Bonificacion=" + bonificacion +
            '}';
}

}
