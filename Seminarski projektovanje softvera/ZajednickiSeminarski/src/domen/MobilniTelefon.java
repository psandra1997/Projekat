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
public class MobilniTelefon implements Serializable{
    private String sifraMT;
    private String nazivMT;
    private String dimenzija;
    private String procesor;
    private String baterija;
    private String kamera;    
    private String memorija;
    private String boja;
    private BigDecimal cenaTelefona;
    private Marka marka;
    

    public MobilniTelefon() {
    }

    public MobilniTelefon(String sifraMT, String nazivMT, String dimenzija, String procesor, String baterija, String kamera, String memorija, String boja, BigDecimal cenaTelefona, Marka marka) {
        this.sifraMT = sifraMT;
        this.nazivMT = nazivMT;
        this.dimenzija = dimenzija;
        this.procesor = procesor;
        this.baterija = baterija;
        this.kamera = kamera;
        this.memorija = memorija;
        this.boja = boja;
        this.cenaTelefona = cenaTelefona;
        this.marka = marka;
    }

    public BigDecimal getCenaTelefona() {
        return cenaTelefona;
    }

    public void setCenaTelefona(BigDecimal cenaTelefona) {
        this.cenaTelefona = cenaTelefona;
    }

    public String getNazivMT() {
        return nazivMT;
    }

    public void setNazivMT(String nazivMT) {
        this.nazivMT = nazivMT;
    }

    public String getDimenzija() {
        return dimenzija;
    }

    public void setDimenzija(String dimenzija) {
        this.dimenzija = dimenzija;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getBaterija() {
        return baterija;
    }

    public void setBaterija(String baterija) {
        this.baterija = baterija;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getMemorija() {
        return memorija;
    }

    public void setMemorija(String memorija) {
        this.memorija = memorija;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return nazivMT + " " + marka;
    }

    public String getSifraMT() {
        return sifraMT;
    }

    public void setSifraMT(String sifraMT) {
        this.sifraMT = sifraMT;
    }

    
}
