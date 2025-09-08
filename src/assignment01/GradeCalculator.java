import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("CSE131 Grade for: " + name);
        System.out.print("Enter number of studios attended: ");
        int studiosAttended = in.nextInt();
        double weightedStudio = (studiosAttended / 8.0) * 15.0;
        System.out.println("Weighted studio grade (out of 15) " + weightedStudio);
        System.out.print("Enter your average quiz grade as a percentage: ");
        int averageQuizGrade = in.nextInt();
        double weightedQuiz = (averageQuizGrade / 100.0) * 25.0;
        System.out.println("Weighted quiz grade (out of 25): " + weightedQuiz);
        System.out.print("Enter your average exam grade as a percentage: ");
        int averageExamGrade = in.nextInt();
        double weightedExam = (averageExamGrade / 100.0) * 60.0;
        System.out.println("Weighted exam grade (out of 60): " + weightedExam);
        double totalGrade = weightedStudio + weightedQuiz + weightedExam;
        System.out.println("Total grade: " + totalGrade);
    }

}
