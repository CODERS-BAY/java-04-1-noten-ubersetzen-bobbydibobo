import java.util.Scanner;

public class Noten {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your grade? (1-5)");
        int grade = scan.nextInt();

        switch (grade){
            case 1 :
                System.out.println("Sehr gut");
                break;
            case 2 :
                System.out.println("Gut");
                break;
            case 3 :
                System.out.println("Befriedigend");
                break;
            case 4 :
                System.out.println("Genügend");
                break;
            case 5 :
                System.out.println("Nicht genügend");
                break;
            default:
                System.out.println("Ist keine Note.");
                break;

        }

    }
}

