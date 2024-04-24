/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Prodavac;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryProdavac implements DBRepository<Prodavac, String> {
    private Connection konekcija;

    public RepositoryProdavac() {
    }
    
    @Override
    public ArrayList<Prodavac> getAll() throws Exception {
        ArrayList<Prodavac> lista = new ArrayList<>();
        String upit = "SELECT ime,prezime,korisnickoIme,lozinka FROM prodavac";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Prodavac p = new Prodavac();
                p.setIme(rs.getString("ime"));
                p.setPrezime(rs.getString("prezime"));
                p.setKorisnickoIme(rs.getString("korisnickoIme"));
                p.setLozinka(rs.getString("lozinka"));
                lista.add(p);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista prodavaca!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste prodavaca!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<Prodavac> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Prodavac t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Prodavac t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Prodavac t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prodavac getAllByID(String k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
