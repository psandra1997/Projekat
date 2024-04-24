/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.mobilniTelefon;

import controller.ControllerServer;
import db.implementacija.RepositoryMobilniTelefon;
import domen.MobilniTelefon;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import so.AbstractSO;

/**
 *
 * @author Sandra
 */
public class AddMobilniTelefon extends AbstractSO{
    private final RepositoryMobilniTelefon storage;

    public AddMobilniTelefon() {
        storage = new RepositoryMobilniTelefon();
    }

    @Override
    protected void prediction(Object o) throws Exception {
        if (o == null || !(o instanceof MobilniTelefon)) {
            throw new Exception("Pogresni parametri...");
        }
        MobilniTelefon mt = (MobilniTelefon) o;
        ArrayList<MobilniTelefon> lista=ControllerServer.getInstance().vratiMobilniTelefon();
        for (MobilniTelefon mobilniTelefon : lista) {
            if(mobilniTelefon.getSifraMT().equals(mt.getSifraMT())){
                 JOptionPane.showMessageDialog(null, "Unesite novu sifru!", "Greska", JOptionPane.ERROR_MESSAGE);
                 return;
            }
        }
        if (mt.getSifraMT().isEmpty()) {
            throw new Exception("Morate uneti sifru!");
        }
    }

    @Override
    protected void executeOperation(Object o) throws Exception {
        storage.add((MobilniTelefon) o);
    }

    @Override
    protected void startTransaction() throws SQLException, IOException {
        storage.otvoriKonekciju();
    }
    
}
