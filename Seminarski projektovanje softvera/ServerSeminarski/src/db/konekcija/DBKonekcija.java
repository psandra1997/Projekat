/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.konekcija;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandra
 */
public class DBKonekcija {
    private Connection konekcija;
    private static DBKonekcija instanca;

    private DBKonekcija() {
    }

    public static DBKonekcija getInstanca() {
        if (instanca == null) {
            instanca = new DBKonekcija();
        }
        return instanca;
    }

    public Connection konekcija() throws SQLException {
        if (konekcija == null || konekcija.isClosed()) {
            try {
//                Properties prop = new Properties();
//                prop.load(new FileInputStream("config/db.properties"));
//                String url = prop.getProperty(Konstante.URL);
//                String username = prop.getProperty(Konstante.USERNAME);
//                String password = prop.getProperty(Konstante.PASSWORD);
                String url = "jdbc:mysql://localhost:3306/baza_seminarski";
                String username = "root";
                String password = "";
                konekcija = DriverManager.getConnection(url, username, password);
                konekcija.setAutoCommit(false);

            } catch (SQLException ex) {
                System.out.println("Nespesna konekcija sa bazom! " + ex.getMessage());
                throw ex;
            }
        }
        return konekcija;
    }
}
