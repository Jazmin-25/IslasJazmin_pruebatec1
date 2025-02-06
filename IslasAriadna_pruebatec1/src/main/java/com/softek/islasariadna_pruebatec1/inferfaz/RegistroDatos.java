
package com.softek.islasariadna_pruebatec1.inferfaz;

import com.softek.islasariadna_pruebatec1.logica.Empleado;
import java.util.List;
import java.util.Scanner;


public class RegistroDatos {//Aqui se registra a los empleados 
    private static final Scanner teclado = new Scanner(System.in);

    public static Empleado capturaEmpleado() {
        String nombre = capturarDatos("nombre");
        String apellido = capturarDatos("apellido");
        String cargo = capturarDatos("cargo");
        double salario = capturarSalario(); // uso double directamente porque con mayuscula me sale error
        String fechaInicio = capturarFechaIngreso(); // Uso String directamente porque sale erro en el parametro

        return new Empleado(0, nombre, apellido, cargo, salario, fechaInicio);
    }

    private static String capturarDatos(String campo) {
        String dato;
        while (true) {
            System.out.print("\nIngrese el " + campo + " del empleado: ");
            dato = teclado.nextLine().trim().toUpperCase();
            if (dato.isEmpty()) {
                System.out.println("\nEl " + campo + " ingresado no puede estar vacío. Por favor, inténtelo nuevamente.");
            } else if (!dato.matches("^[a-zA-Z]+$")) {
                System.out.println("\nEl " + campo + " debe contener únicamente letras. Verifique e intente de nuevo.");
            } else {
                System.out.println("\nDato registrado correctamente: " + campo);
                return dato;
            }
        }
    }

    private static double capturarSalario() {
        while (true) {
            System.out.print("\nIngrese el salario del empleado (Debe ser menor a $100,000,000.00, sin símbolos): ");
            String entrada = teclado.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("\nEl campo de salario no puede estar vacío. Por favor, intente nuevamente.");
            } else {
                try {
                    double salario = Double.parseDouble(entrada);
                    if (salario <= 0) {
                        System.out.println("\nEl salario debe ser mayor a 0. Intente nuevamente.");
                    } else if (salario >= 100000000.00) {
                        System.out.println("\nEl salario debe ser menor a 100,000,000.00. Intente nuevamente.");
                    } else {
                        System.out.printf("\nSalario ingresado correctamente: $%.2f%n", salario);
                        return salario;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nEl salario debe ser un número válido. Intente nuevamente.");
                }
            }
        }
    }

    private static String capturarFechaIngreso() {
        while (true) {
            System.out.print("\nIngrese la fecha de ingreso del empleado (dd-MM-yyyy): ");
            String fechaTexto = teclado.nextLine().trim();
            if (fechaTexto.isEmpty()) {
                System.out.println("\nLa fecha no puede estar vacía. Intente nuevamente.");
            } else if (!fechaTexto.matches("\\d{2}-\\d{2}-\\d{4}")) { //cumpliendo el formato (dd-MM-yyyy)
                System.out.println("\nFormato de fecha incorrecto. Use dd-MM-yyyy. Intente nuevamente.");
            } else {
                System.out.println("\nFecha de ingreso ingresada correctamente: " + fechaTexto);
                return fechaTexto;
            }
        }
    }

    public static int capturarId(String accion) {
        while (true) {
            System.out.print("\nID del Empleado a " + accion + ": ");
            String entrada = teclado.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("\nEl ID no puede estar vacío. Intente nuevamente.");
            } else {
                try {
                    int id = Integer.parseInt(entrada);
                    return id;
                } catch (NumberFormatException e) {
                    System.out.println("\nEl ID debe ser un número válido. Intente nuevamente.");
                }
            }
        }
    }

    public static String capturarCargo() {
        while (true) {
            System.out.print("\nIngrese el cargo del empleado: ");
            String cargo = teclado.nextLine().trim();
            if (cargo.isEmpty()) {
                System.out.println("\nEl cargo no puede estar vacío. Intente nuevamente.");
            } else {
                return cargo;
            }
        }
    }

    public static void mostrarEmpleados(List<Empleado> todosEmpleados) {
        for (Empleado empleado : todosEmpleados) {
            System.out.println(empleado);
        }
    }
}
