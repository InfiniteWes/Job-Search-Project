package job_search_project;
import java.util.Scanner;

public class job_search_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        job[] jobs = job.getJobs();

        System.out.println("Are you looking for a job? (yes/no)");
        String response_original = scanner.nextLine();
        while (response_original.equalsIgnoreCase("yes")) {
            for (int i = 0; i < jobs.length; i++) {
                System.out.println(jobs[i].displayJobs());
            }
            System.out.println("Select a job by number:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over after nextInt()

            if (choice >= 1 && choice <= jobs.length) {
                System.out.println("You selected:\n");
                System.out.println(jobs[choice - 1].displayJobDetails());
                
                // Check if the selected job is part-time or full-time and display appropriate details
                if (jobs[choice - 1] instanceof FullTime_job) {
                    FullTime_job selectedJob = (FullTime_job) jobs[choice - 1];
                    System.out.println("\nBenefits Package:");
                    System.out.println(selectedJob.getBenefitsPackage());
                } else if (jobs[choice - 1] instanceof PartTime_job) {
                    PartTime_job selectedJob = (PartTime_job) jobs[choice - 1];
                    System.out.println("\nPart Time Job Details:");
                    System.out.println(selectedJob.calculateWeeklyPay());
                }

                System.out.println("\nWould you like to submit a job application to this job? (yes/no)");
                String response = scanner.nextLine();
    
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter your name:");
                    String name = scanner.nextLine();  // Read user input for name
    
                    System.out.println("\nPlease enter your email:");
                    String email = scanner.nextLine();  // Read user input for email
    
                    System.out.println("\nPlease enter your phone number:");
                    String phoneNumber = scanner.nextLine();  // Read user input for phone number
    
                    // The logic for handling application submission remains here
                    System.out.println("Application submitted successfully.");
                } else {
                    System.out.println("Application not submitted.");
                }
            } else {
                System.out.println("Invalid job number.");
            }
            System.out.println("Are you looking for a job? (yes/no)");
            response_original = scanner.nextLine();
        }
        scanner.close();
    }
}
