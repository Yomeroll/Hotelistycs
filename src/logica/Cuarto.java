/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


/**
 *
 * @author scben
 */

public class Cuarto {
    
    int id, num, numMaxPersonas, sizeW, sizeL, cama, numBathroom;
    String categoria; //Tipo de cuarto

    public Cuarto() {
    }

    public Cuarto(int id, int num, int numMaxPersonas, int sizeW, int sizeL, int cama, int numBathroom, String categoria) {
        this.id = id;
        this.num = num;
        this.numMaxPersonas = numMaxPersonas;
        this.sizeW = sizeW;
        this.sizeL = sizeL;
        this.cama = cama;
        this.numBathroom = numBathroom;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumMaxPersonas() {
        return numMaxPersonas;
    }

    public void setNumMaxPersonas(int numMaxPersonas) {
        this.numMaxPersonas = numMaxPersonas;
    }

    public int getSizeW() {
        return sizeW;
    }

    public void setSizeW(int sizeW) {
        this.sizeW = sizeW;
    }

    public int getSizeL() {
        return sizeL;
    }

    public void setSizeL(int sizeL) {
        this.sizeL = sizeL;
    }

    public int getCama() {
        return cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public int getNumBathroom() {
        return numBathroom;
    }

    public void setNumBathroom(int numBathroom) {
        this.numBathroom = numBathroom;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
