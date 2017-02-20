package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
	// Kelas : IF 39-07

    private String name;
    private String specialization;
    private int projectWorked;
    //---------------------------------------------------------
    
    public Member(String name){
        this.name = name;
    }
    public Member(String name, String special){
        this.name = name;
        this.specialization = special;
    }
    
	public int getProjectWorked() {
        return projectWorked;
    }
    public String getName() {
        return name;
    
    }    

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }
 
 public String toString() {
        return "Member "+name+" specialized in "+specialization+" Programming, worked on "+projectWorked+" project(s)";
        
        //---------------------------------------------------------
    }

}
