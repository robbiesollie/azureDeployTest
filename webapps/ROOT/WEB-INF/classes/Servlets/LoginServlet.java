package Servlets;

import Entity.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {


    public void doPost(HttpServlet request, HttpServletResponse response)
            throws IOException {

        String email = getInitParameter("email");
        String password = getInitParameter("password");


        User user = new User();

        user.setEmail(email);
        user.setPassword(password);

    }

    public void doGet(HttpServlet request, HttpServletResponse response)
            throws IOException {

        //Post to page

        String email = getInitParameter("email");
        String password = getInitParameter("password");


        User user = new User();

        user.setEmail(email);
        user.setPassword(password);

    }
}
