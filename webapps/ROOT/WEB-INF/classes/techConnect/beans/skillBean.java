package techConnect.beans;

//All data needed for skill related methods.
public class skillBean {
    private Integer skillID;
    private Integer userID;
    private Integer level;
    private String skillName;

    public void setSkillID(int skillID) {this.skillID = skillID;}

    public Integer getSkillID() {return this.skillID;}

    public void setUserID(int userID) {this.userID = userID;}

    public Integer getUserID() {return this.userID;}

    public void setLevel(int level) {this.level = level;}

    public Integer getLevel() {return this.level;}

    public void setSkillName(String skillName) {this.skillName = skillName;}

    public String getSkillName() {return this.skillName;}
}
