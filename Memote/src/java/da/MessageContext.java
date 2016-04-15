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
import obj.Event;
import obj.Message;

/**
 *
 * @author The
 */
public class MessageContext {
    private static List<Message> toList(ResultSet rs) throws SQLException {
        List<Message> result = new ArrayList<>();
        while (rs.next()) {
            int messId = rs.getInt("MessageId");
            String sender = rs.getString("Sender");
            String receiver = rs.getString("Receiver");
            int status = rs.getInt("Status");
            String content = rs.getString("Content");
            result.add(new Message(messId, sender, receiver, content, status));
        }
        return result;
    }
}
