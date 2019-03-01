package techConnect.dao;

import techConnect.beans.contactBean;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

public class ContactDAO extends DAO {

    //Makes new contact
    public void setCotact(contactBean bean) {
        if(bean.getUserID() != null && bean.getUserID() > 0 && bean.getType() != null && bean.getAddress() != null) {
            DB.addContact(bean.getUserID(), bean.getType(), bean.getAddress(), false);
        }
    }

    //retrieves all of a user's contacts
    public Queue<contactBean> getContact(contactBean bean) throws java.sql.SQLException {
        ResultSet rs = DB.getContacts(bean.getUserID());
        return makeContactBeanQueue(rs);
    }

    //Updates an old contact with new data
    public void updateContact(contactBean bean) {
        if(bean.getContactID() != null && bean.getContactID() > 0 && bean.getType() != null && bean.getAddress() != null) {
            DB.updateContact(bean.getContactID(), bean.getType(), bean.getAddress());
        }
    }

    //Deletes a contact
    public void deleteContact(contactBean bean) {
        if(bean.getContactID() != null && bean.getContactID() > 0) {
            DB.deleteContact(bean.getContactID());
        }
    }

    //creates a queue of beans
    protected Queue<contactBean> makeContactBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<contactBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeContactBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    //turns data in a result set into a bean
    protected contactBean makeContactBean(ResultSet rs) throws java.sql.SQLException {
        contactBean bean = new contactBean();
        bean.setUserID(rs.getInt("userID"));
        bean.setContactID(rs.getInt("contactID"));
        bean.setType(rs.getString("contact_type"));
        bean.setAddress(rs.getString("contact_address"));
        return bean;
    }
}
