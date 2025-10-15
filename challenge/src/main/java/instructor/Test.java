package instructor;

public class Test {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Jali", "Zakariae", "06451615641685", "Zakariae.jali@um6p.ma","AB 123");
        Subject IntroductionToComputerScience = new Subject("cs-101","Introduction to computer science",instructor1);
        System.out.println("Clean employeeNumber:"+instructor1.cleanEmployeeNumber());
        System.out.println("NormalizedCode:"+IntroductionToComputerScience.normalizedCode());
        System.out.println("ProperTitle:"+IntroductionToComputerScience.properTitle());
        System.out.println("SummaryLine:"+instructor1.summaryLine());
        System.out.println("isIntroCourse:"+IntroductionToComputerScience.isIntroCourse());
        System.out.println("toCard:\n"+instructor1.toCard());
        System.out.println("SyllabusLine:"+IntroductionToComputerScience.syllabusLine());
        instructor1.displayName();
    }
}
