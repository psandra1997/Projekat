/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.radnik;

import db.implementacija.RepositoryRadnik;
import domen.Radnik;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetRadnik extends AbstractSO{

    private ArrayList<Radnik> lista;
    private final RepositoryRadnik storage;

    public GetRadnik() {
        storage=new RepositoryRadnik();
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
     public ArrayList<Radnik> getLista() {
        return lista;
    }
}
