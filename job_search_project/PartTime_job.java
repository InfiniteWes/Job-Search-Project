package job_search_project;

public class PartTime_job extends job {
    protected double hourlyRate;
    protected int maxHours;

    PartTime_job(int jobID, String jobTitle, String jobDescription, double hourlyRate, int maxHours) {
        super(jobID, jobTitle, jobDescription);
        this.hourlyRate = hourlyRate;
        this.maxHours = maxHours;
    }

    public String calculateWeeklyPay() {
        return "Weekly Pay: " + (hourlyRate * maxHours);
    }
}