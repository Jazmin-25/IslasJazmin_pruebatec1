
package com.softek.islasariadna_pruebatec1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado", schema = "empleado")
public class Empleado implements Serializable {
    //ingreso los atributos del requerimiento    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     private String nombre;
     private String apellido;
     private String cargo;
     private double salario;
     private String fechaInicio;  // uso string en vez de localdate para mayor comodidad
     
     
     //constructor vacio

    public Empleado() {
    }
     
    //constructor con atributos

    public Empleado(int id, String nombre, String apellido, String cargo, double salario, String fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }
    
    //agregar getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
    //tostring

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", salario=" + salario + ", fechaInicio=" + fechaInicio + '}';
    }
    //Empleado 1 Ariadna Islas Analista Programador 15.555 fechaInicio 02/02/2025
}
