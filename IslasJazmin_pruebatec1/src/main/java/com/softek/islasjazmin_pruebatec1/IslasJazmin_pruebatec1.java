
package com.softek.islasjazmin_pruebatec1;

import java.util.ArrayList;
import java.util.Scanner;
import logica.empleado;
import persistencia.empleadoPersistencia;


public class IslasJazmin_pruebatec1 {

    public static void main(String[] args) {
        empleadoPersistencia controlPersi = new empleadoPersistencia();
        
             
        //cree un arraylist para poder observar el menu en consola
        ArrayList<empleado> listaEmpleado = new ArrayList<>(); //en la base de datos no utilizo arrays, solo prueba
        Scanner teclado = new Scanner(System.in);

        //en combinación con estructuras como un switch
        
        int opcion = 0;


        //imprimir el menu de opciones de forma atractiva
        System.out.println("                   ▒█▀▀█ ▀█▀ ▒█▀▀▀ ▒█▄░▒█ ▒█░░▒█ ▒█▀▀▀ ▒█▄░▒█ ▀█▀ ▒█▀▀▄ ▒█▀▀▀█  ");
        System.out.println("                   ▒█▀▀▄ ▒█░ ▒█▀▀▀ ▒█▒█▒█ ░▒█▒█░ ▒█▀▀▀ ▒█▒█▒█ ▒█░ ▒█░▒█ ▒█░░▒█  ");
        System.out.println("                   ▒█▄▄█ ▄█▄ ▒█▄▄▄ ▒█░░▀█ ░░▀▄▀░ ▒█▄▄▄ ▒█░░▀█ ▄█▄ ▒█▄▄▀ ▒█▄▄▄█ ");
        System.out.println("   ");
        System.out.println("                               ░█▀▀█     　 ▒█░░░ ░█▀▀█ ");
        System.out.println("                               ▒█▄▄█     　 ▒█░░░ ▒█▄▄█ ");
        System.out.println("                               ▒█░▒█ 　     ▒█▄▄█ ▒█░▒█");
        System.out.println("  ");
        System.out.println("                    ░█▀▀█ ░█▀▀▀ ░█▀▀▀█ ▀▀█▀▀ ▀█▀ ░█▀▀▀█ ░█▄─░█ 　 ░█▀▀▄ ░█▀▀▀ 　");
        System.out.println("                    ░█─▄▄ ░█▀▀▀ ─▀▀▀▄▄ ─░█── ░█─ ░█──░█ ░█░█░█ 　 ░█─░█ ░█▀▀▀ 　");
        System.out.println("                    ░█▄▄█ ░█▄▄▄ ░█▄▄▄█ ─░█── ▄█▄ ░█▄▄▄█ ░█──▀█ 　 ░█▄▄▀ ░█▄▄▄ 　");
        System.out.println("  ");
        System.out.println("                    ░█▀▀▀ ░█▀▄▀█ ░█▀▀█ ░█─── ░█▀▀▀ ─█▀▀█ ░█▀▀▄ ░█▀▀▀█ ░█▀▀▀█ ");
        System.out.println("                    ░█▀▀▀ ░█░█░█ ░█▄▄█ ░█─── ░█▀▀▀ ░█▄▄█ ░█─░█ ░█──░█ ─▀▀▀▄▄ ");
        System.out.println("                    ░█▄▄▄ ░█──░█ ░█─── ░█▄▄█ ░█▄▄▄ ░█─░█ ░█▄▄▀ ░█▄▄▄█ ░█▄▄▄█");
        System.out.println("  ");

// pongo aqui el while porque Solo el menú interactivo debe repetirse en el bucle, no la bienvenido
        while (true) {
            System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║            ░█▀▄▀█ ░█▀▀▀ ░█▄─░█ ░█─░█ 　 ░█▀▀█ ░█▀▀█ ▀█▀ ░█▄─░█ ░█▀▀█ ▀█▀ ░█▀▀█ ─█▀▀█ ░█───         ║");
            System.out.println("║            ░█░█░█ ░█▀▀▀ ░█░█░█ ░█─░█ 　 ░█▄▄█ ░█▄▄▀ ░█─ ░█░█░█ ░█─── ░█─ ░█▄▄█ ░█▄▄█ ░█───         ║");
            System.out.println("║            ░█──░█ ░█▄▄▄ ░█──▀█ ─▀▄▄▀ 　 ░█─── ░█─░█ ▄█▄ ░█──▀█ ░█▄▄█ ▄█▄ ░█─── ░█─░█ ░█▄▄█         ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   ▄█─ ▀▄ 　 ─█▀▀█ ░█─── ▀▀█▀▀ ─█▀▀█                                                                ║");
            System.out.println("║   ─█─ ─█ 　 ░█▄▄█ ░█─── ─░█── ░█▄▄█                                                                ║");
            System.out.println("║   ▄█▄ ▄▀ 　 ░█─░█ ░█▄▄█ ─░█── ░█─░█                                                                ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀█ ▀▄ 　 ░█▀▀█ ─█▀▀█ ───░█ ─█▀▀█                                                                ║");
            System.out.println("║   ─▄▀ ─█ 　 ░█▀▀▄ ░█▄▄█ ─▄─░█ ░█▄▄█                                                                ║");
            System.out.println("║   █▄▄ ▄▀ 　 ░█▄▄█ ░█─░█ ░█▄▄█ ░█─░█                                                                ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀▀█ ▀▄ 　 ░█▀▀█ ░█▀▀▀█ ░█▄─░█ ░█▀▀▀█ ░█─░█ ░█─── ▀▀█▀▀ ─█▀▀█                                    ║");
            System.out.println("║   ──▀▄ ─█ 　 ░█─── ░█──░█ ░█░█░█ ─▀▀▀▄▄ ░█─░█ ░█─── ─░█── ░█▄▄█                                    ║");
            System.out.println("║   █▄▄█ ▄▀ 　 ░█▄▄█ ░█▄▄▄█ ░█──▀█ ░█▄▄▄█ ─▀▄▄▀ ░█▄▄█ ─░█── ░█─░█                                    ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   ─█▀█─ ▀▄ 　 ░█▀▄▀█ ░█▀▀▀█ ░█▀▀▄ ▀█▀ ░█▀▀▀ ▀█▀ ░█▀▀█ ─█▀▀█ ░█▀▀█ ▀█▀ ░█▀▀▀█ ░█▄─░█ ░█▀▀▀ ░█▀▀▀█   ║");
            System.out.println("║   █▄▄█▄ ─█ 　 ░█░█░█ ░█──░█ ░█─░█ ░█─ ░█▀▀▀ ░█─ ░█─── ░█▄▄█ ░█─── ░█─ ░█──░█ ░█░█░█ ░█▀▀▀ ─▀▀▀▄▄   ║");
            System.out.println("║   ───█─ ▄▀ 　 ░█──░█ ░█▄▄▄█ ░█▄▄▀ ▄█▄ ░█─── ▄█▄ ░█▄▄█ ░█─░█ ░█▄▄█ ▄█▄ ░█▄▄▄█ ░█──▀█ ░█▄▄▄ ░█▄▄▄█   ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀▀ ▀▄ 　 ░█▀▀▀█ ─█▀▀█ ░█─── ▀█▀ ░█▀▀█                                                           ║");
            System.out.println("║   ▀▀▄ ─█ 　 ─▀▀▀▄▄ ░█▄▄█ ░█─── ░█─ ░█▄▄▀                                                           ║");
            System.out.println("║   ▄▄▀ ▄▀ 　 ░█▄▄▄█ ░█─░█ ░█▄▄█ ▄█▄ ░█─░█                                                           ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════╝");

            System.out.println("   Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("¡Vamos a dar de alta a un nuevo empleado en el sistema!");
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido del empleado");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingrese el cargo del empleado");
                    String cargo = teclado.nextLine();
                    System.out.println("Ingrese el salario del empleado");
                    double salario = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese la fecha de inicio del empleado (formato dd-mm-yyyy)");
                    String fechaIni = teclado.nextLine();
                    //muestrame al empleado agregadp en la lista
                    listaEmpleado.add(new empleado(nombre, apellido, cargo, salario, fechaIni));

                   // listaEmpleado.add(new Empleado());
                    System.out.println("¡Empleado agregado correctamente al sistema!");
                    break;
                case 2:
                    System.out.println("Vamos a eliminar un empleado del sistema.");
                    System.out.println("Ingrese el nombre del empleado que desea eliminar");
                    String nombreElimina = teclado.nextLine();
                    boolean eliminadi = false; //bandera para saber si se elimino el producto
                    for (int i = 0; i < listaEmpleado.size(); i++) {
                        if (listaEmpleado.get(i).getNombre().equalsIgnoreCase(nombreElimina)) {
                            listaEmpleado.remove(i);
                            eliminadi = true;
                            System.out.println("¡Empleado eliminado exitosamente!");
                            break;
                        }
                    }
                    if (!eliminadi) {
                        System.out.println("No se encontró un empleado con ese nombre. Verifica e intenta nuevamente.");
                    }
                    break;
                case 3:
                    if (listaEmpleado.isEmpty()) {
                        System.out.println("No hay empleados registrados en el sistema");
                    }
                    else {
                        System.out.println("Lista de empleados registrados en el sistema");
                        for (empleado empleado : listaEmpleado) {
                            System.out.println("ID: " + empleado.getId() + ", Nombre: " + empleado.getNombre() +
                                    ", Apellido: " + empleado.getApellido() + ", Cargo: " + empleado.getCargo() +
                                    ", Salario: " + empleado.getSalario() + ", Fecha de inicio: " + empleado.getFechaInicio());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Vamos a modificar la información de un empleado. ");
                    System.out.println("Ingrese el nombre del empleado que desea modificar:");
                    String nombreModificar = teclado.nextLine();
                    System.out.println("Ingrese el apellido del empleado que  desea modificar");
                    boolean encontrado = false;
                    for (empleado empleado : listaEmpleado) {
                        if (empleado.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Empleado encontrado. Ingresa los nuevos datos o presiona Enter para conservar los actuales:");
                            System.out.println("Nuevo nombre del empleado o presione Enter para conservar los actuales: ");
                            String nuevoNombre = teclado.nextLine();
                            if (!nuevoNombre.isEmpty()) {
                                empleado.setNombre(nuevoNombre);
                            }
                            System.out.println("Nuevo apellido o presione Enter para conservar los actuales: ");
                            String nuevoApellido = teclado.nextLine();
                            if (!nuevoApellido.isEmpty()) {
                                empleado.setApellido(nuevoApellido);
                            }
                            System.out.println("Nuevo cargo o presione Enter para conservar los actuales: ");
                            String nuevoCargo = teclado.nextLine();
                            if (!nuevoCargo.isEmpty()) {
                                empleado.setCargo(nuevoCargo);
                            }
                            System.out.println("Nuevo Salario (ingrese -1 para conservar el actual): ");
                            double nuevoSalario = teclado.nextDouble();
                            teclado.nextLine();
                            if (nuevoSalario>0) {
                                empleado.setSalario(nuevoSalario);
                            }
                            System.out.println("Nueva fecha de ingresoo presione Enter para conservar los actuales: ");
                            String nuevaFechaIni = teclado.nextLine();
                            if (!nuevaFechaIni.isEmpty()){
                                empleado.setFechaInicio(nuevaFechaIni);
                            }
                            System.out.println("¡Información del empleado actualizada exitosamente!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un empleado con ese nombre. Intenta nuevamente.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar la aplicación de gestión de empleados. ¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                    break;
            }

        }
    }
}
