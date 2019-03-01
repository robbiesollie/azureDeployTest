package Entity;

public class Project {
    private int projectID;
    private String projectName;
    private String proposal;
    private String projectProvider;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getProjectProvider() {
        return projectProvider;
    }

    public void setProjectProvider(String projectProvider) {
        this.projectProvider = projectProvider;
    }

    public Project(int projectID, String projectName, String proposal, String projectProvider) {

        this.projectID = projectID;
        this.projectName = projectName;
        this.proposal = proposal;
        this.projectProvider = projectProvider;
    }
}