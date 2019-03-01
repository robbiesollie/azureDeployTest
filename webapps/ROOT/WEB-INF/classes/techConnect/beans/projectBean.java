package techConnect.beans;

//Bean that contains all relevent data for a project
public class projectBean {
    private Integer projectID;
    private Integer projectProviderID;
    private Integer solutionProviderID;
    private Integer adminID;
    private String projectName;
    private String proposal;
    private Boolean complete;
    private Boolean active;

    public projectBean() {
        this.projectID = null;
        this.projectProviderID = null;
        this.solutionProviderID = null;
        this.adminID = null;
        this.projectName = null;
        this.proposal = null;
        this.complete = null;
        this.active = null;
    }

    public void setProjectID(Integer projectID) {this.projectID = projectID;}

    public Integer getProjectID() {return this.projectID;}

    public void setProjectProviderID(Integer projectProviderID) {this.projectProviderID = projectProviderID;}

    public Integer getProjectProviderID() {return this.projectProviderID;}

    public void setSolutionProviderID(Integer solutionProviderID) {this.solutionProviderID = solutionProviderID;}

    public Integer getSolutionProviderID() {return this.solutionProviderID;}

    public void setAdminID(Integer adminID) {this.adminID = adminID;}

    public Integer getAdminID() {return this.adminID;}

    public void setProjectName(String projectName) {this.projectName = projectName;}

    public String getProjectName() {return this.projectName;}

    public void setProposal(String proposal) {this.proposal = proposal;}

    public String getProposal() {return this.proposal;}

    public void setComplete(Boolean complete) {this.complete = complete;}

    public Boolean getComplete() {return this.complete;}

    public void setActive(Boolean active) {this.active = active;}

    public Boolean getActive() {return this.active;}
}
