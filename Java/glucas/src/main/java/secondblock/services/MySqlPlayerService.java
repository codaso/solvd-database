package com.lucas.solvd.secondblock.services;

import com.lucas.solvd.secondblock.daoMySql.MySqlCountryDAO;
import com.lucas.solvd.secondblock.daoMySql.MySqlPlayerDAO;
import com.lucas.solvd.secondblock.daoMySql.MySqlStatsDAO;
import com.lucas.solvd.secondblock.models.Player;

import java.sql.SQLException;
import java.util.List;

public class MySqlPlayerService implements ICRUDService<Player> {
    MySqlPlayerDAO playerDAO;
    MySqlStatsDAO statsDAO;
    MySqlCountryDAO countryDAO;

    @Override
    public void create(Player x) throws SQLException {
    }

    @Override
    public void delete(Player x) throws SQLException {

    }

    @Override
    public void update(Player x) throws SQLException {

    }

    @Override
    public Player retrieve(int a) throws SQLException {
        return null;
    }

    @Override
    public List<Player> retrieveAll() throws SQLException {
        return null;
    }
}
