/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.marka;

import db.implementacija.RepositoryMarka;
import domen.Marka;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetMarka extends AbstractSO {

    private ArrayList<Marka> lista;
    private final RepositoryMarka storage;

    public GetMarka() {
        storage=new RepositoryMarka();
    }

    public ArrayList<Marka> getLista() {
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
