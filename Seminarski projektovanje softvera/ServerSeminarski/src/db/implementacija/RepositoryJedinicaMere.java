/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.JedinicaMere;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryJedinicaMere implements DBRepository<JedinicaMere, String>{
    public Connection konekcija;

    public RepositoryJedinicaMere() {
    }

    @Override
    public ArrayList<JedinicaMere> getAll() throws Exception {
        ArrayList<JedinicaMere> lista = new ArrayList<>();
        String upit = "SELECT * FROM jedinicaMere";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                JedinicaMere jm = new JedinicaMere(rs.getInt("sifraJM"), rs.getString("nazivJM"));
                lista.add(jm);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista jedinica mere!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste jedinica mere!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<JedinicaMere> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(JedinicaMere t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(JedinicaMere t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(JedinicaMere t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JedinicaMere getAllByID(String k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
