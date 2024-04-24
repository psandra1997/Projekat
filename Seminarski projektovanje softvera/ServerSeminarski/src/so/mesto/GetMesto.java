/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.mesto;

import db.implementacija.RepositoryMarka;
import db.implementacija.RepositoryMesto;
import domen.Marka;
import domen.Mesto;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetMesto extends AbstractSO{

    private ArrayList<Mesto> lista;
    private final RepositoryMesto storage;

    public GetMesto() {
        storage = new RepositoryMesto();
    }

    public ArrayList<Mesto> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
//        if (!(o instanceof Mesto)) {
//            throw new Exception("Prosledjeni objekat nije instanca klase mesto!");
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
