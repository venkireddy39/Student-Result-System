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

                if (mark > 100) {
                    System.out.println("Warning: Please enter valid marks (0-100).");
                } else if (mark < 35) {
                    System.out.println("Subject " + (i + 1) + ": FAIL");
                    overallPass = false;
                    total += mark;
                } else {
                    System.out.println("Subject " + (i + 1) + ": PASS");
                    total += mark;
                }
            } while (mark < 0 || mark > 100);
        }

        double average = (double) total / SUBJECTS;

        String result = overallPass ? "PASS" : "FAIL";

        System.out.println("\n=== Student Final Result ===");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}
