/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Rossela Santamaria
 */
public class lenguajeProgramacion {

    private int anioCreacion;  
    private String caracteristicaPrincipal;  
    private String nombre;  
    private String utilizacion;  
    
     public lenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {  
        this.anioCreacion = anioCreacion;  
        this.caracteristicaPrincipal = caracteristicaPrincipal;  
        this.nombre = nombre;  
        this.utilizacion = utilizacion;  
    }  

    public String getNombre() {  
        return nombre;  
    }  

    @Override  
    public String toString() {  
        return "Lenguaje: " + getNombre() + ", Año: " + getAnioCreacion() + ", Característica: " + getCaracteristicaPrincipal() + ", Uso: " + getUtilizacion();  
    }  
    /**
     * @return the anioCreacion
     */
    public int getAnioCreacion() {
        return anioCreacion;
    }

    /**
     * @param anioCreacion the anioCreacion to set
     */
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    /**
     * @return the caracteristicaPrincipal
     */
    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    /**
     * @param caracteristicaPrincipal the caracteristicaPrincipal to set
     */
    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the utilizacion
     */
    public String getUtilizacion() {
        return utilizacion;
    }

    /**
     * @param utilizacion the utilizacion to set
     */
    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }
    

   
}
