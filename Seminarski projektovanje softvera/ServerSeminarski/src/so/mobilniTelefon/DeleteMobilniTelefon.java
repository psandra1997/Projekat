/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.mobilniTelefon;

import db.implementacija.RepositoryMobilniTelefon;
import domen.MobilniTelefon;
import java.io.IOException;
import java.sql.SQLException;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class DeleteMobilniTelefon extends AbstractSO {

    RepositoryMobilniTelefon storage;
    
    public DeleteMobilniTelefon() {
        storage = new RepositoryMobilniTelefon();
    }
    
    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof MobilniTelefon)) {
            throw new Exception("Pogresni parametri...");
        }
        MobilniTelefon mt = (MobilniTelefon) o;
    }
    
    @Override
    protected void executeOperation(Object o) throws Exception {
        storage.delete((MobilniTelefon) o);
    }
    
    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}