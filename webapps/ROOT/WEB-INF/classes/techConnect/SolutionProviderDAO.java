package techConnect;
import java.sql.*;
import java.util.LinkedList;
import java.util.Queue;


public class SolutionProviderDAO {
    /**
     * Initialize a SolutionProvider with the given bean containing Skill information and username,
     * return true if success
     */
//    public static boolean initProvider(SolutionProviderBean bean) {
//        //TODO: Implement DAO to make database calls @MCecil @ALocker
//        throw new RuntimeException("Method has not yet been implemented");
//    }
    private DBWrapper DB;

    public SolutionProviderDAO(){
        DB = new DBWrapper();
    }

    public Queue<SolutionProviderBean> getUsername() throws java.sql.SQLException{
        ResultSet rs = DB.getSolutionProviders();
        return makeBeanQueue(rs);
    }

    public Queue<SolutionProviderBean> getSkills() throws java.sql.SQLException{
        ResultSet rs = DB.getSkills();
        return makeBeanQueue(rs);
    }

    public void setSkills(SolutionProviderBean bean) throws java.sql.SQLException{
        if(bean.getSkills() != null){
            DB.addSkill("skillName");
        }
    }
    private Queue<SolutionProviderBean> makeBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<SolutionProviderBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeBean(rs));
        }while(rs.next());
        rs.close();
        return beanSet;
    }

    private PublicProjectBean makeBean(ResultSet rs) throws java.sql.SQLException{
        SolutionProviderBean bean = new SolutionProviderBean();

        return bean;
    }
}