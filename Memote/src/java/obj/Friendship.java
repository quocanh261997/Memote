/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obj;

/**
 *
 * @author The
 */
public class Friendship {
    int fsId;
    String user1;
    String user2;
    int status;

    public Friendship() {
    }

    public Friendship(int fsId, String user1, String user2, int status) {
        this.fsId = fsId;
        this.user1 = user1;
        this.user2 = user2;
        this.status = status;
    }

    public int getFsId() {
        return fsId;
    }

    public String getUser1() {
        return user1;
    }

    public String getUser2() {
        return user2;
    }

    public int getStatus() {
        return status;
    }

    public void setFsId(int fsId) {
        this.fsId = fsId;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
