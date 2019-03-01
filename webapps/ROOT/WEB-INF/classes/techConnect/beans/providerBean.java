package techConnect.beans;

//Bean containg data for all users
public class providerBean {
    Integer userID;
    String userName;
    String password;
    String affiliation;
    String email;
    String location;
    Boolean group;
    Boolean active;

    public providerBean() {
        this.userID = null;
        this.userName = null;
        this.password = null;
        this.affiliation = null;
        this.email = null;
        this.location = null;
        this.group = null;
        this.active = null;
    }

    public void setUserID(int userID){ this.userID = userID; }

    public Integer getUserID(){ return this.userID; }

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