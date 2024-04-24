/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sandra Petkovski
 */
public class Prodavnica implements Serializable{
    private String maticniBroj;
    private String PIB;
    private String naziv;
    private String adresa;
    private String tekuciRacun;
    private String brojTelefona;
    private String delatnost;
    private Date datumOsnivanja;
    private Mesto mesto;

    public Prodavnica() {
    }

    public Prodavnica(String maticniBroj, String PIB, String naziv, String adresa, String tekuciRacun, String brojTelefona, String delatnost, Date datumOsnivanja, Mesto mesto) {
        this.maticniBroj = maticniBroj;
        this.PIB = PIB;
        this.naziv = naziv;
        this.adresa = adresa;
        this.tekuciRacun = tekuciRacun;
        this.brojTelefona = brojTelefona;
        this.delatnost = delatnost;
        this.datumOsnivanja = datumOsnivanja;
        this.mesto = mesto;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(String delatnost) {
        this.delatnost = delatnost;
    }

    public Date getDatumOsnivanja() {
        return datumOsnivanja;
    }

    public void setDatumOsnivanja(Date datumOsnivanja) {
        this.datumOsnivanja = datumOsnivanja;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
}
