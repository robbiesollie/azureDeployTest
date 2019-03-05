///**
// * TODO: Test, requires solutionProvider.jsp to be implemented
// */
//package techConnect;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/VolunteerProfileServlet")
//
//public class SolutionProviderServlet extends HttpServlet {
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, java.io.IOException {
//        try {
//            HttpSession session = request.getSession(true);
//            UserBean user = (UserBean) session.getAttribute("currentSessionUser");
//            if (user != null && user.isValid()) {
//                SolutionProviderBean bean = new SolutionProviderBean();
//                bean.setSkills(request.getParameter("skills").split(","));
//                bean.setUsername(user.getUsername());
//                SolutionProviderDAO.initProvider(bean);
//                response.sendRedirect("projects.jsp");
//            }
//            else {
//                response.sendRedirect("login.jsp");
//            }
//        }
//        catch (Throwable e) {
//            System.out.println(e);
//        }
//    }
//}