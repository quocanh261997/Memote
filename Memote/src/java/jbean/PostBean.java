/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jbean;

import da.PostContext;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import obj.Post;

/**
 *
 * @author The
 */
@ManagedBean
@ViewScoped
public class PostBean {
    
    String userId;
    String content;
    float latitude;
    float longtitude;
    /**
     * Creates a new instance of Post
     */
    public PostBean() {
    }
    void Clear(){
        content = "";
    }
    public List<Post> getNearbyPost(){
        try {
            return new PostContext().getByLocation(latitude,longtitude);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PostBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void postStatus(){
        try {
            new PostContext().newPost(new Post(0, "phantom",content,null,latitude,longtitude,0));
        } catch (SQLException ex) {
            Logger.getLogger(PostBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PostBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        Clear();
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongtitude() {
        return longtitude;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    
}
