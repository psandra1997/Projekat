/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sandra 
 */
public class Aparat implements Serializable{
    private String prodavnica;
    private String telefon;
    private String barKod;
    private TipGarancije garancija;
    private int otpremnica;
    private int stavka;
    

    public Aparat() {
    }

    public Aparat(String prodavnica, String telefon, String barKod, TipGarancije garancija, int otpremnica, int stavka) {
        this.prodavnica = prodavnica;
        this.telefon = telefon;
        this.barKod = barKod;
        this.garancija = garancija;
        this.otpremnica = otpremnica;
        this.stavka = stavka;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getProdavnica() {
        return prodavnica;
    }

    public void setProdavnica(String prodavnica) {
        this.prodavnica = prodavnica;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public TipGarancije getGarancija() {
        return garancija;
    }

    public void setGarancija(TipGarancije garancija) {
        this.garancija = garancija;
    }

    public void setOtpremnica(int otpremnica) {
        this.otpremnica = otpremnica;
    }

    public int getOtpremnica() {
        return otpremnica;
    }

    public void setStavka(int stavka) {
        this.stavka = stavka;
    }

    public int getStavka() {
        return stavka;
    }

    @Override
    public String toString() {
        return prodavnica + " " + telefon + " " + barKod + " " + garancija + " " + otpremnica+ " "+stavka;
    }

    
}
