/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dini160623.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class Peminjaman{
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman() {
    }

    public Peminjaman(String kodeAnggota, String kodeBuku, String tglPinjam, String tglKembali) {
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
    public long getSelisih() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = format.parse(tglPinjam);
        Date d2 = format.parse(tglKembali);
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }
    
    
}
