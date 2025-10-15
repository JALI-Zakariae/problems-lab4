package instructor;
import java.lang.String;


public class Subject{

    private String title;
    private String code;
    Instructor instructor;
    public Subject(String code,String title,Instructor instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        StringBuilder s = new StringBuilder();
        String[] words = title.split(" ");
        for (int i = 0;i<words.length;i++){
            s.append(words[i].substring(0,1).toUpperCase());
            s.append(words[i].substring(1).toLowerCase());
            if (i<words.length-1){
            s.append(" ");}
        }
        return s.toString();

    }
    public boolean isIntroCourse(){
        if (title.startsWith("Intro") || title.startsWith("INTRO-")){
            return true;
        }
        return false;
    }
    public String syllabusLine(){
        StringBuilder s = new StringBuilder();
        s.append(code).append(" - ").append(title).append("Instructor:").append(instructor.getSecondName()).append(" ").append(instructor.getFirstName()).append("\n");
        return s.toString();
    }
}
