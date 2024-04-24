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
public class Magacin implements Serializable{
    private int sifraMagacina;
    private String nazivMagacina;

    public Magacin() {
    }

    public Magacin(int sifraMagacina, String nazivMagacina) {
        this.sifraMagacina = sifraMagacina;
        this.nazivMagacina = nazivMagacina;
    }

    public String getNazivMagacina() {
        return nazivMagacina;
    }

    public void setNazivMagacina(String nazivMagacina) {
        this.nazivMagacina = nazivMagacina;
    }

    public int getSifraMagacina() {
        return sifraMagacina;
    }

    public void setSifraMagacina(int sifraMagacina) {
        this.sifraMagacina = sifraMagacina;
    }

    @Override
    public String toString() {
        return nazivMagacina; 
    }
    
    
}
