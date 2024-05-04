/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class Hotel {
    
    String nombre, direccion;
    int numPaqutes, numCuartos, numServicios;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, int numPaqutes, int numCuartos, int numServicios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numPaqutes = numPaqutes;
        this.numCuartos = numCuartos;
        this.numServicios = numServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumPaqutes() {
        return numPaqutes;
    }

    public void setNumPaqutes(int numPaqutes) {
        this.numPaqutes = numPaqutes;
    }

    public int getNumCuartos() {
        return numCuartos;
    }

    public void setNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }

    public int getNumServicios() {
        return numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }
    
    
    
}
