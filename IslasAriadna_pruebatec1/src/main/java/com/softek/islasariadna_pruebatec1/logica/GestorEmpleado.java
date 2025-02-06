
package com.softek.islasariadna_pruebatec1.logica;

import com.softek.islasariadna_pruebatec1.inferfaz.InterfazUsuario;
import com.softek.islasariadna_pruebatec1.inferfaz.RegistroDatos;
import com.softek.islasariadna_pruebatec1.persistencia.ControladoraPersistencia;
import com.softek.islasariadna_pruebatec1.persistencia.exceptions.CargoNoExisteException;
import com.softek.islasariadna_pruebatec1.persistencia.exceptions.IdNoExisteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestorEmpleado {//controladora global, todos los metodos del CRUD van aqui
    
    //CREAR
    public static void crearEmpleado (Empleado empleado, ControladoraPersistencia ControlPersis){
        ControlPersis.crearEmpleado(empleado);
        System.out.println("El empleado ha sido registrado exitosamente en el sistema");
    }
    
    //LEER TODOS LOS DATOS
    public static List<Empleado> consultarTodos(ControladoraPersistencia controlPersi) {
        return controlPersi.traerTodos();
    }
    // CONSULTAR POR CARGO
    public static List<Empleado> consultarPorCargo(String cargo, ControladoraPersistencia controlPersi) {
        List<Empleado> todosEmpleados = controlPersi.traerTodos();
        List<Empleado> empleadoCargo = new ArrayList<>();

        for (Empleado empleado : todosEmpleados) {
            if (empleado.getCargo().equalsIgnoreCase(cargo)) {
                empleadoCargo.add(empleado);
            }
        }

        try {
            if (empleadoCargo.isEmpty()) {
                throw new CargoNoExisteException("No se encontraron empleados con el cargo: " + cargo);
            }
        } catch (CargoNoExisteException e) {
            InterfazUsuario.mostrarOpcionInvalida();
            System.out.println(e.getMessage());
        }

        return empleadoCargo;
    }

    // EDITAR (ACTUALIZAR)
    public static void editarEmpleado(int id, ControladoraPersistencia controlPersis) {
        List<Empleado> todosEmpleados = controlPersis.traerTodos();
        boolean empleadoEncontrado = false;

        for (Empleado empleado : todosEmpleados) {
            if (empleado.getId() == id) {
                empleadoEncontrado = true;
                System.out.println(empleado);
                System.out.println("\n¿Desea modificar este empleado? (S/N):");
                Scanner teclado = new Scanner(System.in);
                String modificar = teclado.nextLine();

                if (modificar.equalsIgnoreCase("S")) {
                    System.out.println("\nPor favor, ingrese los nuevos datos del empleado:");
                    Empleado empleadoModificado = RegistroDatos.capturaEmpleado();
                    empleadoModificado.setId(id);
                    controlPersis.modificarEmpleado(empleadoModificado);
                    System.out.println("La información del empleado ha sido actualizada exitosamente.");
                } else {
                    System.out.println("No se modificó el empleado.");
                }
            }
        }

        try {
            if (!empleadoEncontrado) {
                throw new IdNoExisteException("No se encontró ningún empleado con el ID: " + id);
            }
        } catch (IdNoExisteException e) {
            InterfazUsuario.mostrarOpcionInvalida();
            System.out.println(e.getMessage());
        }
    }

    // ELIMINAR
    public static void eliminarEmpleado(int id, ControladoraPersistencia controlPersi) {
        List<Empleado> todosEmpleados = controlPersi.traerTodos();
        boolean empleadoEncontrado = false;
        Scanner teclado = new Scanner(System.in);

        for (Empleado empleado : todosEmpleados) {
            if (empleado.getId() == id) {
                empleadoEncontrado = true;
                System.out.println(empleado);
                System.out.println("\n¿Está seguro de que desea eliminar este empleado permanentemente? (S/N):");
                String eliminar = teclado.nextLine().trim().toUpperCase();

                if (eliminar.equals("S")) {
                    controlPersi.eliminaEmpleado(id);
                    System.out.println("El empleado ha sido eliminado exitosamente del sistema.");
                } else {
                    System.out.println("No se eliminó al empleado.");
                }
            }
        }

        if (!empleadoEncontrado) {
            try {
                throw new IdNoExisteException("Ningún empleado actualmente tiene el ID " + id);
            } catch (IdNoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}// las excepciones van en su paqueteria
