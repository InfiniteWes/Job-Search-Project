package job_search_project;

public class applicant_details {
    private String name;
    private String email;

    public applicant_details(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getApplicantInfo() {
        return "Applicant Name: " + name + ", Email: " + email;
    }
}
