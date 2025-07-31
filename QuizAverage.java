import java.util.Scanner;

public class QuizAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Quiz 1 score: ");
        double quiz1 = scanner.nextDouble();

        System.out.print("Enter Quiz 2 score: ");
        double quiz2 = scanner.nextDouble();

        System.out.print("Enter Quiz 3 score: ");
        double quiz3 = scanner.nextDouble();

        double average = (quiz1 + quiz2 + quiz3) / 3;
        System.out.println("Average: " + average);
    }
}
