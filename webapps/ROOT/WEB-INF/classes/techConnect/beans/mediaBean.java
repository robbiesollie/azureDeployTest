package techConnect.beans;

public class mediaBean {
    private Integer mediaID;
    private Integer userID;
    private Integer projectID;
    private String address;

    public mediaBean() {
        mediaID = null;
        userID = null;
        projectID = null;
        address = null;
    }

    public void setMediaID(int mediaID) {this.mediaID = mediaID;}

    public Integer getMediaID() {return this.mediaID;}

    public void setUserID(int userID) {this.userID = userID;}

    public Integer getUserID() {return this.userID;}

    public void setProjectID(int projectID) {this.projectID = projectID;}

    public Integer getProjectID() {return this.projectID;}

    public void setAddress(String address) {this.address = address;}

    public String getAddress() {return this.address;}
}
