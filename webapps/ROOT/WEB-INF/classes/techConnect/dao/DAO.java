package techConnect.dao;

import techConnect.DBWrapper;
import techConnect.beans.projectBean;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class DAO {
    protected DBWrapper DB;

    public DAO() {
        DB = new DBWrapper();
    }

    protected projectBean makeProjectBean(ResultSet rs) throws java.sql.SQLException {
        projectBean bean = new projectBean();
        //rs.next();
        bean.setProjectID(rs.getInt("projectID"));
        bean.setProjectProviderID(rs.getInt("pproviderID"));
        bean.setSolutionProviderID(rs.getInt("sproviderID"));
        bean.setAdminID(rs.getInt("adminID"));
        bean.setProjectName(rs.getString("projectName"));
        bean.setProposal(rs.getString("proposal"));
        bean.setComplete(rs.getBoolean("complete"));
        bean.setActive(rs.getBoolean("active"));
        return bean;
    }

    protected Queue<projectBean> makeProjectBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<projectBean> beanSet = new LinkedList<>();
        while (rs.next()) {
            beanSet.add(makeProjectBean(rs));
        }
        rs.close();
        return beanSet;
    }
}
