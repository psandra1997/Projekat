/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Sandra Petkovski
 */
public class Marka implements Serializable{
    private int sifraMarke;
    private String nazivMarke;

    public Marka() {
    }

    public Marka(int sifraMarke, String nazivMarke) {
        this.sifraMarke = sifraMarke;
        this.nazivMarke = nazivMarke;
    }

    public String getNazivMarke() {
        return nazivMarke;
    }

    public void setNazivMarke(String nazivMarke) {
        this.nazivMarke = nazivMarke;
    }

    public int getSifraMarke() {
        return sifraMarke;
    }

    public void setSifraMarke(int sifraMarke) {
        this.sifraMarke = sifraMarke;
    }

    @Override
    public String toString() {
        return nazivMarke;
    }
    
}
