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
public class GetWhereMobilniTelefon extends AbstractSO{
    RepositoryMobilniTelefon storage;
    ArrayList<MobilniTelefon> lista;
    String string;

    public GetWhereMobilniTelefon(String string) {
        storage = new RepositoryMobilniTelefon();
        this.string = string;
    }

    public ArrayList<MobilniTelefon> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        lista = storage.getAllWhere(string);
        System.out.println("iz repos "+lista);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
