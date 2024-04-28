package job_search_project;

import java.util.HashMap;

public class JobTracker {
    // HashMap to store job titles and their respective application count
    private HashMap<String, Integer> applicationsCount = new HashMap<>();

    // Method to increment application count for a job
    public void submitApplication(String jobTitle) {
        applicationsCount.put(jobTitle, applicationsCount.getOrDefault(jobTitle, 0) + 1);
    }

    // Method to display the number of applications submitted for each job
    public void displayApplicationsCount() {
        System.out.println("\nApplications count per job:");
        for (String job : applicationsCount.keySet()) {
            System.out.println(job + ": " + applicationsCount.get(job));
        }
    }
}
