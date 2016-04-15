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
public class User {
    String userID;
    String firstName;
    String lastName;
    String email;
    Date dob;
    int type;

    public User() {
    }

    public User(String userID, String firstName, String lastName, String email, Date dob, int type) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.type = type;
    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getDob() {
        return dob;
    }

    public int getType() {
        return type;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
}
