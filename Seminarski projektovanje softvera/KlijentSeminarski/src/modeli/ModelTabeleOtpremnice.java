/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Otpremnica;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import kontroler.ControllerKlijent;

/**
 *
 * @author Sandra
 */
public class ModelTabeleOtpremnice extends AbstractTableModel implements  Runnable{
    ArrayList<Otpremnica> listaOtpremnica;
    String[] imeKolona = {"Broj otpremnice", "Vrednost stavki", "PDV", "Ukupna vrednost", "Radnik", "Magacin", "Prodavnica"};
    private int parametar;

    public ModelTabeleOtpremnice() {
        try {
            listaOtpremnica = ControllerKlijent.getInstanca().getOtpremnice();
        } catch (Exception ex) {
            Logger.getLogger(ModelTabeleOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        if (listaOtpremnica.isEmpty()) {
            return 0;
        }
        return listaOtpremnica.size();
    }

    @Override
    public int getColumnCount() {
       return imeKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     Otpremnica o=listaOtpremnica.get(rowIndex);
     switch(columnIndex){
         case 0: return o.getBrojOtpremnice();
         case 1: return o.getUkupanIznosStavki();
         case 2: return o.getPDV();
         case 3: return o.getUkupnaVrednost();
         case 4: return o.getRadnik();
         case 5: return o.getMagacin();
         case 6: return o.getProdavnica().getNaziv();
         default:return "";
     }
    }

    public ArrayList<Otpremnica> getListaOtpremnica() {
        return listaOtpremnica;
    }

    @Override
    public String getColumnName(int column) {
        return imeKolona[column];
    }

    public Otpremnica getSelectedOtpremnica(int red) {
        return listaOtpremnica.get(red);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(5000);
                osveziTabelu();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ModelTabeleOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void setParametarPretrage(int parametar) {
        this.parametar = parametar;
        osveziTabelu();
    }

    public void osveziTabelu() {
        try {
            listaOtpremnica = ControllerKlijent.getInstanca().getOtpremnice();
            ArrayList<Otpremnica> novaLista = new ArrayList<>();
            for (Otpremnica o : listaOtpremnica) {
                String otp = String.valueOf(o.getBrojOtpremnice());
                String par = String.valueOf(parametar);
                if (otp.contains(par)) {
                    novaLista.add(o);
                }
            }
            listaOtpremnica = novaLista;
            if (listaOtpremnica.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sistem ne moze da pronađe otpremnicu po broju otpremnice!","Greska",JOptionPane.ERROR_MESSAGE);
            } 
            fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
