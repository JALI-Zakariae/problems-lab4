
package student;

public class Major {
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    private static Major defaultMajor = new Major("23","Computer Science");
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id = nextId;
        nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;

    }
    public static Major getDefaultMajor(){
        return defaultMajor;
    }
    // Method to add a student
    public void addStudent(Student s) {
        students[studentCount] = s;
        studentCount++;

    }

    // Getters


    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in "+name+" major is: ");
        for (int i = 0;i<studentCount;i++){
            System.out.println((i+1)+". "+students[i].getCne()+"  "+students[i].getFirstName()+"  "+students[i].getSecondName());
        }

    }
    public static Major createMajor(String code,String name){
        if (name.equals("Computer Science")) {
            return defaultMajor;
        } else {
            return new Major(code, name);
        }
    }
    public Student findStudentByCNE(String cne){
        for (int i = 0;i<studentCount;i++){
            if (students[i].getCne().equals(cne)){
                return students[i];
            }

        }
        return null;
    }
    public boolean removeStudent(String cne){
        if(findStudentByCNE(cne)!=null){
            for(int i = 0;i<studentCount;i++){
                if (students[i].getCne().equals(cne)){
                    for (int j = i;j<studentCount-1;j++){
                        students[j] = students[j+1];
                    }
                    break;
                }
            }
            students[studentCount-1] = null;
            studentCount--;
            return true;
        }
        return false;
    }
    public void displayDetails(){
        System.out.println(name+"Capacity: "+50);
        System.out.println("Current enrollment: "+studentCount);
        System.out.println("Occupancy rate = "+((double)studentCount/50.0)*100);

    }

    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            sb.append("Étudiant ")
                    .append(i + 1)
                    .append(": ")
                    .append(student.getFirstName().toUpperCase())
                    .append(", ")
                    .append(student.getSecondName().substring(0, 1).toUpperCase())
                    .append(student.getSecondName().substring(1).toLowerCase())
                    .append(" - CNE: ")
                    .append(student.getCne())
                    .append(" - Tél: ")
                    .append(student.getPhone())
                    .append(" - Email: ")
                    .append(student.getEmail());


            if (i < studentCount - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
    }



