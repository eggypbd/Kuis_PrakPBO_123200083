/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import hitung.Seleksi;

/**
 *
 * @author HP
 */
public class AndroDev extends Posisi implements Seleksi {
    
    public AndroDev(String nama, String nik, double htulis, double hcoding, double hwawan) {
        this.nama = nama;
        this.nik = nik;
        this.htulis = htulis;
        this.hcoding = hcoding;
        this.hwawan = hwawan;
    }

    AndroDev() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void hitungHasil() {
        
        double hasil;
        
        hasil = (double) ((0.2*this.htulis) + (0.5*this.hcoding) + (0.3*this.hwawan)) / 3 ;
        
        this.hasil = hasil;
    }

    @Override
    public void eHasil(double htulis,double hcoding,double hwawan) {
        this.htulis = htulis;
        this.hcoding = hcoding;
        this.hwawan = hwawan;
    }

    public String getNama() {
        return nama;
    }
    
    public double getHasil() {
        return hasil;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nik) {
        this.nik = nik;
    }

    public void setTulis(double htulis) {
        this.htulis = htulis;
    }

    public void setCoding(double hcoding) {
        this.hcoding = hcoding;
    }

    public void setWawan(double hwawan) {
        this.hwawan = hwawan;
    }
    
    
}
