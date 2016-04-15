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
public class Challenge {
    int challengeId;
    String sender;
    String receiver;
    int postId;
    int status;

    public Challenge() {
    }

    public Challenge(int challengeId, String sender, String receiver, int postId, int status) {
        this.challengeId = challengeId;
        this.sender = sender;
        this.receiver = receiver;
        this.postId = postId;
        this.status = status;
    }

    public int getChallengeId() {
        return challengeId;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public int getPostId() {
        return postId;
    }

    public int getStatus() {
        return status;
    }

    public void setChallengeId(int challengeId) {
        this.challengeId = challengeId;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
