/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

/**
 *
 * @author DNA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class QLCB implements ICanbo {
    private Connection cn;

    public QLCB() {
        cn = getCon();
    }

    public Connection getCon() {
        Connection con = null;
        try {
            String url = "jdbc:sqlserver://DNA;databaseName=QLCB;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "1";

            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    @Override
    public void insertCB(Canbo canbo) {
        String sql = "INSERT INTO tbCanBo (SoTK, Hoten, GT, Diachi, Luong) "
                   + "VALUES (" + canbo.getSoTK() + ", '" + canbo.getHoten() + "', '" + canbo.getGT() + "', '" + canbo.getDiachi() + "', " + canbo.getLuong() + ")";
        try {
            Statement sm = cn.createStatement();
            sm.executeUpdate(sql);
        } catch (Exception e) {
        }
    }   
}
