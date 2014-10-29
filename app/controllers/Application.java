package controllers;

import play.db.*;
import play.mvc.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application extends Controller {

    public static Result index() {
        Connection connection = DB.getConnection();
        try {
            ResultSet rs = connection.prepareStatement("SELECT 1 as rs FROM DUAL").executeQuery();
            rs.next();
            String result = rs.getString("rs");
            return ok("Your DB returns " + result);
        } catch (SQLException e) {
            e.printStackTrace();
            return internalServerError("DB connection failed: " + e.getMessage());

        }
    }
}
