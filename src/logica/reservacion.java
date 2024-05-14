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
    
    int id_reservacion, num_noches, num_padultuas, num_pmenores, id_cuenta, id_huesped;
    String forma_pago;
    LocalTime checkin, checkout;
    LocalDate fecha_llegada, fecha_salida;

    public reservacion() {
    } 

    public reservacion(int id_reservacion, int num_noches, int num_padultuas, int num_pmenores, int id_cuenta, int id_huesped, String forma_pago, LocalTime checkin, LocalTime checkout, LocalDate fecha_llegada, LocalDate fecha_salida) {
        this.id_reservacion = id_reservacion;
        this.num_noches = num_noches;
        this.num_padultuas = num_padultuas;
        this.num_pmenores = num_pmenores;
        this.id_cuenta = id_cuenta;
        this.id_huesped = id_huesped;
        this.forma_pago = forma_pago;
        this.checkin = checkin;
        this.checkout = checkout;
        this.fecha_llegada = fecha_llegada;
        this.fecha_salida = fecha_salida;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public int getNum_noches() {
        return num_noches;
    }

    public void setNum_noches(int num_noches) {
        this.num_noches = num_noches;
    }

    public int getNum_padultuas() {
        return num_padultuas;
    }

    public void setNum_padultuas(int num_padultuas) {
        this.num_padultuas = num_padultuas;
    }

    public int getNum_pmenores() {
        return num_pmenores;
    }

    public void setNum_pmenores(int num_pmenores) {
        this.num_pmenores = num_pmenores;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
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

    public LocalDate getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(LocalDate fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
}
