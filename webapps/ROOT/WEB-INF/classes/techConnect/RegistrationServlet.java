package techConnect;

import org.w3c.dom.UserDataHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
            user.setUserName(req.getParameter("userName"));
            user.setPassword(req.getParameter("password"));
            user.setEmail(req.getParameter("email"));
            if (!UserDAO.getUsername(user.getUsername())) {
                UserDAO.registration(user);
                resp.sendRedirect("login.jsp");
            }
            else {
                resp.sendRedirect("registration.jsp");
            }
        }
        catch (Throwable e) {
            System.out.println(e);
        }
    }
}
