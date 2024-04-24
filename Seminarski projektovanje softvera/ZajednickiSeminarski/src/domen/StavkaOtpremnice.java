/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sandra
 */
public class StavkaOtpremnice implements Serializable{
    private Integer otpremnica;
    private int RB;
    private int kolicina;
    private BigDecimal cena;
    private BigDecimal ukupanIznos;
    private JedinicaMere jedinicaMere;
    private MobilniTelefon mobilniTelefon;

    public StavkaOtpremnice() {
    }

    public StavkaOtpremnice(Integer otpremnica, int RB, int kolicina, BigDecimal cena, BigDecimal ukupanIznos, JedinicaMere jedinicaMere, MobilniTelefon mobilniTelefon) {
        this.otpremnica = otpremnica;
        this.RB = RB;
        this.kolicina = kolicina;
        this.cena = cena;
        this.ukupanIznos = ukupanIznos;
        this.jedinicaMere = jedinicaMere;
        this.mobilniTelefon = mobilniTelefon;
    }

    public MobilniTelefon getMobilniTelefon() {
        return mobilniTelefon;
    }

    public void setMobilniTelefon(MobilniTelefon mobilniTelefon) {
        this.mobilniTelefon = mobilniTelefon;
    }

    public int getRB() {
        return RB;
    }

    public void setRB(int RB) {
        this.RB = RB;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public BigDecimal getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(BigDecimal ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public Integer getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Integer otpremnica) {
        this.otpremnica = otpremnica;
    }

    @Override
    public String toString() {
        return RB + " " + mobilniTelefon+" "+ jedinicaMere+" "+ kolicina + " " + cena + " " + ukupanIznos ;
    }
  
}
