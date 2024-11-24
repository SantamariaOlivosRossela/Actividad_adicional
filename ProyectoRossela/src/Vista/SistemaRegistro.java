/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.GestionLenguaje;
import Modelo.lenguajeProgramacion;
import java.util.Scanner;

/**
 *
 * @author Rossela Santamaria
 */
public class SistemaRegistro {
     private static GestionLenguaje gestionLenguaje = new GestionLenguaje();  

    public static void main(String[] args) {  
        menu();  
    }  

    public static void menu() {  
        Scanner lector = new Scanner(System.in);  
        int opcion;  

        do {  
             String opciones = """
                                  ----------------------------------------------
                                                   Selecione una opcion                
                                  ----------------------------------------------
                                  1. Agregar Lenguaje
                                  2. Buscar Lenguaje
                                  3. Eliminar Lenguaje
                                  4. Imprimir Lenguajes
                                  5. Salir
                                  ----------------------------------------------
                                  Elija una de las opciones ya brindadas
                                  """;
        System.out.printf(opciones);
          opcion = lector.nextInt();  
            lector.nextLine(); // Consumir nueva línea  
            //Creamos el Switch
            switch (opcion) {  
                case 1:  
                    System.out.print("Ingrese el año de Creacion: ");  
                    int anio = lector.nextInt();  
                    lector.nextLine();  
                    System.out.print("Ingrese una característica Principal: ");  
                    String caracteristica = lector.nextLine();  
                    System.out.print(" Ingrese el nombre del Lenguaje: ");  
                    String nombre = lector.nextLine();  
                    System.out.print("Para que sirve el lenguaje: ");  
                    String utilizacion = lector.nextLine();  
                    gestionLenguaje.agregarLenguaje(anio, caracteristica, nombre, utilizacion);  
                    break;  

                case 2:  
                    System.out.print("Ingrese el nombre del lenguaje a buscar: ");  
                    String nombreBuscar = lector.nextLine();  
                    lenguajeProgramacion lenguajeBuscado = gestionLenguaje.buscarLenguaje(nombreBuscar);  
                    if (lenguajeBuscado != null) {  
                        System.out.println("Lenguaje encontrado: " + lenguajeBuscado);  
                    } else {  
                        System.out.println("Lenguaje no encontrado.");  
                    }  
                    break;  

                case 3:  
                    System.out.print("Ingrese el nombre del lenguaje a eliminar: ");  
                    String nombreEliminar = lector.nextLine();  
                    if (gestionLenguaje.eliminarLenguaje(nombreEliminar)) {  
                        System.out.println("Lenguaje eliminado.");  
                    } else {  
                        System.out.println("Lenguaje no encontrado.");  
                    }  
                    break;  

                case 4:  
                    gestionLenguaje.imprimirLenguajes();  
                    break;  

                case 5:  
                    System.out.println("Saliendo.... Vuelva pronto");  
                    break;  

                default:  
                    System.out.println("Opcion no es valida. Intente nuevamente.");  
            }  
        } while (opcion != 5);  
        
        lector.close();  
    }  
}
