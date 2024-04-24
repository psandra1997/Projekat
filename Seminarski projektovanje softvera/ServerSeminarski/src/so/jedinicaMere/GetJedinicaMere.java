/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.jedinicaMere;

import db.implementacija.RepositoryJedinicaMere;
import domen.JedinicaMere;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetJedinicaMere extends AbstractSO {

    private final RepositoryJedinicaMere storage;
    private ArrayList<JedinicaMere> lista;

    public GetJedinicaMere() {
    storage=new RepositoryJedinicaMere();
    }

    public ArrayList<JedinicaMere> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
    lista=storage.getAll();
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
      storage.otvoriKonekciju();
    }
    
}
