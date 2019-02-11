package techConnect;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try
        {

            techConnect.UserBean user = new UserBean();
            user.setUserName(request.getParameter("emailName"));
            user.setPassword(request.getParameter("emailPassword"));

            user = UserDAO.login(user);

            if (user.isValid())
            {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                response.sendRedirect(""); //after login
            }

            else
                response.sendRedirect("login.jsp"); //error if no match
        }


        catch (Throwable theException)
        {
            System.out.println(theException);
        }
    }
}
