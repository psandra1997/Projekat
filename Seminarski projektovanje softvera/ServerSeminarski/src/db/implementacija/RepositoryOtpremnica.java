/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Magacin;
import domen.Mesto;
import domen.Otpremnica;
import domen.Prodavnica;
import domen.Radnik;
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
public class RepositoryOtpremnica implements DBRepository<Otpremnica, Integer>{
public Connection konekcija;

    public RepositoryOtpremnica() {
    }

    @Override
    public ArrayList<Otpremnica> getAll() throws Exception {
        ArrayList<Otpremnica> lista = new ArrayList<>();
        String upit =
            "SELECT * FROM otpremnica o JOIN radnik r ON o.radnik=r.sifraRadnika JOIN magacin mg ON o.magacin=mg.sifraMagacina JOIN prodavnica p ON o.prodavnica=p.maticniBroj JOIN mesto mesto ON p.`mestoID`=mesto.`postanskiBroj` ORDER BY o.`brojOtpremnice`";
        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Radnik r = new Radnik(rs.getInt("sifraRadnika"), rs.getString("ime"), rs.getString("prezime"));
                Magacin m = new Magacin(rs.getInt("sifraMagacina"), rs.getString("nazivMagacina"));
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("nazivMesta"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);

                Otpremnica o = new Otpremnica();
                o.setBrojOtpremnice(rs.getInt("brojOtpremnice"));
                o.setUkupanIznosStavki(rs.getBigDecimal("ukupanIznosStavki"));
                o.setPDV(rs.getInt("PDV"));
                o.setUkupnaVrednost(rs.getBigDecimal("ukupnaVrednost"));
                o.setRadnik(r);
                o.setMagacin(m);
                o.setProdavnica(p);
                lista.add(o);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista otpremnica!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste otpremnice!\n" + ex);
            throw ex;
        }     
    }

    @Override
    public ArrayList<Otpremnica> getAllWhere(String s) throws Exception {
      ArrayList<Otpremnica> lista = new ArrayList<>();
        String upit = "SELECT * FROM otpremnica o "
                + "JOIN radnik r ON o.radnik=r.sifraRadnika "
                + "JOIN magacin mg ON o.magacin=mg.sifraMagacina"
                + "JOIN prodavnica p ON o.prodavnica=p.maticniBroj WHERE o.brojOtpremnice LIKE '"+s+"%'";
        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            ResultSet rs = st.executeQuery(upit);
            while (rs.next()) {
                Radnik r = new Radnik(rs.getInt("sifraRadnka"), rs.getString("ime"), rs.getString("prezime"));
                Magacin m = new Magacin(rs.getInt("sifraMagacina"), rs.getString("nazivMagacina"));
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("naziv"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);

                Otpremnica o = new Otpremnica();
                o.setBrojOtpremnice(rs.getInt("brojOtpremnice"));
                o.setUkupanIznosStavki(rs.getBigDecimal("ukupanIznosStavki"));
                o.setPDV(rs.getInt("PDV"));
                o.setUkupnaVrednost(rs.getBigDecimal("ukupnaVrednost"));
                o.setRadnik(r);
                o.setMagacin(m);
                o.setProdavnica(p);
                lista.add(o);
            }
            rs.close();
            st.close();
            System.out.println("Uspesno ucitana lista otpremnica!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste otpremnice!\n" + ex);
            throw ex;
        }  
    }

    @Override
    public void add(Otpremnica t) throws Exception {
        String upit = "INSERT INTO otpremnica VALUES(?,?,?,?,?,?,?)";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, t.getBrojOtpremnice());
        ps.setBigDecimal(2, t.getUkupanIznosStavki());
        ps.setInt(3, t.getPDV());
        ps.setBigDecimal(4, t.getUkupnaVrednost());
        ps.setInt(5, t.getRadnik().getSifraRadnika());
        ps.setInt(6, t.getMagacin().getSifraMagacina());
        ps.setString(7, t.getProdavnica().getMaticniBroj());
        ps.executeUpdate();

        String upit1 = "INSERT INTO stavkaOtpremnice VALUES(?,?,?,?,?,?,?)";
        ps = konekcija.prepareStatement(upit1);
        for (StavkaOtpremnice stot : t.getListaStavki()) {
            ps.setInt(1, t.getBrojOtpremnice());
            ps.setInt(2, stot.getRB());
            ps.setInt(3, stot.getKolicina());
            ps.setBigDecimal(4, stot.getCena());
            ps.setBigDecimal(5, stot.getUkupanIznos());
            ps.setInt(6, stot.getJedinicaMere().getSifraJM());
            ps.setString(7, stot.getMobilniTelefon().getSifraMT());
            ps.executeUpdate();
        }
        ps.close();

    }

    @Override
    public void edit(Otpremnica t) throws Exception {
        String upit = "UPDATE otpremnica SET ukupanIznosStavki=?,PDV=?,ukupnaVrednost=?,radnik=?,magacin=?,prodavnica=? WHERE brojOtpremnice = " + t.getBrojOtpremnice();
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setBigDecimal(1, t.getUkupanIznosStavki());
        ps.setInt(2, t.getPDV());
        ps.setBigDecimal(3, t.getUkupnaVrednost());
        ps.setInt(4, t.getRadnik().getSifraRadnika());
        ps.setInt(5, t.getMagacin().getSifraMagacina());
        ps.setString(6, t.getProdavnica().getMaticniBroj());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void delete(Otpremnica t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Otpremnica getAllByID(Integer k) throws Exception {
        Otpremnica otpremnica = new Otpremnica();
        String upit = "SELECT * FROM otpremnica o "
                + "join radnik r on o.radnik=r.sifraRadnika "
                + "join magacin mg on o.magacin=mg.sifraMagacina"
                + "join prodavnica p on o.prodavnica=p.maticniBroj";
        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                Radnik r = new Radnik(rs.getInt("sifraRadnka"), rs.getString("ime"), rs.getString("prezime"));
                Magacin m = new Magacin(rs.getInt("sifraMagacina"), rs.getString("nazivMagacina"));
                Mesto mesto = new Mesto(rs.getString("postanskiBroj"), rs.getString("naziv"));
                Prodavnica p = new Prodavnica(rs.getString("maticniBroj"), rs.getString("PIB"), rs.getString("naziv"),
                        rs.getString("adresa"), rs.getString("tekuciRacun"), rs.getString("brojTelefona"), rs.getString("delatnost"),
                        rs.getDate("datumOsnivanja"), mesto);

                otpremnica.setBrojOtpremnice(rs.getInt("brojOtpremnice"));
                otpremnica.setUkupanIznosStavki(rs.getBigDecimal("ukupanIznosStavki"));
                otpremnica.setPDV(rs.getInt("PDV"));
                otpremnica.setUkupnaVrednost(rs.getBigDecimal("ukupnaVrednost"));
                otpremnica.setRadnik(r);
                otpremnica.setMagacin(m);
                otpremnica.setProdavnica(p);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana otpremnica!");
            return otpremnica;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje otpremnice!\n" + ex);
            throw ex;
        }
    }
    
}
