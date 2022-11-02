import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = scan.nextInt();

        System.out.print("Enter Number 2 : ");
        int number2 = scan.nextInt();

        int factorial_1 = 1;
        int factorial_2 = 1;
        int factorial_3 = 1;


        for (int i = 1; i <= number1; i++){
            factorial_1 = i * factorial_1;
        }
        for (int j = 1; j <= number2; j++){
            factorial_2 = j * factorial_2;
        }
        for (int z = 1; z <= number1-number2; z++){
            factorial_3 = z * factorial_3;
        }
        System.out.println("Combination of number1 with number2 : " + factorial_1/(factorial_2*factorial_3));
    }
}