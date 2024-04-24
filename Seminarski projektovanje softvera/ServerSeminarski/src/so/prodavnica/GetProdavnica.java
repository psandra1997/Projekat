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
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetProdavnica extends AbstractSO{
    private ArrayList<Prodavnica> lista;
    private final RepositoryProdavnica storage;

    public GetProdavnica() {
        storage=new RepositoryProdavnica();
    }

    public ArrayList<Prodavnica> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
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
