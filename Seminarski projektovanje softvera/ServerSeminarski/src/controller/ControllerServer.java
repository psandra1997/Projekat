/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.implementacija.RepositoryOtpremnica;
import db.implementacija.RepositoryProdavac;
import db.konekcija.DBKonekcija;
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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import so.AbstractSO;
import so.aparat.AddAparat;
import so.aparat.DeleteAparat;
import so.aparat.GetAparat;
import so.jedinicaMere.GetJedinicaMere;
import so.magacin.GetMagacin;
import so.marka.GetMarka;
import so.mesto.GetMesto;
import so.mobilniTelefon.AddMobilniTelefon;
import so.mobilniTelefon.DeleteMobilniTelefon;
import so.mobilniTelefon.EditMobilniTelefon;
import so.mobilniTelefon.GetMobilniTelefon;
import so.mobilniTelefon.GetWhereMobilniTelefon;
import so.otpremnica.AddOtpremnica;
import so.otpremnica.EditOtpremnica;
import so.otpremnica.GetOtpremnica;
import so.otpremnica.GetWhereOtpremnica;
import so.prodavac.GetProdavac;
import so.prodavnica.AddProdavnica;
import so.prodavnica.EditProdavnica;
import so.prodavnica.GetProdavnica;
import so.prodavnica.GetWhereProdavnica;
import so.radnik.GetRadnik;
import so.stavka.AddStavkaOtpremnice;
import so.stavka.GetStavkaOtpremnice;

/**
 *
 * @author Sandra
 */
public class ControllerServer {
    private static ControllerServer instance;
    private final RepositoryProdavac storageProdavac;
    private final ArrayList<Prodavac> listaProdavac;

    public ControllerServer() {
        this.storageProdavac = new RepositoryProdavac();
        listaProdavac = new ArrayList<>();
    }

    public static ControllerServer getInstance() {
        if (instance == null) {
            instance = new ControllerServer();
        }
        return instance;
    }

    public Prodavac login(String korisnickoIme, String lozinka) throws Exception {
        try {
            storageProdavac.otvoriKonekciju();
            ArrayList<Prodavac> prodavac = storageProdavac.getAll();
            storageProdavac.commit();
            for (Prodavac p : prodavac) {
                if (p.getKorisnickoIme().equals(korisnickoIme) && p.getLozinka().equals(lozinka)) {
                    listaProdavac.add(p);
                    return p;
                }
            }
        } catch (Exception ex) {
            storageProdavac.rollback();
            throw ex;
        } finally {
            storageProdavac.zatvoriKonekciju();
        }
        throw new Exception("Prodavac ne postoji!");
    }

    public ArrayList<Prodavac> getListaUlogovani() throws Exception {
        if (listaProdavac == null) {
            throw new Exception();
        } else {
            return listaProdavac;
        }
    }

    public void removeUlogovani() {
        for (Prodavac pr : listaProdavac) {
            listaProdavac.remove(pr);
        }
    }

    public void dodajMobilniTelefon(MobilniTelefon mt) throws Exception {
        AbstractSO dodajMobilniTelefon = new AddMobilniTelefon();
        dodajMobilniTelefon.execute(mt);
    }

    public void dodajProdavnicu(Prodavnica p) throws Exception {
        AbstractSO dodajProdavnicu = new AddProdavnica();
        dodajProdavnicu.execute(p);
    }

    public void dodajOtpremnicu(Otpremnica o) throws Exception {
        AbstractSO dodajOtpremnicu = new AddOtpremnica();
        dodajOtpremnicu.execute(o);
    }

    public void dodajStavkuOtpremnice(StavkaOtpremnice st) throws Exception {
        AbstractSO dodajStavkuOtpremnicu = new AddStavkaOtpremnice();
        dodajStavkuOtpremnicu.execute(st);
    }

    public void obrisiMobilniTelefon(MobilniTelefon mt) throws Exception {
        AbstractSO obrisiMobilniTelefon = new DeleteMobilniTelefon();
        obrisiMobilniTelefon.execute(mt);
    }

    public void izmeniMobilniTelefon(MobilniTelefon mt) throws Exception {
        EditMobilniTelefon izmeniMT = new EditMobilniTelefon();
        izmeniMT.execute(mt);
    }

    public void izmeniProdavnicu(Prodavnica p) throws Exception {
        AbstractSO izmeniProdavnicu = new EditProdavnica();
        izmeniProdavnicu.execute(p);
    }

    public void izmeniOtpremnicu(Otpremnica o) throws Exception {
        AbstractSO izmeniOtpremnicu = new EditOtpremnica();
        izmeniOtpremnicu.execute(o);
    }

    public ArrayList<MobilniTelefon> vratiMobilniTelefon() throws Exception {
        GetMobilniTelefon dajMobilniTelefon = new GetMobilniTelefon();
        dajMobilniTelefon.execute(null);
        ArrayList<MobilniTelefon> lista = dajMobilniTelefon.getLista();
        return lista;
    }

