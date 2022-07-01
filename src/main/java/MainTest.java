public class MainTest {
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InnerClassRunner {

    public static void main(String[] args) {
        /*String gradingMethod = "SLIGHT"; // <---- simply change this value to change the way grades are curved
        StudentGradeTranslator gradeTranslator = new StudentGradeTranslator();

        HashMap<String, String> studentGrades = new HashMap<String, String>();
        studentGrades.put("Jamaal", "93");
        studentGrades.put("Jennifer", "87");
        studentGrades.put("Jules", "59");

        // get all the student and their grades using each entry
        System.out.println("List of students and their grades:");
        for (Map.Entry<String, String> studentGrade: studentGrades.entrySet()) {
            System.out.println(studentGrade.getKey() + "'s grade is " +
                    gradeTranslator.getLetterGrade(Integer.parseInt(studentGrade.getValue())));
            System.out.println("Passing grade status: " + gradeTranslator.isPassingGrade(Integer.parseInt(studentGrade.getValue())));
        }*/

        StudentGradeTranslator gradeTranslator = new StudentGradeTranslator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 1 to get a letter grade");
        System.out.println("Select 2 to check if your grade is passing");
        System.out.println("Select 3 to check how many till next letter grade");
        String choice = scanner.next();

        if (choice.equals("1")) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            String letterGrade = gradeTranslator.getLetterGrade(grade); // objectofclass.method()
            System.out.println("Your letter grade is: " + letterGrade);
        } else if(choice.equals("2")) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (gradeTranslator.isPassingGrade(grade)) {
                System.out.println("Yay you're passing");
            } else {
                System.out.println("You're failing :(");
            }
        } else if(choice.equals("3")) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            int leftTillNext = gradeTranslator.howManyForNextLetter(grade);
            System.out.println("To the next letter grade: " + leftTillNext +" points");
        }
    }
}
}
