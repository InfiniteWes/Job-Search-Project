package job_search_project;

public class FullTime_job extends job {
    private double salary;
    private double retirementHelp;
    private double companyStocks;
    private double signOnBonus;

    public FullTime_job(int jobID, String jobTitle, String jobDescription, double salary, double retirementHelp, double companyStocks, double signOnBonus) {
        super(jobID, jobTitle, jobDescription);
        this.salary = salary;
        this.retirementHelp = retirementHelp;
        this.companyStocks = companyStocks;
        this.signOnBonus = signOnBonus;
    }

    public void setBenefitsPackage() {
        this.retirementHelp = 0.25 * salary;
        this.companyStocks = 0.05 * salary;
        this.signOnBonus = 0.05 * salary;
    }

    public String getBenefitsPackage() {
        return "Retirement Help: " + retirementHelp + "\nCompany Stocks: " + companyStocks + "\nSign On Bonus: " + signOnBonus;
    }
}
