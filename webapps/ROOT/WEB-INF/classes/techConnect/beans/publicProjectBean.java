package techConnect.beans;

//bean containing data for public projects
public class publicProjectBean {
    private Integer projectID;
    private Integer providerID;
    private String name;
    private String proposal;
    private Boolean complete;

    public publicProjectBean() {
        projectID = null;
        providerID = null;
        name = null;
        proposal = null;
        complete = null;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getProposal() {
        return proposal;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean getComplete() {
        return complete;
    }
}
