package job_search_project;
import java.util.Scanner;

public class job_search_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize jobs and tracker
        job[] jobs = job.getJobs();  
        JobTracker tracker = new JobTracker();

        // Prompt user for job search
        System.out.println("Are you looking for a job? (yes/no)");
        String response_original = scanner.nextLine();

        // While loop while user is looking for a job, else is exits the Program.
        while (response_original.equalsIgnoreCase("yes")) {
            for (int i = 0; i < jobs.length; i++) {
                System.out.println(jobs[i].displayJobs());
            }

            // Prompt user to select a job
            System.out.println("Select a job by number:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Check if user selected a valid job in the list
            if (choice >= 1 && choice <= jobs.length) {
                job selectedJob = jobs[choice - 1];
                System.out.println("You selected:\n" + selectedJob.displayJobDetails());

                // Check job type and display details
                if (selectedJob instanceof FullTime_job) {
                    FullTime_job ftJob = (FullTime_job) selectedJob;
                    System.out.println("\nBenefits Package:");
                    System.out.println(ftJob.getBenefitsPackage());
                } else if (selectedJob instanceof PartTime_job) {
                    PartTime_job ptJob = (PartTime_job) selectedJob;
                    System.out.println("\nPart Time Job Details:");
                    System.out.println(ptJob.calculateWeeklyPay());
                }

                // Prompt user to submit an application
                System.out.println("\nWould you like to submit a job application to this job? (yes/no)");
                String response = scanner.nextLine();
    
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter your name:");
                    String name = scanner.nextLine();
    
                    System.out.println("\nPlease enter your email:");
                    String email = scanner.nextLine();
    
                    System.out.println("\nPlease enter your phone number:");
                    String phoneNumber = scanner.nextLine();
                    
                    System.out.println("Please upload your resume (enter file path):");
                    String resumePath = scanner.nextLine();

                    applicant_details applicant = new applicant_details(name, email, phoneNumber);
                    applicant.uploadResume(resumePath);

                    // Read and display the resume content for verification
                    String resumeContent = applicant.readResume();
                    System.out.println("Resume Content:\n" + resumeContent);

                    System.out.println("\nWould you like to submit your application? (yes/no)");
                    response = scanner.nextLine();
                    if (response.equalsIgnoreCase("yes")) {
                        tracker.submitApplication(selectedJob.jobTitle);  // Track application submission
                        System.out.println("Application submitted successfully.");
                        System.out.println(applicant.getApplicantInfo());
                    } else {
                        System.out.println("Application not submitted.");
                    }
                } else {
                    System.out.println("No application submitted.");
                }
            } else {
                System.out.println("Invalid job number.");
            }
            System.out.println("Are you looking for a job? (yes/no)");
            response_original = scanner.nextLine();
        }

        // Display total applications for each job at the end of the session
        tracker.displayApplicationsCount();
        scanner.close();
    }
}
