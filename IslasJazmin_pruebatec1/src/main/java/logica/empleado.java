
package logica;


public class empleado {
    //ingreso los atributos del requerimiento
    //para la prueba del menu en consola no agrego el id, sera agregado en bd como primary key
    private String nombre;
     private String apellido;
     private String cargo;
     private double salario;
     private String fechaInicio;  // uso string en vez de localdate para mayor comodidad, aunque puedo poner una excepcion

     //agrego constructor vacio

    public empleado() {
    }
     
    //agrego constructor con atributos

    public empleado(String nombre, String apellido, String cargo, double salario, String fechaInicio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }
    
    //Agregar getters y seters

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
    
}
