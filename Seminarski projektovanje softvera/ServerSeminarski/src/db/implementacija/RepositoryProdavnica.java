/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Mesto;
import domen.Prodavnica;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryProdavnica implements DBRepository<Prodavnica, Object>{
public Connection konekcija;

    public RepositoryProdavnica() {
    }

    @Override
    public ArrayList<Prodavnica> getAll() throws Exception {
        ArrayList<Prodavnica> lista = new ArrayList<>();
        String upit = "SELECT * FROM prodavnica p join mesto m on p.mestoID=m.postanskiBroj";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("nazivMesta"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);
                lista.add(p);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista prodavnica!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste prodavnica!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<Prodavnica> getAllWhere(String s) throws Exception {
        ArrayList<Prodavnica> lista = new ArrayList<>();
        String upit = "SELECT * FROM prodavnica p join mesto m on p.mesto=m.postanskiBroj  WHERE p.naziv LIKE '"+s+"%'";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            ResultSet rs = st.executeQuery(upit);
            while (rs.next()) {
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("naziv"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);
                lista.add(p);
            }
            rs.close();
            st.close();
            System.out.println("Uspesno ucitana lista magacina!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste magacina!\n" + ex);
            throw ex;
        }
       
    }

    @Override
    public void add(Prodavnica t) throws Exception {
        String upit = "INSERT INTO prodavnica VALUES(?,?,?,?,?,?,?,?,?)";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, t.getMaticniBroj());
        ps.setString(2, t.getPIB());
        ps.setString(3, t.getNaziv());
        ps.setString(4, t.getAdresa());
        ps.setString(5, t.getTekuciRacun());
        ps.setString(6, t.getBrojTelefona());
        ps.setString(7, t.getDelatnost());
        ps.setDate(8, new Date(t.getDatumOsnivanja().getTime()));
        ps.setString(9, t.getMesto().getPostanskiBroj());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void edit(Prodavnica t) throws Exception {
        String upit = "UPDATE prodavnica SET PIB=?,naziv=?,adresa=?,tekuciRacun=?,brojTelefona=?,delatnost=?,datumOsnivanja=? WHERE maticniBroj=?";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, t.getPIB());
        ps.setString(2, t.getNaziv());
        ps.setString(3, t.getAdresa());
        ps.setString(4, t.getTekuciRacun());
        ps.setString(5, t.getBrojTelefona());
        ps.setString(6, t.getDelatnost());
        ps.setDate(7, new java.sql.Date(t.getDatumOsnivanja().getTime()));
        ps.setString(8, t.getMaticniBroj());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void delete(Prodavnica t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prodavnica getAllByID(Object k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
