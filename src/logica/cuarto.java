/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author scben
 */
public class cuarto {
    
    int idcuarto, numpiso, maxhuespedes, numcuarto, idtipo;
    String estado;

    public cuarto() {
    }

    public cuarto(int idcuarto, int numpiso, int maxhuespedes, int numcuarto, int idtipo, String estado) {
        this.idcuarto = idcuarto;
        this.numpiso = numpiso;
        this.maxhuespedes = maxhuespedes;
        this.numcuarto = numcuarto;
        this.idtipo = idtipo;
        this.estado = estado;
    }

    public int getIdcuarto() {
        return idcuarto;
    }

    public void setIdcuarto(int idcuarto) {
        this.idcuarto = idcuarto;
    }

    public int getNumpiso() {
        return numpiso;
    }

    public void setNumpiso(int numpiso) {
        this.numpiso = numpiso;
    }

    public int getMaxhuespedes() {
        return maxhuespedes;
    }

    public void setMaxhuespedes(int maxhuespedes) {
        this.maxhuespedes = maxhuespedes;
    }

    public int getNumcuarto() {
        return numcuarto;
    }

    public void setNumcuarto(int numcuarto) {
        this.numcuarto = numcuarto;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
