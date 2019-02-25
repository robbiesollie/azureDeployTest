package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProjectServlet extends HttpServlet {

    public void doPost(HttpServlet request, HttpServletResponse response)
            throws IOException {

        String projectID = getInitParameter("");
        String projectName = getInitParameter("");
        String proposal = getInitParameter("");
        String projectProvider = getInitParameter("");

        //Call function query DB

    }

    public void doGet(HttpServlet request, HttpServletResponse response)
            throws IOException {

        String projectID = getInitParameter("");
        String projectName = getInitParameter("");
        String proposal = getInitParameter("");
        String projectProvider = getInitParameter("");

        //Call function query DB

    }
}
