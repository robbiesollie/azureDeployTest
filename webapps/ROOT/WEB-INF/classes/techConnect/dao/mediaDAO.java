package techConnect.dao;

import techConnect.beans.mediaBean;
import techConnect.dao.DAO;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class mediaDAO extends DAO {
    public void setUserMedia(mediaBean bean) throws java.sql.SQLException {
        if(bean.getUserID() != null && bean.getUserID() > 0 && bean.getAddress() != null) {
            ResultSet rs = DB.addUserMedia(bean.getUserID(), bean.getAddress());
            rs.next();
            bean.setMediaID(rs.getInt(1));
        }
    }

    public Queue<mediaBean> getUserMedia(mediaBean bean) throws java.sql.SQLException {
        ResultSet rs = DB.getUserMedia(bean.getUserID());
        return makeUserMediaBeanQueue(rs);
    }

    public void setProjectMedia(mediaBean bean) throws java.sql.SQLException {
        if(bean.getProjectID() != null && bean.getProjectID() > 0 && bean.getAddress() != null) {
            ResultSet rs = DB.addProjectMedia(bean.getProjectID(), bean.getAddress());
            rs.next();
            bean.setMediaID(rs.getInt(1));
        }
    }

    public Queue<mediaBean> getProjectMedia(mediaBean bean) throws java.sql.SQLException {
        ResultSet rs = DB.getProjectMedia(bean.getProjectID());
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
        while(rs.next()) {
            beanSet.add(makeUserMediaBean(rs));
        }
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
        while(rs.next()) {
            beanSet.add(makeProjectMediaBean(rs));
        }
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
