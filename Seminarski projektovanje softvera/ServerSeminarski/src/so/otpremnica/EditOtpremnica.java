/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.otpremnica;

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
public class EditOtpremnica extends AbstractSO{
    RepositoryOtpremnica storage;
    RepositoryStavkaOtpremnice storageStavka;

    public EditOtpremnica() {
        storage = new RepositoryOtpremnica();
        storageStavka=new RepositoryStavkaOtpremnice();
    }

    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof Otpremnica)) {
            throw new Exception("Pogresni parametri...");
        }
        Otpremnica otpremnica = (Otpremnica) o;
        if(otpremnica.getListaStavki().isEmpty()){
            throw new Exception("Otpremnica mora imati stavke.");
        }
        
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        Otpremnica otpremnica=(Otpremnica) o;
        storage.edit(otpremnica);
       
        //brisemo sve stavke otpremnice
        storageStavka.delete(otpremnica.getListaStavki().get(0));
        //dodamo nove stavke
       
        for (StavkaOtpremnice stavka : otpremnica.getListaStavki()) {
            stavka.setOtpremnica(otpremnica.getBrojOtpremnice());
             storageStavka.add(stavka);
        }
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
}
