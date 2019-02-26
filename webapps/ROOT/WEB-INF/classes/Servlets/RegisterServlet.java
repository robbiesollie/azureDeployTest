// This class will take in user information from the JSP register.jsp and call a service

package Servlets;

import Entity.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServlet request, HttpServletResponse response)
        throws IOException {

        User user = new User();



        String userID = request.getInitParameter("");
        String username = request.getInitParameter("");
        String password = request.getInitParameter("");
        String email = request.getInitParameter("");
        String affiliation = request.getInitParameter("");
        String location = request.getInitParameter("");



        //Call function query DB


    }

    public void doGet(HttpServlet request, HttpServletResponse response)
            throws IOException {

        String userID = request.getInitParameter("");
        String username = request.getInitParameter("");
        String password = request.getInitParameter("");
        String email = request.getInitParameter("");
        String affiliation = request.getInitParameter("");
        String location = request.getInitParameter("");

        //Call function query DB


    }
}

