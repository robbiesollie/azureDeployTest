package techConnect.dao;

import techConnect.beans.projectBean;
import techConnect.dao.DAO;

import java.sql.ResultSet;
import java.util.Queue;

public class ProjectDAO extends DAO {

    public void updateProject(projectBean bean) {
        if(bean.getProjectID() != null && bean.getProjectID() > 0 && bean.getProjectName() != null && bean.getProposal() != null && bean.getComplete() != null) {
            DB.updateProjects(bean.getProjectID(), bean.getProjectName(), bean.getProposal(), bean.getComplete());
        }
    }

    public void setPairing(projectBean bean) {
        if(bean.getProjectID() > 0 && bean.getSolutionProviderID() > 0) {
            if(bean.getAdminID() != null) {
                DB.addPairing(bean.getProjectID(), bean.getSolutionProviderID(), bean.getAdminID());
            }else{
                DB.addPairing(bean.getProjectID(), bean.getSolutionProviderID(), 0);
            }
        }
    }

    public Queue<projectBean> getContributors(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() > 0) {
            ResultSet rs = DB.getProjectContributors(bean.getProjectID());
            return makeProjectBeanQueue(rs);
        }
        return null;
    }

    public Queue<projectBean> getAdminsPairings(projectBean bean) throws java.sql.SQLException {
        if(bean.getAdminID() != null && bean.getAdminID() > 0) {
            ResultSet rs = DB.getAdminsPairings(bean.getAdminID());
            return makeProjectBeanQueue(rs);
        }
        return null;
    }

    @Override
    protected projectBean makeProjectBean(ResultSet rs) throws java.sql.SQLException {
        projectBean bean = new projectBean();
        bean.setProjectID(rs.getInt("projectID"));
        bean.setSolutionProviderID(rs.getInt("sproviderID"));
        bean.setAdminID(rs.getInt("adminID"));
        bean.setActive(rs.getBoolean("active"));
        return bean;
    }
}
