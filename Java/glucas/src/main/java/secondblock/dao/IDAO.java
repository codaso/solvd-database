package com.lucas.solvd.secondblock.dao;

import java.util.List;

public interface IDAO<T> {
    void insert(T x) throws DAOException;

    void delete(T x) throws DAOException;

    void modify(T x) throws DAOException;

    T retrieve(long a) throws DAOException;

    List<T> retrieveAll() throws DAOException;
}
