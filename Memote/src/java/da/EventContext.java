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
import obj.User;

/**
 *
 * @author The
 */
public class EventContext {
    private static List<Event> toList(ResultSet rs) throws SQLException {
        List<Event> result = new ArrayList<>();
        while (rs.next()) {
            int eventId = rs.getInt("EventId");
            String content = rs.getString("Content");
            String location = rs.getString("Location");
            Date endTime = rs.getDate("EndTime");
            String winner = rs.getString("Winner");
            result.add(new Event(eventId, content, location, endTime, winner));
        }
        return result;
    }
}
