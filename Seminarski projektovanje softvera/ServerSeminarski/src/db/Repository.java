/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public interface Repository<T,K> {
    ArrayList<T> getAll() throws Exception;
    ArrayList<T> getAllWhere(String s) throws Exception;
    void add(T t) throws Exception;
    void edit(T t) throws Exception;
    void delete(T t) throws Exception;
    T getAllByID(K k) throws Exception;
}
