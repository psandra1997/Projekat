/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.MobilniTelefon;
import domen.Otpremnica;
import domen.StavkaOtpremnice;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import kontroler.ControllerKlijent;

/**
 * @author Sandra
 */
public class ModelTabeleStavkiOtpremnice extends AbstractTableModel{
    ArrayList<StavkaOtpremnice> lista;
    String[] imeKolona = {"RB", "Naziv artikla", "Kolicina", "Jedinica mere", "Cena", "Ukupno"};
    private int rb = 0;

    public ModelTabeleStavkiOtpremnice(ArrayList<StavkaOtpremnice> lista) {
        this.lista = lista;
    }

    public ModelTabeleStavkiOtpremnice() {
        lista=new ArrayList<>();
    }

    public ModelTabeleStavkiOtpremnice(Otpremnica o) {
        try {
            lista = ControllerKlijent.getInstanca().vratiStavkeZaOtpremnicu(o);
        } catch (Exception ex) {
            Logger.getLogger(ModelTabeleStavkiOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public int getRowCount() {
     if (lista.isEmpty()) {
            return 0;
        }
        return lista.size();
    }

    @Override
    public int getColumnCount() {
     return imeKolona.length;  
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
      StavkaOtpremnice stavka=lista.get(rowIndex);

         switch(columnIndex){
          case 0: return stavka.getRB();
          case 1: return stavka.getMobilniTelefon().getNazivMT();
          case 2: return stavka.getKolicina();
          case 3: return stavka.getJedinicaMere().getNazivJM();
          case 4: return stavka.getCena();
          case 5: return stavka.getUkupanIznos();
          default:return "";
      }
    }

    @Override
    public String getColumnName(int column) {
        return imeKolona[column];
    }

    public ArrayList<StavkaOtpremnice> getLista() {
        return lista;
    }

     public void dodajStavku(StavkaOtpremnice st) {
        rb = lista.size();
        st.setRB(++rb);
        lista.add(st);
        fireTableDataChanged();
    }
     
  public void obrisiStavku(int row) {
        lista.remove(row);
        rb = 0;
        for (StavkaOtpremnice stavkaOtpremnice : lista) {
            stavkaOtpremnice.setRB(++rb);
        }
        fireTableDataChanged();
    }
  
    public boolean postojiMobilni(MobilniTelefon mt) {
        for (StavkaOtpremnice stavkaOtpremnice : lista) {
            if (mt.getNazivMT().equals(stavkaOtpremnice.getMobilniTelefon().getNazivMT())) {
                return true;
            }
        }
        return false;
    }
    
    public StavkaOtpremnice getStavka(int row){
        return lista.get(row);
    }
    
    public void isprazniTabelu(){
        lista.clear();
        fireTableDataChanged();
    }
 
}
