
package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        if(major.getStudentCount()<50) {
            this.cne = cne;
            this.major = major;
            major.addStudent(this);
        }
        else{
            System.out.println("Le nombre maximal est atteint,vous devez choisir une autre filière! ");
        }
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,Major.getDefaultMajor());


    }

    // Getters

    public Major getMajor() {
        return major;
    }

    public String getCne() {
        return cne;
    }
    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    public String getFullName(){
        return String.format("%s,%s%s",getFirstName().toUpperCase(),getSecondName().substring(0,1).toUpperCase(),getSecondName().substring(1).toLowerCase());
    }


}

