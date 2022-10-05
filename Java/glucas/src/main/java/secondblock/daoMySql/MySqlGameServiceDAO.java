package com.lucas.solvd.secondblock.daoMySql;

import com.lucas.solvd.secondblock.dao.DAOException;
import com.lucas.solvd.secondblock.dao.IGameServiceDAO;
import com.lucas.solvd.secondblock.models.GameService;

import java.util.List;

public class MySqlGameServiceDAO implements IGameServiceDAO {
    @Override
    public void insert(GameService x) throws DAOException {

    }

    @Override
    public void delete(GameService x) throws DAOException {

    }

    @Override
    public void modify(GameService x) throws DAOException {

    }

    @Override
    public GameService retrieve(long a) throws DAOException {
        return null;
    }

    @Override
    public List<GameService> retrieveAll() throws DAOException {
        return null;
    }
}
