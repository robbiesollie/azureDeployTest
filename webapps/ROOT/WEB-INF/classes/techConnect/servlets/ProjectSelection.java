package techConnect.servlets;

import techConnect.beans.UIProjectBean;
import techConnect.beans.projectBean;
import techConnect.beans.providerBean;
import techConnect.dao.ProjectProviderDAO;
import techConnect.dao.PublicProjectDAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Robbie Sollie - ProjectSelection.java - EGR326 - CBU - 2019-04-08
 */
public class ProjectSelection {
    public static UIProjectBean getProject(String id) {
        projectBean project = new projectBean();
        project.setProjectID(Integer.parseInt(id));
        PublicProjectDAO dao = new PublicProjectDAO();
        try {
            project = dao.getPublicProjectFromID(project);
            return convertToUIBean(project);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static List<UIProjectBean> getProjects() {
        PublicProjectDAO dao = new PublicProjectDAO();
        try {
            Queue<projectBean> projectQueue = dao.getPublicProject();
            List<UIProjectBean> beanQueuen = new LinkedList<>();
            for(projectBean b : projectQueue) {
                beanQueuen.add(convertToUIBean(b));
            }
            return beanQueuen;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static String[] divideDescription(String description) {
        String[] divided = new String[4];
        int needIdx = description.indexOf("<div id=\"need\">") + "<div id=\"need\">".length();
        int whoIdx = description.indexOf("<div id=\"who\">") + "<div id=\"who\">".length();
        int languageIdx = description.indexOf("<div id=\"language\">") + "<div id=\"language\">".length();
        int extraIdx = description.indexOf("<div id=\"extra\">") + "<div id=\"extra\">".length();
        divided[0] = description.substring(needIdx, description.indexOf("<\\div>", needIdx));
        divided[1] = description.substring(whoIdx, description.indexOf("<\\div>", whoIdx));
        divided[2] = description.substring(languageIdx, description.indexOf("<\\div>", languageIdx));
        divided[3] = description.substring(extraIdx, description.indexOf("<\\div>", extraIdx));

        return divided;
    }

    private static UIProjectBean convertToUIBean(projectBean project) throws SQLException {
        providerBean pprovider = new providerBean();
        pprovider.setUserID(project.getProjectProviderID());
        ProjectProviderDAO providerDAO = new ProjectProviderDAO();
        pprovider = providerDAO.getProjectProviderFromID(pprovider);

        pprovider = providerDAO.getProjectProviderFromID(pprovider);

        UIProjectBean uiProject = new UIProjectBean();
        uiProject.setTitle(project.getProjectName());
        uiProject.setContact("Email: " + pprovider.getEmail());

        String[] description = divideDescription(project.getProposal());

        uiProject.setNeed(description[0]);
        uiProject.setWho(description[1]);
        uiProject.setLanguage(description[2]);
        uiProject.setExtra(description[3]);
        return uiProject;
    }
}
