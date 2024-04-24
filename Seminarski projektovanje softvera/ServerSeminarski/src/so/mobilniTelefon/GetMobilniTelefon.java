/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.mobilniTelefon;

import db.implementacija.RepositoryMobilniTelefon;
import domen.MobilniTelefon;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetMobilniTelefon extends AbstractSO{
    private ArrayList<MobilniTelefon> lista;
    private final RepositoryMobilniTelefon storage;

    public GetMobilniTelefon() {
        storage=new RepositoryMobilniTelefon();
    }

    public ArrayList<MobilniTelefon> getLista() {
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
