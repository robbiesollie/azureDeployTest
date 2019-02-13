package techConnect;

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
            user.setFirstName("first-name");
            user.setLastName("last-name");
            user.setUserName("userName");
            user.setPassword("password");
        }
        catch (Throwable e) {
            System.out.println(e);
        }
    }
}
