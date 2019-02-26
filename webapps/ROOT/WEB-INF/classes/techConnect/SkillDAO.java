package techConnect;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Queue;

//Dao for solution provider skills
public class SkillDAO extends DAO {

    //Creates a new skill
    public void setSkill(skillBean bean) {
        if(bean.getSkillName() != null) {
            DB.addSkill(bean.getSkillName());
        }
    }

    //Gets a queue of all skills
    public Queue<skillBean> getSkills() throws java.sql.SQLException {
        ResultSet rs = DB.getSkills();
        return makeSkillBeanQueue(rs);
    }

    //sets a skill to a certain user
    public void setUserSkill(skillBean bean) {
        if(bean.getSkillID() != null && bean.getSkillID() > 0 && bean.getUserID() != null && bean.getUserID() > 0) {
            DB.setUserSkills(bean.getSkillID(), bean.getUserID());
        }
    }

    //Updates a skill
    public void updateSkill(skillBean bean) {
        if(bean.getSkillID() != null && bean.getSkillID() > 0 && bean.getSkillName() != null) {
            DB.updateSkills(bean.getSkillID(), bean.getSkillName());
        }
    }

    //deletes all traces of a skill
    public void deleteSkill(skillBean bean) {
        if(bean.getSkillID() != null && bean.getSkillID() > 0) {
            DB.deleteSkills(bean.getSkillID());
        }
    }

    //deletes the relationship between a skill and user.
    public void deleteUserSkill(skillBean bean) {
        if(bean.getSkillID() != null && bean.getSkillID() > 0 && bean.getUserID() != null && bean.getUserID() > 0) {
            DB.deleteUserSkill(bean.getUserID(), bean.getSkillID());
        }
    }

    //Gets all the skills connected to a user
    public Queue<skillBean> getUserSkills(skillBean bean) throws java.sql.SQLException {
        if(bean.getUserID() != null && bean.getUserID() > 0) {
            ResultSet rs = DB.getUserSkills(bean.getUserID());
            return makeSkillBeanQueue(rs);
        }
        return null;
    }

    //puts several skill beans into a queue
    protected Queue<skillBean> makeSkillBeanQueue(ResultSet rs) throws java.sql.SQLException {
        Queue<skillBean> beanSet = new LinkedList<>();
        do {
            beanSet.add(makeSkillBean(rs));
        } while(rs.next());
        rs.close();
        return beanSet;
    }

    //makes a skill bean given result set data.
    protected skillBean makeSkillBean(ResultSet rs) throws java.sql.SQLException {
        skillBean bean = new skillBean();
        bean.setSkillID(rs.getInt("skillID"));
        bean.setSkillName(rs.getString("skill_name"));
        return bean;
    }
}