    public ArrayList<Prodavnica> vratiProdavnicu() throws Exception {
        GetProdavnica dajProdavnicu = new GetProdavnica();
        dajProdavnicu.execute(null);
        ArrayList<Prodavnica> lista = dajProdavnicu.getLista();
        return lista;
    }

    public ArrayList<Otpremnica> vratiOtpremnicu() throws Exception {
        GetOtpremnica dajOtpremnice = new GetOtpremnica();
        dajOtpremnice.execute(null);
        ArrayList<Otpremnica> lista = dajOtpremnice.getLista();
        return lista;
    }

    public ArrayList<StavkaOtpremnice> vratiStavkeOtpremnice(Otpremnica o) throws Exception {
        GetStavkaOtpremnice so = new GetStavkaOtpremnice();
        StavkaOtpremnice sto = new StavkaOtpremnice();
        sto.setOtpremnica(o.getBrojOtpremnice());
        so.execute(sto);
        return so.getLista();
    }

    public ArrayList<MobilniTelefon> pretraziMobilniTelefon(String s) throws Exception {
        GetWhereMobilniTelefon dajMobilniTelefon = new GetWhereMobilniTelefon(s);
        dajMobilniTelefon.execute(null);
        ArrayList<MobilniTelefon> lista = dajMobilniTelefon.getLista();
        return lista;
    }

    public ArrayList<Prodavnica> pretraziProdavnicu(String s) throws Exception {       
        GetWhereProdavnica dajProdavnicu = new GetWhereProdavnica(s);
        dajProdavnicu.execute(null);
        ArrayList<Prodavnica> lista = dajProdavnicu.getLista();
        return lista;
    }

    public ArrayList<Otpremnica> pretraziOtpremnica(String s) throws Exception {
        ArrayList<Otpremnica> pretraga = new ArrayList<>();
        GetWhereOtpremnica dajOtpremnicu = new GetWhereOtpremnica(s);
        dajOtpremnicu.execute(null);
        ArrayList<Otpremnica> lista = dajOtpremnicu.getLista();
        return lista;
    }

    public ArrayList<JedinicaMere> vratiJM() throws Exception {
        GetJedinicaMere dajJedinicuMere = new GetJedinicaMere();
        dajJedinicuMere.execute(null);
        ArrayList<JedinicaMere> lista = dajJedinicuMere.getLista();
        return lista;
    }

    public ArrayList<Magacin> vratiMagacin() throws Exception {
        GetMagacin dajMagacin = new GetMagacin();
        dajMagacin.execute(null);
        ArrayList<Magacin> lista = dajMagacin.getLista();
        return lista;
    }

    public ArrayList<Marka> vratiMarku() throws Exception {
        GetMarka dajMarku = new GetMarka();
        dajMarku.execute(null);
        ArrayList<Marka> lista = dajMarku.getLista();
        return lista;
    }

    public ArrayList<Mesto> vratiMesto() throws Exception {
        GetMesto dajMesto = new GetMesto();
        dajMesto.execute(null);
        ArrayList<Mesto> lista = dajMesto.getLista();
        return lista;
    }

    public ArrayList<Radnik> vratiRadnika() throws Exception {
        GetRadnik dajRadnika = new GetRadnik();
        dajRadnika.execute(null);
        ArrayList<Radnik> lista = dajRadnika.getLista();
        return lista;
    }

    public ArrayList<Prodavac> vratiProdavce() throws Exception {
        GetProdavac dajProdavce = new GetProdavac();
        dajProdavce.execute(null);
        ArrayList<Prodavac> lista = dajProdavce.getLista();
        return lista;
    }

    public ArrayList<Aparat> vratiAparat() throws Exception {
        GetAparat vratiAparat = new GetAparat();
        vratiAparat.execute(null);
        ArrayList<Aparat> lista = vratiAparat.getLista();
        return lista;
    }

    public int vratiMaxBrojOtpremnice() throws Exception {
        int maksimum = 0;
        Statement statement = null;
        Connection k = null;
        String upit = "select max(brojOtpremnice) as max from otpremnica";
        try {
            k = DBKonekcija.getInstanca().konekcija();
            statement = k.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {
                maksimum = rs.getInt("max");
            }
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje otpremnice!\n" + ex);
            throw ex;
        }
        return maksimum + 1;
    }

    public void dodajAparat(Aparat sacuvajAparat) throws Exception {
        AddAparat dodajAparat = new AddAparat();
        dodajAparat.execute(sacuvajAparat);
    }

    public void obrisiAparat(Aparat aparat) throws Exception {
        DeleteAparat obrisiAparat = new DeleteAparat();
        obrisiAparat.execute(aparat);
    }
}
    
