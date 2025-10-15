package instructor;
import student.Person;
public class Instructor extends Person {
    private String employeeNumber;
    public Instructor(String nom, String prenom, String telephone, String email,String employeeNumber){
        super(nom, prenom, telephone, email);
        this.employeeNumber = employeeNumber;
    }
    public String cleanEmployeeNumber(){
        return employeeNumber.replaceAll("\\s+","");
    }
    public String summaryLine(){
        return String.format("Instructor[%s, %s, %s]",employeeNumber,getSecondName(),getFirstName());
    }
    public String toCard(){
        StringBuilder s = new StringBuilder();
        s.append("Instructor\n---------\n");
        s.append("Employee #:").append(employeeNumber).append("\n");
        s.append("Name    :").append(getSecondName()).append(", ").append(getFirstName()).append("\n");
        s.append("Email   :").append(getEmail()).append("\n");
        s.append("Phone   :").append(getPhone()).append("\n");
        return s.toString();


    }
    public void displayName(){
        StringBuilder s = new StringBuilder();
        if (getSecondName() != null ){
            s.append(getSecondName());
            s.append(" ");
        }

        if (getFirstName() != null){
            s.append(getFirstName());
        }
        System.out.println(s.toString());

    }
}
