package com.lucas.solvd.secondblock.daoMySql;

import com.lucas.solvd.secondblock.dao.DAOException;
import com.lucas.solvd.secondblock.models.Stats;

import java.sql.*;

public class MySqlStatsDAO {
    static final String CREATE = "INSERT INTO Stats (gender,birthdate,height,weight) VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE Stats SET gender=?, birthdate=?, height=?, weight=? WHERE id=?";
    final String DELETE = "DELETE FROM Stats WHERE id=?";
    final String READ = "SELECT id, gender, birthdate, height, weight FROM Stats WHERE id=?";
    final String READALL = "SELECT * FROM Stats";

    public static void main(String[] args) throws SQLException, DAOException {
        Stats x = new Stats();
        Date date = new Date(03 / 05 / 1992);
        x.setDate(date);
        x.setGender("male");
        x.setHeight(1.75);
        x.setWeight(75);
        x.setId(3);

        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/olympic_games_db";
        final String USER = "root";
        final String PASS = "CODO4450!!";

        PreparedStatement st = null;
        Connection connection = null;
        connection = DriverManager.getConnection(DB_URL, USER, PASS);

        try {
            st = connection.prepareStatement(CREATE);
            st.setString(1, x.getGender());
            //st.setDate(2, x.getDate());
            st.setDouble(3, x.getHeight());
            st.setDouble(4, x.getWeight());
            if (st.executeUpdate() == 0) {
                throw new DAOException("SQL error on statement: executeUpdate");
            }
        } catch (SQLException | DAOException e) {
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

}
