/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecompuword;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lava0
 */
public class Proyecompuword {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;
        
      
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Eliminar empleado");
            System.out.println("3. Mostrar lista de empleados");
            System.out.println("4. Mostrar Reporte de Empleado");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del empleado: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese al departamento del empleado: ");
                    String departamento = scanner.nextLine();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextInt();
                    System.out.print("Ingrese puntaje del empleado: ");
                    double puntaje = scanner.nextInt();
                    scanner.nextLine();
                    empleados.add(new Empleado(id,nombre,departamento,salario,puntaje));
                    System.out.println("Empleado agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    empleados.removeIf(emp -> emp.getId() == idEliminar);
                    System.out.println("Empleado eliminado.");
                    break;
                case 3:
                    System.out.println("\n--- Lista de Empleados ---");
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (Empleado emp : empleados) {
                            System.out.println(emp);
                        }
                    }
                    break;  
                case 4:
                    System.out.println("ingrese el ID del empleado");
                    int reporte=scanner.nextInt();
                    for (int i = 0; i < empleados.size(); i++) {  
                        if (reporte == empleados.get(i).getId()) {  
                            System.out.println("ID del empleado: " + empleados.get(i).getId());  
                            System.out.println("Nombre del empleado: " + empleados.get(i).getNombre());  
                            System.out.println("Departamento: " + empleados.get(i).getDepartamento()); 
                            System.out.println("salario: " + empleados.get(i).getSalario());
                                System.out.println("Puntaje: " + empleados.get(i).getPuntaje());
                        }
                    }
                    break; 
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
    
    
