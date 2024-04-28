package job_search_project;
import java.util.Scanner;

public class job_search_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        job[] jobs = job.getJobs();  // Ensure Jobs.java contains all job definitions

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
                
                // Display additional details based on the job type
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
                        // Assuming applicant_details has methods to handle application submission
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
        scanner.close();
    }
}
