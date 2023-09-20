package Controller;
public class Experience extends Candidate{
    private int yearExperience;
    private int professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, int professionalSkill, String id, String Fname, String Lname, int birthDate, String address, String phone, String email, int typeCandidate) {
        super(id, Fname, Lname, birthDate, address, phone, email, typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public int getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(int professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
}
