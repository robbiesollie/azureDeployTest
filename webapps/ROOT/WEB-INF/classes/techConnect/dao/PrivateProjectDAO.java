package techConnect.dao;

import techConnect.beans.privateProjectBean;
import techConnect.beans.projectBean;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

//DAO which gets the DB to query private projects
public class PrivateProjectDAO extends ProjectDAO {

    //Creates a private project
    public void setPrivateProject(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectProviderID() != null && bean.getAdminID() != null && bean.getProjectName() != null && bean.getProposal() != null) {
            DB.addPrivateProject(bean.getProjectProviderID(), bean.getAdminID(), bean.getProjectName(), bean.getProposal());
        }
    }

    //Returns a bean containing the data concerning a private project once given a name.
    public projectBean getPrivateProjectFromName(projectBean bean) throws java.sql.SQLException {
        if(bean.getProjectName() != null) {
            ResultSet rs = DB.getPrivateProjects(bean.getProjectName());
            bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    //Returns a bean containing the data concerning a private project once given an ID.
    public Queue<projectBean> getPrivateProjectFromID(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() > 0 && bean.getProjectID() != null) {
            ResultSet rs = DB.getPrivateProjects(bean.getProjectID());
            return makeBeanQueue(rs);
        }
        return null;
    }

    //Returns a queue containing all private projects.
    public Queue<projectBean> getPrivateProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPrivateProjects();
        return makeBeanQueue(rs);
    }

    //Returns all private projects an admin is assosiated with.
    public Queue<projectBean>  getAdminsPrivateProtects(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getAdminID() != null && bean.getAdminID() > 0) {
            ResultSet rs = DB.getAdminsPrivateProjects(bean.getAdminID());
            return makeBeanQueue(rs);
        }
        return null;
    }

    //Makes a bean queue given a ResultSet containing private projects
    private Queue<projectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<projectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    //Makes a bean from private project data
    private projectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        projectBean bean = new projectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProjectProviderID(rs.getInt(2));
        bean.setProjectName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        bean.setAdminID(rs.getInt(7));
        return bean;
    }

    //Below code is identical to above but uses a different bean
    /*
    //Creates a private project
    public void setPrivateProject(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getAdminID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPrivateProject(bean.getProviderID(), bean.getAdminID(), bean.getName(), bean.getProposal());
        }
    }

    //Returns a bean containing the data concerning a private project once given a name.
    public privateProjectBean getPrivateProjectFromName(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getName() != null) {
            ResultSet rs = DB.getPrivateProjects(bean.getName());
            bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    //Returns a bean containing the data concerning a private project once given an ID.
    public Queue<privateProjectBean> getPrivateProjectFromID(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() > 0 && bean.getProjectID() != null) {
            ResultSet rs = DB.getPrivateProjects(bean.getProjectID());
            return makeBeanQueue(rs);
        }
        return null;
    }

    //Returns a queue containing all private projects.
    public Queue<privateProjectBean> getPrivateProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPrivateProjects();
        return makeBeanQueue(rs);
    }

    //Returns all private projects an admin is assosiated with.
    public Queue<privateProjectBean>  getAdminsPrivateProtects(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getAdminID() != null && bean.getAdminID() > 0) {
            ResultSet rs = DB.getAdminsPrivateProjects(bean.getAdminID());
            return makeBeanQueue(rs);
        }
        return null;
    }

    //Makes a bean queue given a ResultSet containing private projects
    private Queue<privateProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<privateProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    //Makes a bean from private project data
    private privateProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        privateProjectBean bean = new privateProjectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        bean.setAdminID(rs.getInt(7));
        return bean;
    }*/
}
