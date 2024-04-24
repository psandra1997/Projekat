/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.prodavnica;

import db.implementacija.RepositoryProdavnica;
import domen.Prodavnica;
import java.io.IOException;
import java.sql.SQLException;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class AddProdavnica extends AbstractSO{

     RepositoryProdavnica storage;

    public AddProdavnica() {
        storage = new RepositoryProdavnica();
    }

    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof Prodavnica)) {
            throw new Exception("Pogresni parametri...");
        }
        Prodavnica p = (Prodavnica) o;
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        storage.add((Prodavnica) o);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
