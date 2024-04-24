/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Aparat;
import domen.JedinicaMere;
import domen.Magacin;
import domen.Marka;
import domen.Mesto;
import domen.MobilniTelefon;
import domen.Otpremnica;
import domen.Prodavnica;
import domen.Radnik;
import domen.StavkaOtpremnice;
import domen.TipGarancije;
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
public class RepositoryAparat implements DBRepository<Aparat, Object>{
    public Connection konekcija;

    public RepositoryAparat() {
    }

    @Override
    public ArrayList<Aparat> getAll() throws Exception {
        ArrayList<Aparat> lista = new ArrayList<>();
        String upit = "SELECT * FROM aparat a JOIN mobilniTelefon mt ON a.`sifraMT`=mt.`sifraMT` JOIN prodavnica p ON a.`maticniBroj`=p.`maticniBroj` JOIN `otpremnica` o ON o.`brojOtpremnice`=a.`otpremnica`";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
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
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("nazivMesta"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);
                Radnik r = new Radnik(rs.getInt("sifraRadnika"), rs.getString("ime"), rs.getString("prezime"));
                Magacin mg = new Magacin(rs.getInt("sifraMagacina"), rs.getString("nazivMagacina"));
                Otpremnica o = new Otpremnica();
                o.setBrojOtpremnice(rs.getInt("brojOtpremnice"));
                o.setUkupanIznosStavki(rs.getBigDecimal("ukupanIznosStavki"));
                o.setPDV(rs.getInt("PDV"));
                o.setUkupnaVrednost(rs.getBigDecimal("ukupnaVrednost"));
                o.setRadnik(r);
                o.setMagacin(mg);
                o.setProdavnica(p);
                JedinicaMere jm = new JedinicaMere(rs.getInt("sifraJM"), rs.getString("nazivJM"));
                StavkaOtpremnice st = new StavkaOtpremnice();
                st.setRB(rs.getInt("redniBroj"));
                st.setKolicina(rs.getInt("kolicina"));
                st.setCena(rs.getBigDecimal("cena"));
                st.setUkupanIznos(rs.getBigDecimal("ukupanIznos"));
                st.setJedinicaMere(jm);
                st.setMobilniTelefon(mt);
                
                Aparat a = new Aparat(p.getMaticniBroj(), mt.getSifraMT(), rs.getString("barKod"), TipGarancije.valueOf("garancija"), o.getBrojOtpremnice(),st.getRB());
                lista.add(a);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitan aparat!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavan aparat!\n" + ex);
            throw ex;
        }
    }

    @Override
    public ArrayList<Aparat> getAllWhere(String s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Aparat t) throws Exception {
        String upit = "INSERT INTO aparat VALUES(?,?,?,?,?,?)";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, t.getProdavnica());
        ps.setString(2, t.getTelefon());
        ps.setString(3, t.getBarKod());
        ps.setString(4, t.getGarancija().name());
        ps.setInt(5, t.getOtpremnica());
        ps.setInt(6, t.getStavka());
        ps.executeUpdate();
        ps.close();      
     }

    @Override
    public void edit(Aparat t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Aparat t) throws Exception {
        try {
            String query = "DELETE FROM aparat WHERE maticniBroj="+t.getProdavnica()+" AND sifraMT="+t.getTelefon()+" AND otpremnica="+t.getOtpremnica();
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            st.executeUpdate(query);
            System.out.println("Aparat je obrisan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Neuspesno brisanje aparata!");
        }
    }

    @Override
    public Aparat getAllByID(Object k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
