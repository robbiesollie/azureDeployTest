package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class PublicProjectDAO {
    private DBWrapper DB;

    public PublicProjectDAO() {
        DB = new DBWrapper();
    }

    public void setPublicProject(PublicProjectBean bean) throws java.sql.SQLException {
        if(bean.getProviderID() != null && bean.getName() != null && bean.getProposal() != null) {
            DB.addPublicProject(bean.getProviderID(), bean.getName(), bean.getProposal());
        }
    }

    public PublicProjectBean getPublicProject(String name) throws java.sql.SQLException {
        if(name != null) {
            ResultSet rs = DB.getPublicProjects(name);
            PublicProjectBean bean = makeBean(rs);
            rs.close();
            return bean;
        }
        return null;
    }

    public Queue<PublicProjectBean> getPublicProject(int projectID) throws java.sql.SQLException {
        if(projectID > 0) {
            ResultSet rs = DB.getPublicProjects(projectID);
            return makeBeanQueue(rs);
        }
        return null;
    }

    public Queue<PublicProjectBean> getPublicProject() throws java.sql.SQLException {
        ResultSet rs = DB.getPublicProjects();
        return makeBeanQueue(rs);
    }

    private Queue<PublicProjectBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<PublicProjectBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    private PublicProjectBean makeBean(ResultSet rs) throws java.sql.SQLException {
        PublicProjectBean bean = new PublicProjectBean();
        bean.setProjectID(rs.getInt(1));
        bean.setProviderID(rs.getInt(2));
        bean.setName(rs.getString(3));
        bean.setProposal(rs.getString(4));
        bean.setComplete(rs.getBoolean(5));
        return bean;
    }
}

