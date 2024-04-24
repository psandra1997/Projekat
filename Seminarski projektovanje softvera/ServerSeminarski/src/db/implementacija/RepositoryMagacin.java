/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Magacin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryMagacin implements DBRepository<Magacin, Object>{
    private Connection konekcija;

    public RepositoryMagacin() {
    }
    
    @Override
    public ArrayList<Magacin> getAll() throws Exception {
     ArrayList<Magacin> lista = new ArrayList<>();
        String upit = "SELECT * FROM magacin";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Magacin m=new Magacin(rs.getInt("sifraMagacina"), rs.getString("nazivMagacina"));
                lista.add(m);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista magacina!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste magacina!\n" + ex);
            throw ex;
        } 
    }

    @Override
    public ArrayList<Magacin> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Magacin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Magacin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Magacin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Magacin getAllByID(Object k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
