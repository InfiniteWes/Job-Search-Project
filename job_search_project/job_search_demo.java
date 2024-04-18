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

        System.out.println("Select a job by number (1, 2, or 3):");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 3) {
            System.out.println("You selected:");
            System.out.println(jobs[choice - 1].displayJobDetails());

            System.out.println("\nWould you like to submit a job application to this job? (yes/no)");
            scanner.nextLine();  // Consume newline
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Application submitted successfully!");
            } else {
                System.out.println("Application not submitted.");
            }
        } else {
            System.out.println("Invalid job number.");
        }

        scanner.close();
    }
}
