import java.util.Scanner;

public class Noten {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your grade? (1-5)");
        int grade = scan.nextInt();

        switch (grade) {
            case 1 -> System.out.println("Sehr gut");

            case 2 -> System.out.println("Gut");

            case 3 -> System.out.println("Befriedigend");

            case 4 -> System.out.println("Genügend");

            case 5 -> System.out.println("Nicht genügend");

            default -> System.out.println("Ist keine Note.");
        }

    }
}

