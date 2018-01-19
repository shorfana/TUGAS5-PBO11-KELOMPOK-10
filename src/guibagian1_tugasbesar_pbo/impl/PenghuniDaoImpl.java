/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibagian1_tugasbesar_pbo.impl;

import guibagian1_tugasbesar_pbo.entity.Penghuni;
import guibagian1_tugasbesar_pbo.error.PenghuniException;
import guibagian1_tugasbesar_pbo.service.PenghuniDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shorfana
 */
public class PenghuniDaoImpl implements PenghuniDao {

    private Connection connection;
    private final String insertPenghuni = "INSERT INTO PENGHUNI "
            + "(NAMA,NOKMR,NOLNT,NOMINAL) VALUES (?,?,?,?)";
    private final String updatePenghuni = "UPDATE PENGHUNI SET NAMA=?,"
            + "NOKMR=?,NOLNT=?,NOMINAL=? WHERE ID=?";

    private final String deletePenghuni = "DELETE FROM PENGHUNI WHERE ID=?";

    private final String getById = "SELECT * FROM PENGHUNI WHERE ID=?";

    private final String selectAll = "SELECT * FROM PENGHUNI";

    public PenghuniDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertPenghuni(Penghuni penghuni) throws PenghuniException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(insertPenghuni, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, penghuni.getNama());
            statement.setString(2, penghuni.getNokmr());
            statement.setString(3, penghuni.getNolnt());
            statement.setInt(4, penghuni.getNominal());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                penghuni.setId(result.getInt(1));
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PenghuniException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    public void updatePenghuni(Penghuni penghuni) throws PenghuniException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updatePenghuni);
            statement.setString(1, penghuni.getNama());
            statement.setString(2, penghuni.getNokmr());
            statement.setString(3, penghuni.getNolnt());
            statement.setInt(4, penghuni.getNominal());
            statement.setInt(5, penghuni.getId());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PenghuniException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    public void deletePenghuni(Integer id) throws PenghuniException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deletePenghuni);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PenghuniException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    public Penghuni getPenghuni(Integer id) throws PenghuniException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();
            Penghuni penghuni = null;

            if (result.next()) {
                penghuni = new Penghuni();
                penghuni.setId(result.getInt("ID"));
                penghuni.setNama(result.getString("NAMA"));
                penghuni.setNokmr(result.getString("NOKMR"));
                penghuni.setNolnt(result.getString("NOLNT"));
                penghuni.setNominal(result.getInt("NOMINAL"));
            } else {
                throw new PenghuniException("Pelanggan dengan id " + id
                        + " Tidak ditemukan");
            }
            connection.commit();
            return penghuni;
        } catch (SQLException e) {

            throw new PenghuniException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public List<Penghuni> selectAllPelanggan() throws PenghuniException {
        Statement statement = null;
        List<Penghuni> list = new ArrayList<Penghuni>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            Penghuni penghuni = null;
            connection.commit();

            while (result.next()) {
                penghuni = new Penghuni();
                penghuni.setId(result.getInt("ID"));
                penghuni.setNama(result.getString("NAMA"));
                penghuni.setNokmr(result.getString("NOKMR"));
                penghuni.setNolnt(result.getString("NOLNT"));
                penghuni.setNominal(result.getInt("NOMINAL"));
                list.add(penghuni);
            }
            connection.commit();
            return list;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PenghuniException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }
}
