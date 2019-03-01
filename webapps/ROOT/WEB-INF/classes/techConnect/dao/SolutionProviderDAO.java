package techConnect.dao;

import techConnect.beans.projectBean;
import techConnect.beans.providerBean;

import java.sql.ResultSet;
import java.util.Queue;

//Dao fo exclusive solution provider methods
public class SolutionProviderDAO extends UserDAO {

    //Creates a new solution provider
    public void setSolutionProvider(providerBean bean) throws java.sql.SQLException {
        //char userType, String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate
        if(bean.getUserName() != null && bean.getPassword() != null && bean.getEmail() != null && bean.getAffiliation() != null && bean.getLocation() != null && bean.getGroup() != null) {
            DB.addUser('S', bean.getUserName(), bean.getPassword(), bean.getEmail(), bean.getAffiliation(), bean.getLocation(), bean.getGroup(), false);
        }
    }

    //Returns user data when given the correct name and password
    public providerBean solutionProviderLogin(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null && bean.getPassword() != null) {
            ResultSet rs = DB.solutionProviderLogin(bean.getUserName(), bean.getPassword());
            return makeBean(rs);
        }
        return null;
    }

    //Returns all solution providers
    public Queue<providerBean> getSolutionProvider() throws java.sql.SQLException {
        ResultSet rs = DB.getSolutionProviders();
        return makeBeanQueue(rs);
    }

    //returns a solution provider of a given ID
    public providerBean getSolutionProviderFromID(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserID() > 0) {
            ResultSet rs = DB.getSolutionProviders(bean.getUserID());
            return makeBean(rs);
        }
        return null;
    }

    //returns a solution provider of a given name
    public providerBean getSolutionProviderFromName(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserName() != null) {
            ResultSet rs = DB.getSolutionProviders(bean.getUserName());
            return makeBean(rs);
        }
        return null;
    }


    public Queue<projectBean> getProjects(providerBean bean) throws java.sql.SQLException {
        if(bean.getUserID() > 0) {
            ResultSet rs = DB.getSolutionProvidersProjects(bean.getUserID());
            return makeProjectBeanQueue(rs);
        }
        return null;
    }
}