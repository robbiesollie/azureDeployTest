package techConnect.dao;

import techConnect.beans.providerBean;

import java.sql.ResultSet;
import java.util.Queue;

public class adminDAO extends UserDAO {

    //Creates a new admin
    public void addAdmin(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null && bean.getPassword() != null && bean.getEmail() != null && bean.getAffiliation() != null && bean.getLocation() != null && bean.getGroup() != null) {
            DB.addAdmin(bean.getUserName(), bean.getPassword(), bean.getEmail(), bean.getAffiliation(), bean.getLocation(), bean.getGroup());
        }
    }

    //Returns all admins
    public Queue<providerBean> getAdmin() throws java.sql.SQLException {
        ResultSet rs = DB.getAdmins();
        return makeBeanQueue(rs);
    }

    //Returns an admin of given ID
    public providerBean getAdminFromID(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserID() != null && bean.getUserID() > 0) {
            ResultSet rs = DB.getAdmins(bean.getUserID());
            return makeBean(rs);
        }
        return null;
    }

    //Returns admin with a given name.
    public providerBean getAdminFromName(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null) {
            ResultSet rs = DB.getAdmins(bean.getUserName());
            return makeBean(rs);
        }
        return null;
    }
}
