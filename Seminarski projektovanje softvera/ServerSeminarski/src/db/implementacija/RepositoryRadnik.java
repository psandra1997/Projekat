/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Radnik;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryRadnik implements DBRepository<Radnik, Integer>{
    private Connection konekcija;

    public RepositoryRadnik() {
    }
    
    @Override
    public ArrayList<Radnik> getAll() throws Exception {
         ArrayList<Radnik> lista = new ArrayList<>();
        String upit = "SELECT * FROM radnik";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Radnik r=new Radnik(rs.getInt("sifraRadnika"),rs.getString("ime"),rs.getString("prezime"));
                lista.add(r);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista radnika!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste radnika!\n" + ex);
            throw ex;
        }
       }

    @Override
    public ArrayList<Radnik> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Radnik t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Radnik t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Radnik t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Radnik getAllByID(Integer k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
