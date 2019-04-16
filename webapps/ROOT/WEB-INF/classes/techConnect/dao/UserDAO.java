package techConnect.dao;

import techConnect.beans.UserBean;
import techConnect.beans.providerBean;
import techConnect.dao.DAO;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

//A DAO which creates methods static across every type
public class UserDAO extends DAO {

    //creates a user who provides both problems and solutions
    public void setDoubleProvider(providerBean bean) throws java.sql.SQLException {
        //char userType, String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate
        if(bean.getUserName() != null && bean.getPassword() != null && bean.getEmail() != null && bean.getAffiliation() != null && bean.getLocation() != null && bean.getGroup() != null) {
            int ID = DB.addUser('B', bean.getUserName(), bean.getPassword(), bean.getEmail(), bean.getAffiliation(), bean.getLocation(), bean.getGroup(), false);
            bean.setUserID(ID);
        }
    }

    public void setUser(UserBean bean) throws java.sql.SQLException {
        //creates a user who provides both problems and solutions


        if(bean.getUsername() != null && bean.getPassword() != null && bean.getEmail() != null) {
        System.out.println(bean.getEmail());
        System.out.println(bean.getPassword());
        System.out.println(bean.getUsername());
        //char userType, String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate
            DB.addUser('X', bean.getUsername(), bean.getPassword(), bean.getEmail(), "", "", false, false);
        }
    }
//Returns all needed user data when given an appropriate username and password
    public UserBean login(UserBean bean) throws java.sql.SQLException {
        if(bean.getUsername() != null && bean.getPassword() != null) {
            ResultSet rs = DB.login(bean.getUsername(), bean.getPassword());
            return makeUserBean(rs);
        }
        bean.setValid(false);
        return bean;
    }

    public providerBean login(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null && bean.getPassword() != null) {
            ResultSet rs = DB.login(bean.getUserName(), bean.getPassword());
            return makeBean(rs);
        }
        return null;
    }

    //makes changes to a user's data
    public void updateUser(providerBean bean, providerBean oldBean) throws java.sql.SQLException {
        if(bean.getUserName() != null && bean.getPassword() != null && bean.getEmail() != null && bean.getAffiliation() != null && bean.getLocation() != null && oldBean.getUserName() != null && oldBean.getPassword() != null) {
            DB.updateUser(bean.getUserName(), bean.getPassword(), bean.getEmail(), bean.getAffiliation(), bean.getLocation(), bean.getGroup(), false, oldBean.getUserName(), oldBean.getPassword());
        }
    }

    //Creates a queue of provider beans
    protected Queue<providerBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<providerBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    //creates a provider bean from a result set.
    protected providerBean makeBean(ResultSet rs) throws java.sql.SQLException {
        providerBean bean = new providerBean();
        rs.next();
        bean.setUserID(rs.getInt("userID"));
        bean.setUserName(rs.getString("user_name"));
        bean.setPassword(rs.getString("pass"));
        bean.setAffiliation(rs.getString("affiliationn"));
        bean.setEmail(rs.getString("email"));
        bean.setLocation(rs.getString("location"));
        bean.setGroup(rs.getBoolean("in_group"));
        bean.setActive(rs.getBoolean("active"));
        return bean;
    }

    protected UserBean makeUserBean(ResultSet rs) throws java.sql.SQLException {
        UserBean bean = new UserBean();
        rs.next();
        bean.setUserID(rs.getInt("userID"));
        bean.setUsername(rs.getString("user_name"));
        bean.setPassword(rs.getString("pass"));
        bean.setEmail(rs.getString("email"));
        bean.setValid(true);
        return bean;
    }
}
