package job_search_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// applicant_details.java
public class applicant_details {
    private String name;
    private String email;
    private String phoneNumber;
    private String resume;

    // Constructor
    public applicant_details(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method to get applicant information
    public String getApplicantInfo() {
        return "Applicant Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber;
    }

    // Method to upload resume
    public void uploadResume(String resumePath) {
        this.resume = resumePath;
        try {
            File resumeFile = new File(resumePath);
            if (resumeFile.createNewFile()) {
                System.out.println("Resume file created: " + resumeFile.getName());
            } else {
                System.out.println("Resume file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the resume file.");
            e.printStackTrace();
        }
    }

    // Method to read resume
    public String readResume() {
        if (this.resume == null) {
            return "No resume uploaded.";
        }
        try {
            File resumeFile = new File(resume);
            Scanner myReader = new Scanner(resumeFile);
            StringBuilder resumeContent = new StringBuilder();
            while (myReader.hasNextLine()) {
                resumeContent.append(myReader.nextLine() + "\n");
            }
            myReader.close();
            return resumeContent.toString();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the resume file.");
            e.printStackTrace();
            return "Error reading resume.";
        }
    }
}
