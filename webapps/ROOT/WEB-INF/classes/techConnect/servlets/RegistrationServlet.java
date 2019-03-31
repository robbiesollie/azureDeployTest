package techConnect.servlets;

import techConnect.beans.UserBean;
import techConnect.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * TODO: Test interaction with JSP
 */
@WebServlet("/RegistrationServlet")

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            UserBean user = new UserBean();
            user.setFirstName(req.getParameter("first-name"));
            user.setLastName(req.getParameter("last-name"));
            user.setUsername(req.getParameter("username"));
            user.setPassword(req.getParameter("password"));
            user.setEmail(req.getParameter("email"));
            System.out.println("Servlet: ");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            UserDAO dao = new UserDAO();
            dao.setUser(user);
            resp.sendRedirect("NewUserRegistration.jsp");
        }
        catch (Throwable e) {
            e.printStackTrace();
            resp.sendRedirect("registration.jsp");
        }
    }

}
