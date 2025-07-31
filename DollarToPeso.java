import java.util.Scanner;

public class DollarToPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in dollars: ");
        double dollars = scanner.nextDouble();

        double pesos = dollars * 50.60;
        System.out.println("Equivalent in pesos: " + pesos);
    }
}
