import java.time.Year;
import java.util.Scanner;

public class ConditionalStructure {
    public static void main(String[] args) {

        // Simple structure
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        float n1 = scanner.nextFloat();
        System.out.print("Type the second number: ");
        float n2 = scanner.nextFloat();

        float average = (n1 + n2) / 2;
        if (average >= 9) {
            System.out.println("Congratulations");
        }

        System.out.println();

        // Compound structure
        System.out.print("Write your born year: ");
        int bornYear = scanner.nextInt();

        int age = Year.now().getValue() - bornYear;

        if (age >= 18) {  // conditional structure
            System.out.printf("You are in the legal age, your age is %d", age);
        }
        else {
            System.out.printf("You are underage, your age is %d", age);
        }
    }
}
