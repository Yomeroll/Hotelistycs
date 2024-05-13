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
public class huesped {
    
    int id_huesped;
    LocalDate fecha_nac ;
    String hnombre, hapellidopat, hapellidomat;

    public huesped() {
    }

    public huesped(int id_huesped, LocalDate fecha_nac, String hnombre, String hapellidopat, String hapellidomat) {
        this.id_huesped = id_huesped;
        this.fecha_nac = fecha_nac;
        this.hnombre = hnombre;
        this.hapellidopat = hapellidopat;
        this.hapellidomat = hapellidomat;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getHnombre() {
        return hnombre;
    }

    public void setHnombre(String hnombre) {
        this.hnombre = hnombre;
    }

    public String getHapellidopat() {
        return hapellidopat;
    }

    public void setHapellidopat(String hapellidopat) {
        this.hapellidopat = hapellidopat;
    }

    public String getHapellidomat() {
        return hapellidomat;
    }

    public void setHapellidomat(String hapellidomat) {
        this.hapellidomat = hapellidomat;
    }
    
    
    
}
