package com.lucas.solvd.secondblock.services;

import java.sql.SQLException;
import java.util.List;

public interface ICRUDService<T> {
    void create(T x) throws SQLException;

    void delete(T x) throws SQLException;

    void update(T x) throws SQLException;

    T retrieve(int a) throws SQLException;

    List<T> retrieveAll() throws SQLException;
}

