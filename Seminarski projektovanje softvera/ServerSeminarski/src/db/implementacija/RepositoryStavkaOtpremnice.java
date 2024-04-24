/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.JedinicaMere;
import domen.Marka;
import domen.MobilniTelefon;
import domen.StavkaOtpremnice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class RepositoryStavkaOtpremnice implements DBRepository<StavkaOtpremnice, String>{

    public Connection konekcija;
    public RepositoryStavkaOtpremnice() {
    }

    @Override
    public ArrayList<StavkaOtpremnice> getAll() throws Exception {
    ArrayList<StavkaOtpremnice> lista = new ArrayList<>();
        String upit = "SELECT * FROM stavkaOtpremnice st JOIN `jedinicamere` jm ON st.`sifraJM`=jm.`sifraJM` JOIN `mobilnitelefon` mt ON st.`sifraMT`=mt.`sifraMT` JOIN marka marka ON marka.`sifraMarke`=mt.`sifraMarke` ORDER BY st.`brojOtpremnice`";
        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                JedinicaMere jm = new JedinicaMere(rs.getInt("sifraJM"), rs.getString("nazivJM"));
                Marka m = new Marka(rs.getInt("sifraMarke"), rs.getString("nazivMarke"));
                MobilniTelefon mt = new MobilniTelefon();
                mt.setSifraMT(rs.getString("sifraMT"));
                mt.setNazivMT(rs.getString("nazivMT"));
                mt.setDimenzija(rs.getString("dimenzija"));
                mt.setProcesor(rs.getString("procesor"));
                mt.setBaterija(rs.getString("baterija"));
                mt.setKamera(rs.getString("kamera"));
                mt.setMemorija(rs.getString("memorija"));
                mt.setBoja(rs.getString("boja"));
                mt.setMarka(m);
                StavkaOtpremnice st = new StavkaOtpremnice();
                st.setOtpremnica(rs.getInt("brojOtpremnice"));
                st.setRB(rs.getInt("redniBroj"));
                st.setKolicina(rs.getInt("kolicina"));
                st.setCena(rs.getBigDecimal("cena"));
                st.setUkupanIznos(rs.getBigDecimal("ukupanIznos"));
                st.setJedinicaMere(jm);
                st.setMobilniTelefon(mt);
                lista.add(st);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista stavki otpremnica!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste stavki otpremnice!\n" + ex);
            throw ex;
        }    
    }

    @Override
    public ArrayList<StavkaOtpremnice> getAllWhere(String s) throws Exception {
        ArrayList<StavkaOtpremnice> lista = new ArrayList<>();
        String upit ="SELECT * FROM stavkaOtpremnice st JOIN `jedinicamere` jm ON st.`sifraJM`=jm.`sifraJM` JOIN `mobilnitelefon` mt ON st.`sifraMT`=mt.`sifraMT` JOIN marka marka ON marka.`sifraMarke`=mt.`sifraMarke` WHERE st.brojOtpremnice LIKE '"+s+"%' ";
        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement sta = konekcija.createStatement();
            ResultSet rs = sta.executeQuery(upit);
            while (rs.next()) {
                JedinicaMere jm = new JedinicaMere(rs.getInt("sifraJM"), rs.getString("nazivJM"));
                Marka m = new Marka(rs.getInt("sifraMarke"), rs.getString("nazivMarke"));
                MobilniTelefon mt = new MobilniTelefon();
                mt.setSifraMT(rs.getString("sifraMT"));
                mt.setNazivMT(rs.getString("nazivMT"));
                mt.setDimenzija(rs.getString("dimenzija"));
                mt.setProcesor(rs.getString("procesor"));
                mt.setBaterija(rs.getString("baterija"));
                mt.setKamera(rs.getString("kamera"));
                mt.setMemorija(rs.getString("memorija"));
                mt.setBoja(rs.getString("boja"));
                mt.setMarka(m);
                StavkaOtpremnice st = new StavkaOtpremnice();
                st.setOtpremnica(rs.getInt("brojOtpremnice"));
                st.setRB(rs.getInt("redniBroj"));
                st.setKolicina(rs.getInt("kolicina"));
                st.setCena(rs.getBigDecimal("cena"));
                st.setUkupanIznos(rs.getBigDecimal("ukupanIznos"));
                st.setJedinicaMere(jm);
                st.setMobilniTelefon(mt);
                lista.add(st);
            }
            rs.close();
            sta.close();
            System.out.println("Uspesno ucitana lista stavki otpremnica!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste stavki otpremnice!\n" + ex);
            throw ex;
        }
    }

    @Override
    public void add(StavkaOtpremnice t) throws Exception {
        String upit = "INSERT INTO stavkaOtpremnice VALUES(?,?,?,?,?,?,?)";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setInt(1, t.getOtpremnica());
        ps.setInt(2, t.getRB());
        ps.setInt(3, t.getKolicina());
        ps.setBigDecimal(4, t.getCena());
        ps.setBigDecimal(5, t.getUkupanIznos());
        ps.setInt(6, t.getJedinicaMere().getSifraJM());
        ps.setString(7, t.getMobilniTelefon().getSifraMT());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void edit(StavkaOtpremnice t) throws Exception {
    }

    @Override
    public void delete(StavkaOtpremnice t) throws Exception {
        try {
            String query = "DELETE FROM stavkaOtpremnice WHERE brojOtpremnice = " + t.getOtpremnica();
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            st.executeUpdate(query);
            System.out.println("Stavka otpremnice je obrisana!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Neuspesno brisanje stavke otpremnice!");
        }
    }

    @Override
    public StavkaOtpremnice getAllByID(String k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
