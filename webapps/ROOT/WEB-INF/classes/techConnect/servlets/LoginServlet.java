package techConnect.servlets;


import techConnect.beans.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try
        {

            UserBean user = new UserBean();
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            System.out.println(request.getParameter("email"));


            if (user.isValid())
            {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                response.sendRedirect("index.jsp"); //after login
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
