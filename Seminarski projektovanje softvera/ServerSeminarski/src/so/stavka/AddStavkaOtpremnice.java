/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.stavka;

import db.implementacija.RepositoryStavkaOtpremnice;
import domen.StavkaOtpremnice;
import java.io.IOException;
import java.sql.SQLException;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class AddStavkaOtpremnice extends AbstractSO{
     RepositoryStavkaOtpremnice storage;
    
    public AddStavkaOtpremnice() {
        storage = new RepositoryStavkaOtpremnice();
    }

    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof StavkaOtpremnice)) {
            throw new Exception("Pogresni parametri...");
        }        
        StavkaOtpremnice sto = (StavkaOtpremnice) o;
    }
    
    @Override
    protected void executeOperation(Object o) throws Exception {
        storage.add((StavkaOtpremnice) o);
    }
    
    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
