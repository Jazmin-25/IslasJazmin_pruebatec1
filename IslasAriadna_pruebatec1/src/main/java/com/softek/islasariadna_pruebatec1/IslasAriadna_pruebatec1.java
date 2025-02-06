

package com.softek.islasariadna_pruebatec1;

import com.softek.islasariadna_pruebatec1.inferfaz.InterfazUsuario;
import com.softek.islasariadna_pruebatec1.inferfaz.RegistroDatos;
import com.softek.islasariadna_pruebatec1.logica.Empleado;
import static com.softek.islasariadna_pruebatec1.logica.GestorEmpleado.consultarPorCargo;
import static com.softek.islasariadna_pruebatec1.logica.GestorEmpleado.consultarTodos;
import static com.softek.islasariadna_pruebatec1.logica.GestorEmpleado.crearEmpleado;
import static com.softek.islasariadna_pruebatec1.logica.GestorEmpleado.editarEmpleado;
import static com.softek.islasariadna_pruebatec1.logica.GestorEmpleado.eliminarEmpleado;
import com.softek.islasariadna_pruebatec1.persistencia.ControladoraPersistencia;
import java.util.List;


public class IslasAriadna_pruebatec1 {

    public static void main(String[] args) {//main
     ControladoraPersistencia controlPersi = new ControladoraPersistencia();
        boolean salir = false;

        while (!salir) {
            int opcion = InterfazUsuario.mostrarMenu();
            switch (opcion) {
                case 1:
                    Empleado nuevoEmpleado = RegistroDatos.capturaEmpleado();
                    crearEmpleado(nuevoEmpleado, controlPersi);
                    break;
                case 2:
                    List<Empleado> todos = consultarTodos(controlPersi);
                    RegistroDatos.mostrarEmpleados(todos);
                    break;
                case 3:
                    String cargo = RegistroDatos.capturarCargo();
                    List<Empleado> empleadosPorCargo = consultarPorCargo(cargo, controlPersi);
                    RegistroDatos.mostrarEmpleados(empleadosPorCargo);
                    break;
                case 4:
                    int idModificar = RegistroDatos.capturarId("modificar");
                    editarEmpleado(idModificar, controlPersi);
                    break;
                case 5:
                    int idEliminar = RegistroDatos.capturarId("eliminar");
                    eliminarEmpleado(idEliminar, controlPersi);
                    break;
                case 6:
                    InterfazUsuario.mostrarDespedida();
                    salir = true;
                    break;
                default:
                    InterfazUsuario.mostrarOpcionInvalida();
            }
        }
    }
}
