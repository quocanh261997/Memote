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
public class Post {
    int postId;
    String userId;
    String content;
    String image;
    float latitude;
    float longtitude;
    int priority;

    public Post() {
    }

    public Post(int postId, String userId, String content, String image, float latitude, float longtitude, int priority) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.image = image;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.priority = priority;
    }

    public int getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public int getPriority() {
        return priority;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
