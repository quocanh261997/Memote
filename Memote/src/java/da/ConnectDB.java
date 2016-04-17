/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author The
 */
public class ConnectDB {
    public static Connection cn=null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        if(cn==null)
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Melote";
            String username = "sa";
            String password = "longwaytogo1";
            cn = DriverManager.getConnection(url, username, password);
        }
        return cn;
    }
}
