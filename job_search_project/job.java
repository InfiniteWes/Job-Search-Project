package job_search_project;

public class job {
    protected int jobID;
    protected String jobTitle;
    protected String jobDescription;
    protected String[] requirements;

    // Constructor that sets job details and initializes requirements based on the job title
    public job(int jobID, String jobTitle, String jobDescription) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        setRequirementsByTitle(jobTitle);  // Set requirements based on the job title
    }

    private void setRequirementsByTitle(String jobTitle) {
        switch (jobTitle) {
            case "Software Developer":
                this.requirements = new String[]{"Java", "Git", "SQL"};
                break;
            case "Web Developer":
                this.requirements = new String[]{"HTML", "CSS", "JavaScript"};
                break;
            case "Data Analyst":
                this.requirements = new String[]{"Python", "Excel", "SQL"};
                break;
            default:
                this.requirements = new String[]{"General Requirement"};
                break;
        }
    }

    public String displayJobDetails() {
        return "Job ID: " + jobID + "\nTitle: " + jobTitle + "\nDescription: " + jobDescription + "\nRequirements: " + String.join(", ", requirements);
    }
}
