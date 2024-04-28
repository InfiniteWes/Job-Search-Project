package job_search_project;

public class applicant_details {
    private String name;
    private String email;
    private String phoneNumber;
    private String[] resume;

    public applicant_details(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getApplicantInfo() {
        return "Applicant Name: " + name + ", Email: " + email + ", Phone Number: " + phoneNumber;
    }

    public String updateContactInfo() {
        // Needs to be implemented
    }

    public String uploadResume() {
        // Needs to be implemented
    }
}
