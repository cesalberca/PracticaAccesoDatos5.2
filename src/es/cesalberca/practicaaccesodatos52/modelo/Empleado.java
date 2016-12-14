package es.cesalberca.practicaaccesodatos52.modelo;

import java.util.Date;

/**
 * Created by Cesar
 */
public class Empleado {
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;
    private double salario;
    private Date fechaContratacion;

    public Empleado(String email, String nombre, String apellido, String telefono, double salario, Date fechaContratacion) {
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
