/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.implementacija;

import db.konekcija.DBKonekcija;
import db.konekcija.DBRepository;
import domen.Marka;
import domen.MobilniTelefon;
import domen.Otpremnica;
import java.math.BigDecimal;
import java.math.BigInteger;
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
public class RepositoryMobilniTelefon implements DBRepository<MobilniTelefon, String>{
    public Connection konekcija;

    public RepositoryMobilniTelefon() {
    }
    
    @Override
    public ArrayList<MobilniTelefon> getAll() throws Exception {
        ArrayList<MobilniTelefon> lista = new ArrayList<>();
        String upit = "SELECT * FROM mobilniTelefon mt JOIN marka m ON mt.sifraMarke=m.sifraMarke";

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
                mt.setCenaTelefona(rs.getBigDecimal("cenaTelefona"));
                mt.setMarka(m);
                lista.add(mt);
            }
            rs.close();
            s.close();
            System.out.println("Uspesno ucitana lista mobilnih telefona!");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste mobilnih telefona!\n" + ex);
            throw ex;
        }  
    }

    @Override
    public ArrayList<MobilniTelefon> getAllWhere(String s) throws Exception {
     
    ArrayList<MobilniTelefon> lista = new ArrayList<>();
        String upit = "SELECT * FROM mobilniTelefon mt JOIN marka m ON mt.sifraMarke=m.sifraMarke WHERE m.`nazivMarke` LIKE '"+s+"%' OR mt.nazivMT LIKE '"+s+"%'";

        try {
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            ResultSet rs = st.executeQuery(upit);
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
                mt.setCenaTelefona(rs.getBigDecimal("cenaTelefona"));
                mt.setMarka(m);
                lista.add(mt);
                
            }
            rs.close();
            st.close();
            System.out.println("Uspesno ucitana lista mobilnih telefona!");
            System.out.println("lista iz im "+lista);
            return lista;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste mobilnih telefona!\n" + ex);
            throw ex;
        }  }

    @Override
    public void add(MobilniTelefon t) throws Exception {
        String upit = "INSERT INTO mobilniTelefon VALUES (?,?,?,?,?,?,?,?,?,?)";
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, t.getSifraMT());
        ps.setString(2, t.getNazivMT());
        ps.setString(3, t.getDimenzija());
        ps.setString(4, t.getProcesor());
        ps.setString(5, t.getBaterija());
        ps.setString(6, t.getKamera());
        ps.setString(7, t.getMemorija());
        ps.setString(8, t.getBoja());
        ps.setInt(9, t.getMarka().getSifraMarke());
        ps.setBigDecimal(10, t.getCenaTelefona());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void edit(MobilniTelefon t) throws Exception {
        String upit = "UPDATE mobilniTelefon SET nazivMT = ?,dimenzija = ?,procesor = ?,baterija = ?,kamera = ?,memorija = ?,boja = ?,cenaTelefona=? WHERE sifraMT LIKE " + t.getSifraMT();
        konekcija = DBKonekcija.getInstanca().konekcija();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, t.getNazivMT());
        ps.setString(2, t.getDimenzija());
        ps.setString(3, t.getProcesor());
        ps.setString(4, t.getBaterija());
        ps.setString(5, t.getKamera());
        ps.setString(6, t.getMemorija());
        ps.setString(7, t.getBoja());
        ps.setBigDecimal(8, t.getCenaTelefona());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void delete(MobilniTelefon t) throws Exception {
        try {
            String query = "DELETE FROM mobilniTelefon WHERE sifraMT = " +t.getSifraMT();
            konekcija = DBKonekcija.getInstanca().konekcija();
            Statement st = konekcija.createStatement();
            st.executeUpdate(query);
            System.out.println("Mobilni telefon je obrisan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Neuspesno brisanje mobilnog telefona!");
        }
    }

    @Override
    public MobilniTelefon getAllByID(String k) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
