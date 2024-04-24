/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.aparat;

import db.implementacija.RepositoryAparat;
import domen.Aparat;
import java.io.IOException;
import java.sql.SQLException;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class DeleteAparat extends AbstractSO {
  
    RepositoryAparat storage;

    public DeleteAparat() {
        storage = new RepositoryAparat();
    }

    @Override
    protected void prediction(Object o) throws Exception {
     if (o == null || !(o instanceof Aparat)) {
            throw new Exception("Pogresni parametri...");
        }
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        storage.delete((Aparat) o);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
