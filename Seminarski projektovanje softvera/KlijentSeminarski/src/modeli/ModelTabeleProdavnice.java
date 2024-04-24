/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Prodavnica;
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
public class ModelTabeleProdavnice extends AbstractTableModel implements Runnable{
    ArrayList<Prodavnica> lista;
    String[] imeKolona = {"Maticni broj", "PIB", "Naziv", "Adresa","Mesto"};
    String parametar = "";

    public ModelTabeleProdavnice(ArrayList<Prodavnica> lista) {
        this.lista = lista;
    }

    public ArrayList<Prodavnica> getLista() {
        return lista;
    }
    
    @Override
    public int getRowCount() {
     return lista.size();
    }

    @Override
    public int getColumnCount() {
    return imeKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prodavnica p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getMaticniBroj();
            case 1:
                return p.getPIB();
            case 2:
                return p.getNaziv();
            case 3:
                return p.getAdresa();
                 case 4:
                return p.getMesto().getPostanskiBroj()+" "+p.getMesto().getNazivMesta();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return imeKolona[column];
    }

    public Prodavnica getProdavnica(int red){
        return lista.get(red);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(5000);
                osveziTabelu();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ModelTabeleMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setParametarPretrage(String parametar) {
        this.parametar = parametar;
        osveziTabelu();
    }

 public void osveziTabelu() {
        try {
            lista = ControllerKlijent.getInstanca().getProdavnica();
            ArrayList<Prodavnica> novaLista = new ArrayList<>();
            for (Prodavnica pr : lista) {
                if (pr.getNaziv().toLowerCase().contains(parametar.toLowerCase())) {
                    novaLista.add(pr);
                }
            }
            lista= novaLista;
            if(lista.isEmpty()) JOptionPane.showMessageDialog(null, "Sistem ne moze da pronađe prodavnicu po nazivu! ");
            else JOptionPane.showMessageDialog(null, "Sistem je našao prodavnicu po nazivu.");
            
            fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
