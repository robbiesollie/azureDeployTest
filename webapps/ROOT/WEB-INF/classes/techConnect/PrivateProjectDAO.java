package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class PrivateProjectDAO {
    private DBWrapper DB;

    public PrivateProjectDAO() {
        DB = new DBWrapper();
    }

    public void setPrivateProject(privateProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getAdminID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPrivateProject(bean.getProviderID(), bean.getAdminID(), bean.getName(), bean.getProposal());
        }
    }

    public privateProjectBean getPrivateProject(String name) throws java.sql.SQLException {
        if(name != null) {
            ResultSet rs = DB.getPrivateProjects(name);
            privateProjectBean bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    public Queue<privateProjectBean> getPrivateProject(int projectID) throws java.sql.SQLException {
        if(projectID > 0) {
            ResultSet rs = DB.getPrivateProjects(projectID);
            return makeBeanQueue(rs);
        }
        return null;
    }

    public Queue<privateProjectBean> getPrivateProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPrivateProjects();
        return makeBeanQueue(rs);
    }

    private Queue<privateProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<privateProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    private privateProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        privateProjectBean bean = new privateProjectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        bean.setAdminID(rs.getInt(7));
        return bean;
    }
}
