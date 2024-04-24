/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Aparat;
import domen.JedinicaMere;
import domen.Magacin;
import domen.Marka;
import domen.Mesto;
import domen.MobilniTelefon;
import domen.Otpremnica;
import domen.Prodavac;
import domen.Prodavnica;
import domen.Radnik;
import domen.StavkaOtpremnice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import komunikacija.KomunikacijaSaServerom;
import operacije.Operacija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Sandra
 */
public class ControllerKlijent {

    private static ControllerKlijent instanca;
    private Prodavac prodavac;
    private Map<String, Object> data;
    private Aparat aparat;

    private ControllerKlijent() {
        data = new HashMap<>();
    }

    public static ControllerKlijent getInstanca() {
        if (instanca == null) {
            return instanca = new ControllerKlijent();
        }
        return instanca;
    }

    public Object getValue(String key) {
        if (data.containsKey(key)) {
            return data.get(key);
        }
        return null;
    }

    public void addValue(String key, Object value) {
        data.put(key, value);
    }

    public Prodavac getProdavac() {
        return prodavac;
    }

    public void setProdavac(Prodavac prodavac) {
        this.prodavac = prodavac;
    }

    private Object posalji(Object parametar, int operacija) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(parametar, operacija);
        KomunikacijaSaServerom.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstanca().primiOdgovor();
        return so.getOdgovor();
    }

    public Prodavac prijava(Prodavac prodavac) throws Exception {
        return (Prodavac) posalji(prodavac, Operacija.PRIJAVA);
    }

    public void odjava() throws Exception {
        posalji(this.prodavac, Operacija.ODJAVA);
    }

    public ArrayList<Otpremnica> getOtpremnice() throws Exception {
        return (ArrayList<Otpremnica>) posalji(null, Operacija.UCITAJ_LISTU_OTPREMNICA);
    }

    public ArrayList<Radnik> getRadnici() throws Exception {
        return (ArrayList<Radnik>) posalji(null, Operacija.UCITAJ_LISTU_RADNIKA);
    }

    public ArrayList<Magacin> getMagacin() throws Exception {
        return (ArrayList<Magacin>) posalji(null, Operacija.UCITAJ_LISTU_MAGACINA);
    }

    public ArrayList<Prodavnica> getProdavnica() throws Exception {
        return (ArrayList<Prodavnica>) posalji(null, Operacija.UCITAJ_LISTU_PRODAVNICA);
    }

    public void updateOtpremnica(Otpremnica otpremnica) throws Exception {
        posalji(otpremnica, Operacija.IZMENI_OTPREMNICU);
    }

    public ArrayList<StavkaOtpremnice> vratiStavkeZaOtpremnicu(Otpremnica otpremnica) throws Exception {
        return (ArrayList<StavkaOtpremnice>) posalji(otpremnica, Operacija.VRATI_STAVKE_ZA_OTPREMNICU);
    }

    public int vratiMaxBrojOtpremnice() throws Exception {
        return (int) posalji(null, Operacija.VRATI_MAX_BROJ_OTPREMNICE);
    }

    public void sacuvajOtpremnicu(Otpremnica otpremnica) throws Exception {
        posalji(otpremnica, Operacija.SACUVAJ_OTPREMNICU);
    }

    public ArrayList<MobilniTelefon> getMobilniTelefoni() throws Exception {
        return (ArrayList<MobilniTelefon>) posalji(null, Operacija.UCITAJ_LISTU_MOBILNIH_TELEFONA);
    }

    public ArrayList<Marka> getListaMarki() throws Exception {
        return (ArrayList<Marka>) posalji(null, Operacija.UCITAJ_LISTU_MARKI);
    }

    public void updateMobilniTelefon(MobilniTelefon telefon) throws Exception {
        posalji(telefon, Operacija.IZMENI_MOBILNI_TELEFON);
    }

    public void deleteMobilniTelefon(MobilniTelefon telefon) throws Exception {
        posalji(telefon, Operacija.OBRISI_MOBILNI_TELEFON);
    }

    public void saveMobilniTelefon(MobilniTelefon telefon) throws Exception {
        posalji(telefon, Operacija.SACUVAJ_MOBILNI_TELEFON);
    }

    public ArrayList<Mesto> getMesto() throws Exception {
        return (ArrayList<Mesto>) posalji(null, Operacija.UCITAJ_LISTU_MESTA);
    }

    public void updateProdavnica(Prodavnica prodavnica) throws Exception {
        posalji(prodavnica, Operacija.IZMENI_PRODAVNICU);
    }

    public void saveProdavnica(Prodavnica prodavnica) throws Exception {
        posalji(prodavnica, Operacija.SACUVAJ_PRODAVNICU);
    }

    public ArrayList<Aparat> getAparat() throws Exception {
     return (ArrayList<Aparat>) posalji(null, Operacija.UCITAJ_LISTU_APARATA);
    }

    public ArrayList<JedinicaMere> getJedinicaMere() throws Exception {
    return (ArrayList<JedinicaMere>) posalji(null, Operacija.UCITAJ_LISTU_JEDINICA_MERE);
    }

    public void saveAparat(Aparat aparat) throws Exception {
        posalji(aparat, Operacija.SACUVAJ_APARAT);
    }

    public void deleteAparat(Aparat aparat)throws Exception{
        posalji(aparat, Operacija.OBRISI_APARAT);
    }

}
