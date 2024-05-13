/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.time.*;
/**
 *
 * @author scben
 */
public class reservacion {
    
    int idreservacion, numnoches, numpadultuas, numpmenores, idcuenta, idhuesped;
    String formapago;
    LocalTime checkin, checkout;
    LocalDate fechallegada, fechasalida;

    public reservacion() {
    }

    public reservacion(int idreservacion, int numnoches, int numpadultuas, int numpmenores, int idcuenta, int idhuesped, String formapago, LocalTime checkin, LocalTime checkout, LocalDate fechallegada, LocalDate fechasalida) {
        this.idreservacion = idreservacion;
        this.numnoches = numnoches;
        this.numpadultuas = numpadultuas;
        this.numpmenores = numpmenores;
        this.idcuenta = idcuenta;
        this.idhuesped = idhuesped;
        this.formapago = formapago;
        this.checkin = checkin;
        this.checkout = checkout;
        this.fechallegada = fechallegada;
        this.fechasalida = fechasalida;
    }

    public int getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(int idreservacion) {
        this.idreservacion = idreservacion;
    }

    public int getNumnoches() {
        return numnoches;
    }

    public void setNumnoches(int numnoches) {
        this.numnoches = numnoches;
    }

    public int getNumpadultuas() {
        return numpadultuas;
    }

    public void setNumpadultuas(int numpadultuas) {
        this.numpadultuas = numpadultuas;
    }

    public int getNumpmenores() {
        return numpmenores;
    }

    public void setNumpmenores(int numpmenores) {
        this.numpmenores = numpmenores;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public int getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(int idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public LocalTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalTime checkin) {
        this.checkin = checkin;
    }

    public LocalTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalTime checkout) {
        this.checkout = checkout;
    }

    public LocalDate getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(LocalDate fechallegada) {
        this.fechallegada = fechallegada;
    }

    public LocalDate getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(LocalDate fechasalida) {
        this.fechasalida = fechasalida;
    }
    
    
    
    
            
            
}
