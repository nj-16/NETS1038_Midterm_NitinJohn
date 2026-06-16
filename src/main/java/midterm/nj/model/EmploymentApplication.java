package midterm.nj.model;

/*
 * Name: Nitin John
 * Student ID: 200582109
 * Purpose: Defining all getters and setters
 */

public class EmploymentApplication {

    private String fullName;
    private String currentAddress;
    private String contactNumber;
    private String emailAddress;
    private String education;
    private String gender;
    private String dateAvailable;
    private String desiredPosition;
    private String desiredSalary;
    private String legallyAuthorized;
    private String relativesInCompany;
    private String relativesExplanation;

    public EmploymentApplication(String fullName, String currentAddress,
            String contactNumber, String emailAddress, String education,
            String gender, String dateAvailable, String desiredPosition,
            String desiredSalary, String legallyAuthorized,
            String relativesInCompany, String relativesExplanation) {

        this.fullName = fullName;
        this.currentAddress = currentAddress;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.education = education;
        this.gender = gender;
        this.dateAvailable = dateAvailable;
        this.desiredPosition = desiredPosition;
        this.desiredSalary = desiredSalary;
        this.legallyAuthorized = legallyAuthorized;
        this.relativesInCompany = relativesInCompany;
        this.relativesExplanation = relativesExplanation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }

    public String getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(String desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public String getLegallyAuthorized() {
        return legallyAuthorized;
    }

    public void setLegallyAuthorized(String legallyAuthorized) {
        this.legallyAuthorized = legallyAuthorized;
    }

    public String getRelativesInCompany() {
        return relativesInCompany;
    }

    public void setRelativesInCompany(String relativesInCompany) {
        this.relativesInCompany = relativesInCompany;
    }

    public String getRelativesExplanation() {
        return relativesExplanation;
    }

    public void setRelativesExplanation(String relativesExplanation) {
        this.relativesExplanation = relativesExplanation;
    }
}