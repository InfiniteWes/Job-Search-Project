package job_search_project;

public class job {
    // Basic variables for Job
    protected int jobID;
    protected String jobTitle;
    protected String jobDescription;
    protected String[] requirements;

    // Creating Constructor
    public job() {

    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }

    public int getJobID() {
        return jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String[] getRequirements() {
        return requirements;
    }
}