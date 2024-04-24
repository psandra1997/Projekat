/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.MobilniTelefon;
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
public class ModelTabeleMT extends AbstractTableModel implements Runnable{
    ArrayList<MobilniTelefon> lista;
    String[] imeKolona = {"Naziv", "Marka", "Memorija", "Boja"};
    String parametar="";

    public ModelTabeleMT(ArrayList<MobilniTelefon> lista) {
        this.lista = lista;
    }

    public ArrayList<MobilniTelefon> getLista() {

        return lista;
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
        MobilniTelefon mt = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mt.getNazivMT();
            case 1:
                return mt.getMarka().getNazivMarke();
            case 2:
                return mt.getMemorija();
            case 3:
                return mt.getBoja();
            default:
                return "";

        }
    }

    @Override
    public String getColumnName(int column) {
        return imeKolona[column];
    }

    public MobilniTelefon getSelectedMT(int red) {
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
            lista = ControllerKlijent.getInstanca().getMobilniTelefoni();
            ArrayList<MobilniTelefon> novaLista = new ArrayList<>();
            for (MobilniTelefon mt : lista) {
                if (mt.getNazivMT().toLowerCase().contains(parametar.toLowerCase())|| mt.getMarka().getNazivMarke().toLowerCase().contains(parametar.toLowerCase())) {
                    novaLista.add(mt);
                }
            }
            lista= novaLista;

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sistem ne moze da pronađe mobilni telefon po nazivu! ");
            } 
            fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
