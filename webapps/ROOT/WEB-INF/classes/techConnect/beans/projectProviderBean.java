package techConnect.beans;

//Contains a project providers data
public class projectProviderBean {
    Integer userID;
    String userName;
    String password;
    String affiliation;
    String email;
    String location;
    Boolean group;
    Boolean active;

    public void setUserID(int userID){ this.userID = userID; }

    public int getUserID(){ return this.userID; }

    public void setUserName(String userName){ this.userName = userName; }

    public String getUserName(){ return this.userName; }

    public void setPassword(String password){ this.password = password; }

    public String getPassword(){ return this.password; }

    public void setAffiliation(String affiliation) { this.affiliation = affiliation; }

    public String getAffiliation(){ return this.affiliation; }

    public void setEmail(String email){ this.email = email; }

    public String getEmail(){ return this.email; }

    public void setLocation(String location){ this.location = location; }

    public String getLocation(){ return this.location; }

    public void setGroup(Boolean group){ this.group = group; }

    public Boolean getGroup(){ return this.group; }

    public void setActive(Boolean active){ this.active = active; }

    public Boolean getActive(){ return this.active;}
}
