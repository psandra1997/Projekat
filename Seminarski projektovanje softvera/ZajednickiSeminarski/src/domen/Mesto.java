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
public class Mesto implements Serializable{
    private String postanskiBroj;
    private String nazivMesta;

    public Mesto() {
    }

    public Mesto(String postanskiBroj, String naziv) {
        this.postanskiBroj = postanskiBroj;
        this.nazivMesta = naziv;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    @Override
    public String toString() {
        return postanskiBroj+" "+nazivMesta;
    }
    
}
