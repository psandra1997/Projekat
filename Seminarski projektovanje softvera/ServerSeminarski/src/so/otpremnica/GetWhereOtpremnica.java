/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.otpremnica;

import db.implementacija.RepositoryOtpremnica;
import domen.Otpremnica;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetWhereOtpremnica extends AbstractSO{
    RepositoryOtpremnica storage;
    ArrayList<Otpremnica> lista;
    String string;

    public GetWhereOtpremnica(String string) {
        storage = new RepositoryOtpremnica();
        this.string = string;
    }

    public ArrayList<Otpremnica> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        lista = storage.getAllWhere(string);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
}
