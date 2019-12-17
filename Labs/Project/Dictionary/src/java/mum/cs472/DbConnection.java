/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 610522
 */
public class DbConnection {

    private Connection connection;

    public Connection getConnection() throws SQLException {
        return connection;
    }

    public DbConnection() throws ClassNotFoundException, SQLException  {
        Class.forName("");
//        connection = DriverManager.getConnection("", "root", "root");
    }
}
