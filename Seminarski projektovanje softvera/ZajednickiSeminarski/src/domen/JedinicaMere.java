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
public class JedinicaMere implements Serializable{
    private int sifraJM;
    private String nazivJM;

    public JedinicaMere() {
    }

    public JedinicaMere(int sifraJM, String nazivJM) {
        this.sifraJM = sifraJM;
        this.nazivJM = nazivJM;
    }

    public String getNazivJM() {
        return nazivJM;
    }

    public void setNazivJM(String nazivJM) {
        this.nazivJM = nazivJM;
    }

    public int getSifraJM() {
        return sifraJM;
    }

    public void setSifraJM(int sifraJM) {
        this.sifraJM = sifraJM;
    }

    @Override
    public String toString() {
        return nazivJM;
    }
    
}
