/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebatchupdateinjdbc_j2.s.p0117;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhongFPT
 */
public class DBContext {

    private final String serverName = "localhost";
    private final String dbName = "FU_DB";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123456";

    Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        return DriverManager.getConnection(url, userID, password);
    }
  
}
