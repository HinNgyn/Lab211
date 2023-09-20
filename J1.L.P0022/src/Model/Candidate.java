package Controller;
public class Candidate {
    private String id;
    private String Fname;
    private String Lname;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int typeCandidate;

    public Candidate() {
    }

    public Candidate(String id, String Fname, String Lname, int birthDate, String address, String phone, String email, int typeCandidate) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCandidate = typeCandidate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return "Candidate{" + 
                "|" + id + 
                "|" + Fname + 
                "|" + Lname + 
                "|" + birthDate + 
                "|" + address + 
                "|" + phone + 
                "|" + email + 
                "|" + typeCandidate;
    }
    
    
    
}
