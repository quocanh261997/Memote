/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package da;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import obj.User;

/**
 *
 * @author The
 */
public class UserContext {
    private static List<User> toList(ResultSet rs) throws SQLException {
        List<User> result = new ArrayList<>();
        while (rs.next()) {
            String userId = rs.getString("UserId");
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            String email = rs.getString("Email");
            Date dob = rs.getDate("DoB");
            int type = rs.getInt("Type");
            result.add(new User(userId,firstName, lastName, email, dob, type));
        }
        return result;
    }
    
    public boolean checkPassword(String username,String password) throws ClassNotFoundException, SQLException
    {
        PreparedStatement prepareStatement = ConnectDB.getConnection()
                .prepareStatement("SELECT * FROM User WHERE UserName=? AND Password = ?");
        prepareStatement.setString(1, username);
        prepareStatement.setString(2, password);
        return prepareStatement.executeQuery().next();
    }
    
    public User getUser(String username) throws ClassNotFoundException, SQLException
    {
        PreparedStatement prepareStatement = ConnectDB.getConnection()
                .prepareStatement("SELECT * FROM UserInfo WHERE UserName=?");
        prepareStatement.setString(1, username);
        return toList(prepareStatement.executeQuery()).get(0);
    }
    
    public List<User> searchByName(String name) throws ClassNotFoundException, SQLException
    {
        PreparedStatement prepareStatement = ConnectDB.getConnection()
                .prepareStatement("SELECT * FROM UserInfo WHERE (FirstName LIKE '%?%') OR (LastName LIKE '%?%')");
        prepareStatement.setString(1, name);
        prepareStatement.setString(2, name);
        return toList(prepareStatement.executeQuery());
    }
}
