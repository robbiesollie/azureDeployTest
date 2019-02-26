package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class mediaDAO extends DAO {
    public void setUserMedia(mediaBean bean) {
        if(bean.getUserID() != null && bean.getUserID() > 0 && bean.getAddress() != null) {
            DB.addUserMedia(bean.getUserID(), bean.getAddress());
        }
    }

    public Queue<mediaBean> getUserMedia(mediaBean bean) throws java.sql.SQLException {
        ResultSet rs = DB.getUserMedia(bean.getUserID());
        return makeUserMediaBeanQueue(rs);
    }

    public void setProjectMedia(mediaBean bean) {
        if(bean.getUserID() != null && bean.getUserID() > 0 && bean.getAddress() != null) {
            DB.addProjectMedia(bean.getUserID(), bean.getAddress());
        }
    }

    public Queue<mediaBean> getProjectMedia(mediaBean bean) throws java.sql.SQLException {
        ResultSet rs = DB.getProjectMedia(bean.getUserID());
        return makeProjectMediaBeanQueue(rs);
    }

    public void deleteUserMedia(mediaBean bean) {
        if(bean.getMediaID() != null && bean.getMediaID() > 0) {
            DB.deleteUserMedia(bean.getMediaID());
        }
    }

    public void deleteProjectMedia(mediaBean bean) {
        if(bean.getMediaID() != null && bean.getMediaID() > 0) {
            DB.deleteProjectMedia(bean.getMediaID());
        }
    }

    protected Queue<mediaBean> makeUserMediaBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<mediaBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeUserMediaBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    protected mediaBean makeUserMediaBean(ResultSet rs) throws java.sql.SQLException {
        mediaBean bean = new mediaBean();
        bean.setUserID(rs.getInt("userID"));
        bean.setAddress(rs.getString("file_address"));
        return bean;
    }

    protected Queue<mediaBean> makeProjectMediaBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<mediaBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeProjectMediaBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    protected mediaBean makeProjectMediaBean(ResultSet rs) throws java.sql.SQLException {
        mediaBean bean = new mediaBean();
        bean.setUserID(rs.getInt("projectID"));
        bean.setAddress(rs.getString("file_address"));
        return bean;
    }
}
