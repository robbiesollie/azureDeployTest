package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class PrivateProjectDAO {
    private DBWrapper DB;

    public PrivateProjectDAO() {
        DB = new DBWrapper();
    }

    public void setPrivateProject(PrivateProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getAdminID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPublicProject(bean.getProviderID(), bean.getName(), bean.getProposal());
        }
    }

    public PrivateProjectBean getPrivateProject(String name) throws java.sql.SQLException {
        if(name != null) {
            ResultSet rs = DB.getPrivateProjects(name);
            PrivateProjectBean bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    public Queue<PrivateProjectBean> getPrivateProject(int projectID) throws java.sql.SQLException {
        if(projectID > 0) {
            ResultSet rs = DB.getPrivateProjects(projectID);
            return makeBeanQueue(rs);
        }
        return null;
    }

    public Queue<PrivateProjectBean> getPrivateProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPrivateProjects();
        return makeBeanQueue(rs);
    }

    private Queue<PrivateProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<PrivateProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    private PrivateProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        PrivateProjectBean bean = new PrivateProjectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        bean.setAdminID(rs.getInt(7));
        return bean;
    }
}
