/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package da;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import obj.Post;
import obj.User;

/**
 *
 * @author The
 */
public class PostContext {
    private static List<Post> toList(ResultSet rs) throws SQLException {
        List<Post> result = new ArrayList<>();
        while (rs.next()) {
            int postId = rs.getInt("PostId");
            String userId = rs.getString("UserId");
            String content = rs.getString("Content");
            String image = rs.getString("Image");
            String location = rs.getString("Location");
            Date postTime = rs.getTime("PostTime");
            int priority = rs.getInt("Priority");
            
            result.add(new Post(postId, userId, content, image, location, priority));
        }
        return result;
    }
    
    public List<Post> getByUserId(int userId) throws ClassNotFoundException, SQLException {
        PreparedStatement prepareStatement = ConnectDB.getConnection()
                .prepareStatement("SELECT * FROM Post WHERE UserId=?");
        prepareStatement.setInt(1, userId);
        return toList(prepareStatement.executeQuery());
    }
    
    public List<Post> getByLocation(String location) throws ClassNotFoundException, SQLException {
        PreparedStatement prepareStatement = ConnectDB.getConnection()
                .prepareStatement("SELECT * FROM Post WHERE Location=?");
        prepareStatement.setString(1, location);
        return toList(prepareStatement.executeQuery());
    }
    public int newPost(Post post) throws ClassNotFoundException, SQLException, Exception {
        PreparedStatement prepareStatement = ConnectDB.getConnection().prepareStatement("INSERT INTO Post VALUES(?,?,?,?,?,?)");
        prepareStatement.setString(1, post.getUserId());
        if (post.getContent()== null) {
            prepareStatement.setNull(2, java.sql.Types.NVARCHAR);
        } else {
            prepareStatement.setString(2, post.getContent());
            
        }if (post.getImage() == null) {
            prepareStatement.setNull(3, java.sql.Types.NVARCHAR);
        } else {
            prepareStatement.setString(3, post.getImage());
        }
        
        if (post.getLocation()== null) {
            throw new Exception("Location cant be null");
        } else {
            prepareStatement.setString(4, post.getLocation());
        }
        prepareStatement.setTimestamp(5, new Timestamp(new Date().getTime()));
        prepareStatement.setInt(6, post.getPriority());
        return prepareStatement.executeUpdate();
    }
}
