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
    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            UserBean user = new UserBean();
            user.setFirstName(req.getParameter("first-name"));
            user.setLastName(req.getParameter("last-name"));
            user.setUserName(req.getParameter("userName"));
            user.setEmail(req.getParameter("email"));
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getUsername());
            System.out.println(user.getEmail());
//            if (!UserDAO.getUsername(user.getUsername())) {
//
//                UserDAO.registration(user);
//                resp.sendRedirect("login.jsp");
//            }
//            else {
//                resp.sendRedirect("registration.jsp");
//            }
        }
        catch (Throwable e) {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }*/

}
