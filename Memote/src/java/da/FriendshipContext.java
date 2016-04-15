/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package da;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import obj.Friendship;
import obj.User;

/**
 *
 * @author The
 */
public class FriendshipContext {
    private static List<Friendship> toList(ResultSet rs) throws SQLException {
        List<Friendship> result = new ArrayList<>();
        while (rs.next()) {
            int fsId = rs.getInt("FsId");
            String user1 = rs.getString("User1");
            String user2 = rs.getString("User2");
            int status = rs.getInt("Status");
            result.add(new Friendship(fsId, user1, user2, status));
        }
        return result;
    }
}
