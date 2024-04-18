package job_search_project;
import java.util.Scanner;

public class job_search_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        job[] jobs = {
            new job(1, "Software Developer", "Develop software applications."),
            new job(2, "Web Developer", "Responsible for designing websites."),
            new job(3, "Data Analyst", "Analyze data and generate insights.")
        };

        System.out.println("Select a job by number:");
        System.out.println("[1]  Software Developer");
        System.out.println("[2]  Web Developer");
        System.out.println("[3]  Data Analyst");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over after nextInt()

        if (choice >= 1 && choice <= 3) {
            System.out.println("You selected:");
            System.out.println(jobs[choice - 1].displayJobDetails());
            System.out.println("\nWould you like to submit a job application to this job? (yes/no)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Please enter your name:");
                String name = scanner.nextLine();  // Read user input for name

                System.out.println("\nPlease enter your email:");
                String email = scanner.nextLine();  // Read user input for email

                applicant_details applicant = new applicant_details(name, email);  // Create an instance of applicant_details
                System.out.println("\nApplication submitted successfully!");
                System.out.println(applicant.getApplicantInfo());  // Optionally display entered details
            } else {
                System.out.println("Application not submitted.");
            }
        } else {
            System.out.println("Invalid job number.");
        }

        scanner.close();
    }
}
