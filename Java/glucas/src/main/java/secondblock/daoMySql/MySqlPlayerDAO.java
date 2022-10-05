package com.lucas.solvd.secondblock.daoMySql;

import com.lucas.solvd.secondblock.dao.DAOException;
import com.lucas.solvd.secondblock.dao.IPlayerDAO;
import com.lucas.solvd.secondblock.models.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlPlayerDAO implements IPlayerDAO {
    static final String CREATE = "INSERT INTO Player (name,lastname,stats,country) VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE Player SET name=?, lastname=?, stats=?, country=? WHERE id=?";
    final String DELETE = "DELETE FROM Player WHERE id=?";
    final String READ = "SELECT id, name, lastname, stats, country FROM Player WHERE id=?";
    final String READALL = "SELECT * FROM Player";

    private Connection connection = null;

    public MySqlPlayerDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Player x) throws DAOException {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(CREATE);
            st.setString(1, x.getName());
            st.setString(2, x.getLastname());
            //set stats
            //set country
            if (st.executeUpdate() == 0) {
                throw new DAOException("SQL error on statement: executeUpdate");
            }
        } catch (SQLException e) {
            throw new DAOException("SQL error: ", e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL error on statement: close", e);
                }
            }
        }
    }


    @Override
    public void delete(Player x) {

    }

    @Override
    public void modify(Player x) {

    }

    @Override
    public Player retrieve(long a) {
        return null;
    }

    @Override
    public List<Player> retrieveAll() {
        return null;
    }
}
