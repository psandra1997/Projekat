/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Sandra
 */
public class Radnik implements Serializable{
    private int sifraRadnika;
    private String ime;
    private String prezime;
   

    public Radnik() {
    }

    public Radnik(int sifraRadnika, String ime, String prezime) {
        this.sifraRadnika = sifraRadnika;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getSifraRadnika() {
        return sifraRadnika;
    }

    public void setSifraRadnika(int sifraRadnika) {
        this.sifraRadnika = sifraRadnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime+" "+prezime;
    }

}
