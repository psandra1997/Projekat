/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;


import db.konekcija.DBKonekcija;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandra
 */
public abstract class AbstractSO {
    
    public void execute(Object o) throws Exception{
        try{

            prediction(o);
            startTransaction();
            executeOperation(o);
            commitTransaction();
          //  System.out.println("Uspesno izvrsena transakcija.");
        } catch (Exception ex) {
            rollbackTransaction();
            System.out.println("Neuspesno izvrsene transakcije!"+ex.getMessage());
        }
    }

    protected abstract void prediction(Object o) throws Exception;
    protected abstract void executeOperation(Object o)throws Exception;
    protected abstract void startTransaction() throws SQLException, IOException ;

    private void commitTransaction() {
        try {
            DBKonekcija.getInstanca().konekcija().commit();
           // System.out.println("Transakcija je uspesna.");
        } catch (SQLException ex) {
            Logger.getLogger(AbstractSO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void rollbackTransaction() {
        try {
            DBKonekcija.getInstanca().konekcija().rollback();
            System.out.println("Transakcija je ponistena.");
        } catch (SQLException ex) {
            Logger.getLogger(AbstractSO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
