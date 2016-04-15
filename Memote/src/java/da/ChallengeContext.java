/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package da;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import obj.Challenge;
import obj.Message;

/**
 *
 * @author The
 */
public class ChallengeContext {
    private static List<Challenge> toList(ResultSet rs) throws SQLException {
        List<Challenge> result = new ArrayList<>();
        while (rs.next()) {
            int ChallengeId = rs.getInt("ChallengeId");
            String sender = rs.getString("Sender");
            String receiver = rs.getString("Receiver");
            int postId = rs.getInt("PostId");
            int status = rs.getInt("Status");
            result.add(new Challenge(ChallengeId, sender, receiver, postId, status));
        }
        return result;
    }
}
