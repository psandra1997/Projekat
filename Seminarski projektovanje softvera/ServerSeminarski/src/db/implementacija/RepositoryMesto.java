/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Mesto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryMesto implements DBRepository<Mesto, String>{
    private Connection konekcija;

    public RepositoryMesto() {
    }

    
    @Override
    public ArrayList<Mesto> getAll() throws Exception {
       ArrayList<Mesto> lista = new ArrayList<>();
        String upit = "SELECT * FROM mesto";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Mesto m = new Mesto(rs.getString("postanskiBroj"), rs.getString("nazivMesta"));
                lista.add(m);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista mesta!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste mesta!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<Mesto> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Mesto t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Mesto t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Mesto t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mesto getAllByID(String k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
