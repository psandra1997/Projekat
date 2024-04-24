/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.prodavac;

import db.implementacija.RepositoryProdavac;
import domen.Prodavac;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetProdavac extends AbstractSO{

    private ArrayList<Prodavac> lista;
    private final RepositoryProdavac storage;

    public GetProdavac() {
        storage = new RepositoryProdavac();
    }

    public ArrayList<Prodavac> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
//    if (!(o instanceof Prodavac)) {
//            throw new Exception("Prosledjeni objekat nije instanca klase prodavac!");
//        }
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        lista = storage.getAll();
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
