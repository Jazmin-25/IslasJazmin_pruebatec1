
package com.softek.islasariadna_pruebatec1.persistencia;

import com.softek.islasariadna_pruebatec1.logica.Empleado;
import com.softek.islasariadna_pruebatec1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
     EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();

    //CREAR
    public void crearEmpleado(Empleado empleado) {
        empleadoJPA.create(empleado);
    }

    //LEER O LISTAR
    public List<Empleado> traerTodos() {
        return empleadoJPA.findEmpleadoEntities();
    }

    //eliminar
    public void eliminaEmpleado(int id) {
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //modificar
    public void modificarEmpleado(Empleado empleado) {
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}

