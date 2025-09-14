package intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double totalCredits = 0;
        double weightedGradePoints = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter credits: ");
            double credits = sc.nextDouble();

            System.out.print("Enter grade point (e.g., 9 for A, 8 for B+): ");
            double gradePoint = sc.nextDouble();

            totalCredits += credits;
            weightedGradePoints += gradePoint * credits;
        }

        if (totalCredits == 0) {
            System.out.println("\nError: Total credits cannot be zero!");
        } else {
            double cgpa = weightedGradePoints / totalCredits;
            System.out.printf("\nYour CGPA is: %.2f%n", cgpa);
        }

        sc.close();
    }
}
