/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.magacin;

import db.implementacija.RepositoryMagacin;
import domen.Magacin;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetMagacin extends AbstractSO{
    private ArrayList<Magacin> lista;
    private final RepositoryMagacin storage;

    public GetMagacin() {
    storage=new RepositoryMagacin();
    }

    public ArrayList<Magacin> getLista() {
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
