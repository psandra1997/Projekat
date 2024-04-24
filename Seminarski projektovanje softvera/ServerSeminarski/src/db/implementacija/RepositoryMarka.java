/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Marka;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryMarka implements DBRepository<Marka, Object>{
    private Connection konekcija;

    public RepositoryMarka() {
    }

    @Override
    public ArrayList<Marka> getAll() throws Exception {
        ArrayList<Marka> lista = new ArrayList<>();
        String upit = "SELECT * FROM marka";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Marka m = new Marka(rs.getInt("sifraMarke"), rs.getString("nazivMarke"));
                lista.add(m);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista marki telefona!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste marki telefona!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<Marka> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Marka t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Marka t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Marka t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Marka getAllByID(Object k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
