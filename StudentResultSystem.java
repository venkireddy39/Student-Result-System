import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SUBJECTS = 6;
        int total = 0;
        boolean overallPass = true;
        
        System.out.println("Welcome to the Student Result Checker!");
        System.out.println("You need to enter marks for 6 subjects.");

        for (int i = 0; i < SUBJECTS; i++) {
            int mark;
            do {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                mark = sc.nextInt();

                // Check if the entered mark is within the valid range
                if (mark > 100) {
                    System.out.println("Warning: Please enter valid marks (0-100).");
                }
                // If marks are below 35, the student fails that subject
                else if (mark < 35) {
                    System.out.println("Subject " + (i + 1) + ": FAIL");
                    overallPass = false;  // If any subject is failed, the overall result is fail
                    total += mark;  // Add mark to total even if failed
                } 
                // If marks are valid and above or equal to 35, the student passes that subject
                else {
                    System.out.println("Subject " + (i + 1) + ": PASS");
                    total += mark;
                }
            } while (mark < 0 || mark > 100);  // Loop until the input is valid (between 0 and 100)
        }

        // Calculate the average
        double average = (double) total / SUBJECTS;

        // Final result based on overallPass flag
        String result = overallPass ? "PASS" : "FAIL";

        // Print the final result
        System.out.println("\n=== Student Final Result ===");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}
