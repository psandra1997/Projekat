/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.konekcija;

import db.Repository;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Sandra
 */
public interface DBRepository<T, K> extends Repository<T, K>{
    
    default public void otvoriKonekciju() throws SQLException, IOException {
        DBKonekcija.getInstanca().konekcija();
    }

    default public void zatvoriKonekciju() throws SQLException, IOException {
        DBKonekcija.getInstanca().konekcija().close();
    }

    default public void commit() throws SQLException, IOException {
        DBKonekcija.getInstanca().konekcija().commit();
    }

    default public void rollback() throws SQLException, IOException {
        DBKonekcija.getInstanca().konekcija().rollback();
    }
}
