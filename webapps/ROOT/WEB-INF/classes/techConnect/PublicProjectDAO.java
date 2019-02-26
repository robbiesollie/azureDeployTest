package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

//DAO concerning public projects
public class PublicProjectDAO extends ProjectDAO {

    //Creates new public project
    public void setPublicProject(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectProviderID() != null && bean.getProjectName() != null && bean.getProposal() != null) {
            DB.addPublicProject(bean.getProjectProviderID(), bean.getProjectName(), bean.getProposal());
        }
    }

    //gets a project from a name
    public projectBean getPublicProjectFromName(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectName() != null) {
            ResultSet rs = DB.getPublicProjects(bean.getProjectName());
            bean = makeBean(rs);
            //rs.close();
            return bean;
        }
        return null;
    }

    //gets a project from a given ID
    public Queue<projectBean> getProjectFromID(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() > 0) {
            ResultSet rs = DB.getPublicProjects(bean.getProjectID());
            //rs.next();
            return makeBeanQueue(rs);
        }
        return null;
    }

    //gets all public projects
    public Queue<projectBean> getPublicProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPublicProjects();
        //rs.next();
        return makeBeanQueue(rs);
    }

    private Queue<projectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<projectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    private projectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        projectBean bean = new projectBean();
        //rs.next();
        bean.setProjectID(rs.getInt(1));
        bean.setProjectProviderID(rs.getInt(2));
        bean.setProjectName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        return bean;
    }

    //Below code is identical to above but uses a different bean
    /*
    //Creates new public project
    public void setPublicProject(publicProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPublicProject(bean.getProviderID(), bean.getName(), bean.getProposal());
        }
    }

    //gets a project from a name
    public publicProjectBean getPublicProjectFromName(publicProjectBean bean) throws java.sql.SQLException {
        if(bean.getName() != null) {
            ResultSet rs = DB.getPublicProjects(bean.getName());
            bean = makeBean(rs);
            //rs.close();
            return bean;
        }
        return null;
    }

    //gets a project from a given ID
    public Queue<publicProjectBean> getPublicProjectFromID(publicProjectBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() > 0) {
            ResultSet rs = DB.getPublicProjects(bean.getProjectID());
            //rs.next();
            return makeBeanQueue(rs);
        }
        return null;
    }

    //gets all public projects
    public Queue<publicProjectBean> getPublicProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPublicProjects();
        //rs.next();
        return makeBeanQueue(rs);
    }

    private Queue<publicProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<publicProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    private publicProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        publicProjectBean bean = new publicProjectBean();
        //rs.next();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        return bean;
    }
    */
}
