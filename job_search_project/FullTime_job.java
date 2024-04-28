package job_search_project;

public class FullTime_job extends job implements JobType {
    private double salary;
    private double retirementHelp;
    private double companyStocks;
    private double signOnBonus;

    // Constructor
    public FullTime_job(int jobID, String jobTitle, String jobDescription, double salary, double retirementHelp, double companyStocks, double signOnBonus) {
        super(jobID, jobTitle, jobDescription);
        this.salary = salary;
        this.retirementHelp = retirementHelp;
        this.companyStocks = companyStocks;
        this.signOnBonus = signOnBonus;
    }

    // Setter method for benefits package
    public void setBenefitsPackage() {
        this.retirementHelp = 0.25 * salary;
        this.companyStocks = 0.05 * salary;
        this.signOnBonus = 0.05 * salary;
    }

    // Method to calculate weekly pay
    @Override
    public double calculateWeeklyPay() {
        return salary / 52;
    }

    // Method to display job details
    @Override
    public String displayJobDetails() {
        return "Job ID: " + jobID + "\nTitle: " + jobTitle + "\nSalary: $" + salary + "\nDescription: " + jobDescription + "\nRequirements: " + String.join(", ", requirements);
    }

    // Method to get benefits package
    @Override
    public String getBenefitsPackage() {
        return "Retirement Help: " + retirementHelp + "\nCompany Stocks: " + companyStocks + "\nSign On Bonus: " + signOnBonus;
    }
}
