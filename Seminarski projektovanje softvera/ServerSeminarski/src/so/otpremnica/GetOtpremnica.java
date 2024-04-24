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
public class GetOtpremnica extends AbstractSO {

    private ArrayList<Otpremnica> lista;
    private final RepositoryOtpremnica storage;

    public GetOtpremnica() throws Exception {
        storage=new RepositoryOtpremnica();
    }

    @Override
    protected void prediction(Object o) throws Exception {
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        lista = (ArrayList<Otpremnica>)storage.getAll();
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    public ArrayList<Otpremnica> getLista() {
        return lista;
    }
}
