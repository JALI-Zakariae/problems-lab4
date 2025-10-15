package student;

public class Test {
    public static void main(String[] args) {

    Major mathematics = Major.createMajor("256","Mathematics");
    Major computerScience = Major.createMajor("256","ComputerScience");
    Student zakariae = new Student("jali","zakariae","0642965548","zakariae.jali@um6p.ma","45152",computerScience);
        Student alice = new Student("smith", "alice", "0612345678", "alice.smith@um6p.ma", "45153", computerScience);

        Student bob = new Student("johnson", "bob", "0623456789", "bob.johnson@um6p.ma", "45154", computerScience);
        Student carol = new Student("brown", "carol", "0634567890", "carol.brown@um6p.ma", "45155", mathematics);

        Student david = new Student("wilson", "david", "0645678901", "david.wilson@um6p.ma", "45156", mathematics);

        Student eve = new Student("miller", "eve", "0656789012", "eve.miller@um6p.ma", "45157", mathematics);
        computerScience.displayStudents();
        System.out.println(computerScience.findStudentByCNE("45152"));//student existe
        System.out.println(computerScience.findStudentByCNE("0"));//student n'existe pas
        computerScience.displayStudents();
        computerScience.removeStudent("45152");
        System.out.println(computerScience.getStudentListAsString());

    }
}

