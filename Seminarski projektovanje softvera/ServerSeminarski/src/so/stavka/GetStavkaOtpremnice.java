/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.stavka;

import controller.ControllerServer;
import db.implementacija.RepositoryStavkaOtpremnice;
import domen.StavkaOtpremnice;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class GetStavkaOtpremnice extends AbstractSO {

    private ArrayList<StavkaOtpremnice> lista;
    private final RepositoryStavkaOtpremnice storage;

    public GetStavkaOtpremnice() {
        storage=new RepositoryStavkaOtpremnice();
    }

    public ArrayList<StavkaOtpremnice> getLista() {
        return lista;
    }

    @Override
    protected void prediction(Object o) throws Exception {
       
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        StavkaOtpremnice st=(StavkaOtpremnice) o;
        String brojO=String.valueOf(st.getOtpremnica());
        lista = storage.getAllWhere(brojO);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }

   
    
}

