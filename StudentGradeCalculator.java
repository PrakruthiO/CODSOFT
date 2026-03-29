import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int maxTotal = n * 100;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + ": ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input! Enter marks between 0 and 100.");
                }
            }

            total += marks;
        }

        double average = total / (double) n;

        String grade;
        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "Fail";

        System.out.println("\n RESULT ");
        System.out.println("Total Maximum Marks: " + maxTotal);
        System.out.println("Total Marks Obtained: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}