/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import controller.ControllerServer;
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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacije.Operacija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Sandra
 */
public class ObradaKlijentskogZahteva extends Thread{
    Socket socket;
    
    public ObradaKlijentskogZahteva(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        while (true) {            
            KlijentskiZahtev kz=primiZahtev();
            ServerskiOdgovor so=new ServerskiOdgovor();
            try {
                switch (kz.getOperacija()) {
                    case Operacija.PRIJAVA:
                        ArrayList<Prodavac> lista = ControllerServer.getInstance().vratiProdavce();
                        Prodavac prodavac = (Prodavac) kz.getParametar();
                        for (Prodavac p : lista) {
                            if (p.getKorisnickoIme().equals(prodavac.getKorisnickoIme())
                                    && p.getLozinka().equals(prodavac.getLozinka())) {
                                so.setOdgovor(p);
                            }
                        }
                        if (so.getOdgovor() == null) {
                            throw new Exception("Ne postoji prodavac.");
                        } else {
                            break;
                        }
                    case Operacija.ODJAVA:
                        ControllerServer.getInstance().getListaUlogovani().remove(kz.getParametar());
                        break;
                    case Operacija.UCITAJ_LISTU_OTPREMNICA:
                        ArrayList<Otpremnica> listaOtpremnica = ControllerServer.getInstance().vratiOtpremnicu();
                        so.setOdgovor(listaOtpremnica);
                        break;
                    case Operacija.UCITAJ_LISTU_RADNIKA:
                        ArrayList<Radnik> listaRadnika = ControllerServer.getInstance().vratiRadnika();
                        so.setOdgovor(listaRadnika);
                        break;
                    case Operacija.UCITAJ_LISTU_MAGACINA:
                        ArrayList<Magacin> listaMagacina = ControllerServer.getInstance().vratiMagacin();
                        so.setOdgovor(listaMagacina);
                        break;
                    case Operacija.UCITAJ_LISTU_PRODAVNICA:
                        ArrayList<Prodavnica> listaProdavnica = ControllerServer.getInstance().vratiProdavnicu();
                        so.setOdgovor(listaProdavnica);
                        break;
                    case Operacija.UCITAJ_LISTU_JEDINICA_MERE:
                        ArrayList<JedinicaMere> listaJedinicaMere = ControllerServer.getInstance().vratiJM();
                        so.setOdgovor(listaJedinicaMere);
                        break;
                    case Operacija.UCITAJ_LISTU_MOBILNIH_TELEFONA:
                        ArrayList<MobilniTelefon> listaMobilnihTelefona = ControllerServer.getInstance().vratiMobilniTelefon();
                        so.setOdgovor(listaMobilnihTelefona);
                        break;
                    case Operacija.UCITAJ_LISTU_APARATA:
                        ArrayList<Aparat> listaBarKoda = ControllerServer.getInstance().vratiAparat();
                        so.setOdgovor(listaBarKoda);
                        break;
                     case Operacija.VRATI_STAVKE_ZA_OTPREMNICU:
                        Otpremnica otpremnica = (Otpremnica) kz.getParametar();
                        ArrayList<StavkaOtpremnice> listaStavkiZaOtpremnicu = ControllerServer.getInstance().vratiStavkeOtpremnice(otpremnica);
                        so.setOdgovor(listaStavkiZaOtpremnicu);
                        break;
                    case Operacija.VRATI_MAX_BROJ_OTPREMNICE:
                        int maxBrojotpremnice = ControllerServer.getInstance().vratiMaxBrojOtpremnice();
                        so.setOdgovor(maxBrojotpremnice);
                        break;
                    case Operacija.SACUVAJ_OTPREMNICU:
                        Otpremnica otpremnicaZaCuvanje = (Otpremnica) kz.getParametar();
                        ControllerServer.getInstance().dodajOtpremnicu(otpremnicaZaCuvanje);
                        break;
                    case Operacija.IZMENI_OTPREMNICU:
                        Otpremnica otpremnicaZaIzmenu=(Otpremnica) kz.getParametar();
                        ControllerServer.getInstance().izmeniOtpremnicu(otpremnicaZaIzmenu);
                        break;
                    case Operacija.UCITAJ_LISTU_MARKI:
                        ArrayList<Marka> listaMarki = ControllerServer.getInstance().vratiMarku();
                        so.setOdgovor(listaMarki);
                        break;
                    case Operacija.IZMENI_MOBILNI_TELEFON:
                        MobilniTelefon mt = (MobilniTelefon) kz.getParametar();
                        ControllerServer.getInstance().izmeniMobilniTelefon(mt);
                        so.setOdgovor("Uspesno izmenjen mobilni telefon!");
                        break;
                    case Operacija.OBRISI_MOBILNI_TELEFON:
                        MobilniTelefon mtObrisi = (MobilniTelefon) kz.getParametar();
                        ControllerServer.getInstance().obrisiMobilniTelefon(mtObrisi);
                        so.setOdgovor("Uspesno obrisan mobilni telefon.");
                        break;
                    case Operacija.SACUVAJ_MOBILNI_TELEFON:
                        MobilniTelefon mtSacuvaj = (MobilniTelefon) kz.getParametar();
                        ControllerServer.getInstance().dodajMobilniTelefon(mtSacuvaj);
                        so.setOdgovor("Uspesno sacuvan mobilni telefon.");
                        break;
                    case Operacija.UCITAJ_LISTU_MESTA:
                        ArrayList<Mesto> listaMesta = ControllerServer.getInstance().vratiMesto();
                        System.out.println("mesto con "+listaMesta);
                        so.setOdgovor(listaMesta);
                        break;
                    case Operacija.IZMENI_PRODAVNICU:
                        Prodavnica pr = (Prodavnica) kz.getParametar();
                        ControllerServer.getInstance().izmeniProdavnicu(pr);
                        so.setOdgovor("Uspesno izmenjena prodavnica!");
                        break;
                    case Operacija.SACUVAJ_PRODAVNICU:
                        Prodavnica prodavnicaSacuvaj = (Prodavnica) kz.getParametar();
                        ControllerServer.getInstance().dodajProdavnicu(prodavnicaSacuvaj);
                        so.setOdgovor("Uspesno sacuvana prodavnica.");
                        break;
                    case Operacija.SACUVAJ_APARAT:
                        Aparat sacuvajAparat = (Aparat) kz.getParametar();
                        ControllerServer.getInstance().dodajAparat(sacuvajAparat);
                        so.setOdgovor("Uspesno sacuvan aparat.");
                        break;
                    case Operacija.OBRISI_APARAT:
                        Aparat obAparat=(Aparat) kz.getParametar();
                        ControllerServer.getInstance().obrisiAparat(obAparat);
                        so.setOdgovor("Uspesno izbrisan aparat.");
                        break;

                }
            } catch (Exception e) {
            }
            posaljiOdgovor(so);
        }
    }
    
    private KlijentskiZahtev primiZahtev() {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            kz = (KlijentskiZahtev) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ObradaKlijentskogZahteva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObradaKlijentskogZahteva.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kz;
    }
    
    private void posaljiOdgovor(ServerskiOdgovor so) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(so);
        } catch (IOException ex) {
            Logger.getLogger(ObradaKlijentskogZahteva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
