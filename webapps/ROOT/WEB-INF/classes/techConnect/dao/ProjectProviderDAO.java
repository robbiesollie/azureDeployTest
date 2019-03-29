package techConnect.dao;

import techConnect.beans.providerBean;

import java.sql.ResultSet;
import java.util.Queue;

//DAO containing methods exclusive to project providers
public class ProjectProviderDAO extends UserDAO {

    //Creates a new project provider
    public void setProjectProvider(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null && bean.getPassword() != null && bean.getEmail() != null && bean.getAffiliation() != null && bean.getLocation() != null && bean.getGroup() != null) {
            DB.addUser('P', bean.getUserName(), bean.getPassword(), bean.getEmail(), bean.getAffiliation(), bean.getLocation(), bean.getGroup(), false);
        }
    }

    //Returns a queue of all project providers
    public Queue<providerBean> getProjectProvider() throws java.sql.SQLException {
        ResultSet rs = DB.getProblemProviders();
        return makeBeanQueue(rs);
    }

    //returns a bean containing the data of a project provider of a certain ID
    public providerBean getProjectProviderFromID(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserID() != null && bean.getUserID() > 0) {
            ResultSet rs = DB.getProblemProviders(bean.getUserID());
            return makeBean(rs);
        }
        return null;
    }

    //returns a bean containing the data of a project provider of a certain name
    public providerBean getProjectProviderFromName(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null) {
            ResultSet rs = DB.getProblemProviders(bean.getUserName());
            return makeBean(rs);
        }
        return null;
    }
}
