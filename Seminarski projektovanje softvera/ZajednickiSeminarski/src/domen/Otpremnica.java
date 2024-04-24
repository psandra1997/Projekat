/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class Otpremnica implements Serializable {

    private Integer brojOtpremnice;
    private BigDecimal ukupanIznosStavki;
    private int PDV;
    private BigDecimal ukupnaVrednost;
    private Radnik radnik;
    private Magacin magacin;
    private Prodavnica prodavnica;
    private ArrayList<StavkaOtpremnice> listaStavki;

    public Otpremnica() {
        listaStavki = new ArrayList<>();
    }

    public Otpremnica(Integer brojOtpremnice, BigDecimal ukupanIznosStavki, int PDV, BigDecimal ukupnaVrednost, Radnik radnik, Magacin magacin, Prodavnica prodavnica, ArrayList<StavkaOtpremnice> listaStavki) {
        this.brojOtpremnice = brojOtpremnice;
        this.ukupanIznosStavki = ukupanIznosStavki;
        this.PDV = PDV;
        this.ukupnaVrednost = ukupnaVrednost;
        this.radnik = radnik;
        this.magacin = magacin;
        this.prodavnica = prodavnica;
        this.listaStavki = listaStavki;
    }

    public ArrayList<StavkaOtpremnice> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaOtpremnice> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public BigDecimal getUkupanIznosStavki() {
        return ukupanIznosStavki;
    }

    public void setUkupanIznosStavki(BigDecimal ukupanIznosStavki) {
        this.ukupanIznosStavki = ukupanIznosStavki;
    }

    public int getPDV() {
        return PDV;
    }

    public void setPDV(int PDV) {
        this.PDV = PDV;
    }

    public BigDecimal getUkupnaVrednost() {
        return ukupnaVrednost;
    }

    public void setUkupnaVrednost(BigDecimal ukupnaVrednost) {
        this.ukupnaVrednost = ukupnaVrednost;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Magacin getMagacin() {
        return magacin;
    }

    public void setMagacin(Magacin magacin) {
        this.magacin = magacin;
    }

    public Prodavnica getProdavnica() {
        return prodavnica;
    }

    public void setProdavnica(Prodavnica prodavnica) {
        this.prodavnica = prodavnica;
    }

    public Integer getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(Integer brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    @Override
    public String toString() {
        return  brojOtpremnice + " " + ukupanIznosStavki + " " + PDV + " " + ukupnaVrednost + " " + radnik + " " + magacin + " " + prodavnica + " " + listaStavki;
    }

}
