/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import da.PostContext;
import da.UserContext;
import java.sql.SQLException;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import obj.Post;

/**
 *
 * @author The
 */
@WebService(serviceName = "MeloteWS")
public class MeloteWS {

    /**
     * This is a sample web service operation
     * @param name Tên đăng nhập
     * @param password Password nhập
     * @return 
     * @throws java.lang.ClassNotFoundException 
     * @throws java.sql.SQLException 
     */
    @WebMethod(operationName = "checkUsername")
    public boolean checkUsername(@WebParam(name = "name") String name,@WebParam(name = "password") String password) throws ClassNotFoundException, SQLException {
        return new UserContext().checkPassword(name, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPostByLocation")
    public java.util.List<obj.Post> getPostByLocation(@WebParam(name = "latitude") float latitude, @WebParam(name = "longtitude") float longtitude) throws ClassNotFoundException, SQLException {
        //TODO write your implementation code here:
        return new PostContext().getByLocation(latitude,longtitude);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addPost")
    public void addPost(@WebParam(name = "post") Object post) throws SQLException, Exception {
        new PostContext().newPost((Post) post);
    }
    
    
}
