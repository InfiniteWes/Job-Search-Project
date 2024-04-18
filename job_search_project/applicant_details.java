package job_search_project;

public class applicant_details {
    private String name;
    private String email;
    private String[] resume;

    public applicant_details(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getApplicantInfo() {
        return "Applicant Name: " + name + ", Email: " + email;
    }

    public String updateContactInfo() {
        // Needs to be implemented
    }

    public String updateResume() {
        // Needs to be implemented
    }
}
