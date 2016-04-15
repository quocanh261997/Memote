/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obj;

import java.util.Date;

/**
 *
 * @author The
 */
public class Event {
    int eventId;
    String content;
    String location;
    Date endTime;
    String winner;

    public Event() {
    }

    public Event(int eventId, String content, String location, Date endTime, String winner) {
        this.eventId = eventId;
        this.content = content;
        this.location = location;
        this.endTime = endTime;
        this.winner = winner;
    }

    public int getEventId() {
        return eventId;
    }

    public String getContent() {
        return content;
    }

    public String getLocation() {
        return location;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getWinner() {
        return winner;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    
}
