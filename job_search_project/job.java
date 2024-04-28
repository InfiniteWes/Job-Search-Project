package job_search_project;

// Creating abstract class "job"
public abstract class job {
    protected int jobID;
    protected String jobTitle;
    protected String jobDescription;
    protected String[] requirements;
    protected static job[] jobs = {
        new FullTime_job(1, "Software Developer", "Develop software applications.", 120000, 30000, 6000, 6000),
        new PartTime_job(2, "Web Developer", "Responsible for designing websites.", 35, 40),
        new FullTime_job(3, "Data Analyst", "Analyze data and generate insights.", 95000, 23750, 4750, 4750),
        new PartTime_job(4, "Librarian", "Helps with library operations.", 18, 40),
        new FullTime_job(5, "Accountant", "Helps with financial operations.", 85000, 21250, 4250, 4250),
        new FullTime_job(6, "Lawyer", "Helps with legal matters.", 150000, 37500, 7500, 7500)
    };

    // Constructor that sets job details and initializes requirements based on the job title
    public job(int jobID, String jobTitle, String jobDescription) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        setRequirementsByTitle(jobTitle);  // Set requirements based on the job title
    }

    // Static method to get all jobs
    public static job[] getJobs() {
        return jobs;
    }

    // Setter method to set requirements based on the job title
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
            case "Librarian":
                this.requirements = new String[]{"Excellent Reading Skills", "Writing Skills", "Bachelor's Degree"};
                break;
            case "Accountant":
                this.requirements = new String[]{"Excellent Accounting Skills", "Bachelor's Degree"};
                break;
            case "Lawyer":
                this.requirements = new String[]{"Excellent Legal Skills", "Bachelor's Degree", "Graduated with a 3.5+"};
            default:
                this.requirements = new String[]{"General Requirement"};
                break;
        }
    }

    // Method to display jobs
    public String displayJobs() {
        return "\nJob [" + jobID + "] - " + jobTitle;
    }

    // Abstract method to display job details
    public abstract String displayJobDetails();
}
