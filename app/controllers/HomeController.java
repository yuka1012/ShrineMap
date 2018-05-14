package controllers;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Connection connection = DB.getConnection();
        try {
        		PreparedStatement sql = connection.prepareStatement("SELECT * FROM member");
        		ResultSet rs = sql.executeQuery();
        		while (rs.next()) {
        			System.out.println(rs.getString("name")+":"+rs.getString("email"));
        		}
        } catch (SQLException ex) {
        		ex.printStackTrace();
        }
    	return ok(index.render("Your new application is ready."));
    }

}
