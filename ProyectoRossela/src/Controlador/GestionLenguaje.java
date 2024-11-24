/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.lenguajeProgramacion;

/**
 *
 * @author pc
 */
public class GestionLenguaje {
     // Atributos estáticos  
    private static final int FACTOR_CRECIMIENTO = 2;  
    private static lenguajeProgramacion[] arregloLenguajes = new lenguajeProgramacion[FACTOR_CRECIMIENTO];  
    private static int contadorLenguajes = 0;  
    

    // Método para agregar un lenguaje  
    public static void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {  
        // Aumentar el tamaño del arreglo si es necesario  
        if (contadorLenguajes >= arregloLenguajes.length) {  
            aumentarCapacidad();  
        }  
        arregloLenguajes[contadorLenguajes++] = new lenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);  
    }  

    // Método para buscar un lenguaje por nombre  
    public static lenguajeProgramacion buscarLenguaje(String nombre) {  
        for (int i = 0; i < contadorLenguajes; i++) {  
            if (arregloLenguajes[i] != null && arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {  
                return arregloLenguajes[i];  
            }  
        }  
        return null; // Lenguaje no encontrado  
    }  

    // Método para eliminar un lenguaje por nombre  
    public static boolean eliminarLenguaje(String nombre) {  
        for (int i = 0; i < contadorLenguajes; i++) {  
            if (arregloLenguajes[i] != null && arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {  
                // Desplazar elementos a la izquierda  
                for (int j = i; j < contadorLenguajes - 1; j++) {  
                    arregloLenguajes[j] = arregloLenguajes[j + 1];  
                }  
                arregloLenguajes[--contadorLenguajes] = null; // Eliminar última referencia  
                return true; // Lenguaje eliminado  
            }  
        }  
        return false; // Lenguaje no encontrado  
    }  

    // Método para obtener el arreglo de lenguajes  
    public static lenguajeProgramacion[] getArregloLenguajes() {  
        return arregloLenguajes;  
    }  

    // Método para imprimir los lenguajes  
    public static void imprimirLenguajes() {  
        if (contadorLenguajes == 0) {  
            System.out.println("No hay lenguajes registrados.");  
        } else {  
            for (int i = 0; i < contadorLenguajes; i++) {  
                System.out.println(arregloLenguajes[i]);  
            }  
        }  
    }  

    // Método privado para aumentar la capacidad del arreglo  
    private static void aumentarCapacidad() {  
        lenguajeProgramacion[] nuevoArreglo = new lenguajeProgramacion[arregloLenguajes.length + FACTOR_CRECIMIENTO];  
        System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length);  
        arregloLenguajes = nuevoArreglo;  
    }  
}
