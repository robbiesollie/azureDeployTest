package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class PublicProjectDAO {
    private DBWrapper DB;

    public PublicProjectDAO() {
        DB = new DBWrapper();
    }

    public void setPublicProject(publicProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPublicProject(bean.getProviderID(), bean.getName(), bean.getProposal());
        }
    }

    public publicProjectBean getPublicProject(String name) throws java.sql.SQLException {
        if(name != null) {
            ResultSet rs = DB.getPublicProjects(name);
            publicProjectBean bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    public Queue<publicProjectBean> getPublicProject(int projectID) throws java.sql.SQLException {
        if(projectID > 0) {
            ResultSet rs = DB.getPublicProjects(projectID);
            return makeBeanQueue(rs);
        }
        return null;
    }

    public Queue<publicProjectBean> getPublicProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPublicProjects();
        return makeBeanQueue(rs);
    }

    private Queue<publicProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<publicProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    private publicProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        publicProjectBean bean = new publicProjectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        return bean;
    }
}
