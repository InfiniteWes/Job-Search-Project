package job_search_project;

public class PartTime_job {
    protected double hourlyRate;
    protected int maxHours;

    PartTime_job(double hourlyRate, int maxHours) {

    }

    public double calculateWeeklyPay() {
        return hourlyRate * maxHours;
    }
}
