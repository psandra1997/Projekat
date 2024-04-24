/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.otpremnica;

import db.implementacija.RepositoryAparat;
import db.implementacija.RepositoryOtpremnica;
import db.implementacija.RepositoryStavkaOtpremnice;
import domen.Otpremnica;
import domen.StavkaOtpremnice;
import java.io.IOException;
import java.sql.SQLException;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class AddOtpremnica extends AbstractSO{

     private final RepositoryOtpremnica storageOtpremnica;
    
    public AddOtpremnica() {
        storageOtpremnica = new RepositoryOtpremnica();
    }
    
    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof Otpremnica)) {
            throw new Exception("Pogresni parametri...");
        }
        Otpremnica otpremnica = (Otpremnica) o;
    }
    
    @Override
    protected void executeOperation(Object o) throws Exception {
        storageOtpremnica.add((Otpremnica) o);
    }
    
    @Override
    protected void startTransaction() throws SQLException, IOException {
        storageOtpremnica.otvoriKonekciju();
    }
    
}
