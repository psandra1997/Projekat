/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Prodavac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class TableModelServer extends AbstractTableModel{
    
    private List<Prodavac> users;
    private String[] columnNames = new String[]{"ID","Korisnicko ime" };

    public TableModelServer(List<Prodavac> users) {
        this.users = users;
    }

    

    @Override
    public int getRowCount() {
       if(users == null) return 0;
       else{
           return users.size();
       }}

    @Override
    public int getColumnCount() {
       return 2;
    }
    
     public String getColumnName(int column) {
        if(column>columnNames.length){
            return "n/a";
        }else{
            return columnNames[column];
        }
    }

//    public void setColumnNames(String[] columnNames) {
//        for(int i =0; i<columnNames.length; i++){
//            
//        }
//    }
     
     

    @Override
    public Object getValueAt(int i, int j) {
        
        Prodavac k = users.get(i);
        switch(j){
            case 0:
               return k.getSifraProdavca();
            case 1:
               return k.getKorisnickoIme();
            default:
                    return "n/a";
        }
         }

//    @Override
//    public void setValueAt(Object o, int i, int j) {
//         Korisnik k = users.get(i);
//        switch(j){
//            case 0:
//              k.setIDKorisnik((int) o);
//              break;
//            case 1:
//              k.setKorisnickoIme(o.toString());
//              break;
//           
//        }
//    }
    public void addUser(Prodavac k){
       
        this.users.add(k);
        
        fireTableRowsInserted(users.size()-1, users.size()-1);
    
    } 
}
