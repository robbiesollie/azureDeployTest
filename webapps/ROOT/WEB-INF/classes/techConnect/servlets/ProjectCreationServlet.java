package techConnect.servlets;

import techConnect.beans.UserBean;
import techConnect.beans.projectBean;
import techConnect.dao.PublicProjectDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@WebServlet("/ProjectCreationServlet")
public class ProjectCreationServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.jsp");
            return;
        }
        UserBean user;
        try {
            user = (UserBean) session.getAttribute("currentSessionUser");
        }
        catch (NullPointerException e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                    "Session does not contain user info");
            return;
        }
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        projectBean project = new projectBean();
        project.setProjectProviderID(user.getUserID());
        project.setProjectName(request.getParameter("ProjectName"));
        String proposal = String.format(
                "<div class=\"q\">What do you need?<\\div><div id=\"need\">%1$s<\\div>" +
                "<div class=\"q\">Who is going to use this and how?<\\div><div id=\"who\">%2$s<\\div>" +
                "<div class=\"q\">What language(s) do they speak?<\\div><div id=\"language\">%3$s<\\div>" +
                "<div class=\"q\">Anything else volunteers should know?<\\div><div id=\"extra\">%4$s<\\div>",
                request.getParameter("need"), request.getParameter("who"),
                request.getParameter("language"), request.getParameter("extra")
        );
        project.setProposal(proposal);
        PublicProjectDAO dao = new PublicProjectDAO();
        try {
            dao.setPublicProject(project);
            project = dao.getPublicProjectFromName(project);
            response.sendRedirect("ProjectDisplay.jsp?projectID=" + project.getProjectID());
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
