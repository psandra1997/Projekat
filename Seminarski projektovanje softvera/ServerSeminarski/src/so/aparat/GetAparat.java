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
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetAparat extends AbstractSO{

    private final RepositoryAparat storage;
    private ArrayList<Aparat> lista;

    public GetAparat() {
        storage=new RepositoryAparat();
    }

    public ArrayList<Aparat> getLista() {
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
