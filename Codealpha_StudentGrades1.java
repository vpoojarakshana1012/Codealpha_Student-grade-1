import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student grades
        ArrayList<Integer> grades = new ArrayList<>();

        // Ask the teacher how many students there are
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Get the grades for each student
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);  // Add the grade to the ArrayList
        }

        // Compute the average, highest, and lowest scores
        int highest = grades.get(0);
        int lowest = grades.get(0);
        int sum = 0;

        for (int grade : grades) {
            sum += grade;  // Sum all grades
            if (grade > highest) {
                highest = grade;  // Update highest grade
            }
            if (grade < lowest) {
                lowest = grade;  // Update lowest grade
            }
        }

        double average = (double) sum / numberOfStudents;  // Calculate average

        // Display the results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}