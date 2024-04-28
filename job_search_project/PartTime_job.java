package job_search_project;

public class PartTime_job extends job implements JobType {
    protected double hourlyRate;
    protected int maxHours;

    public PartTime_job(int jobID, String jobTitle, String jobDescription, double hourlyRate, int maxHours) {
        super(jobID, jobTitle, jobDescription);
        this.hourlyRate = hourlyRate;
        this.maxHours = maxHours;
    }

    @Override
    public double calculateWeeklyPay() {
        return hourlyRate * maxHours;
    }

    @Override
    public String getBenefitsPackage() {
        // Assume part-time jobs have limited benefits
        return "Limited benefits for part-time positions.";
    }
}
