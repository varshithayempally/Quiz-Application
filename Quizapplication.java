import java.util.Scanner;
public class Quizapplication {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the capital of France?");
        System.out.println("1. Berlin");
        System.out.println("2. Madrid");
        System.out.println("3. Paris");
        System.out.println("4. Rome");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        if (choice == 3) {
            System.out.println("Correct! Paris is the capital of France.");
        } else {
            System.out.println("Wrong answer! The correct answer is Paris.");
        }

        scanner.close();
    }
}

    

