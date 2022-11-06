import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = scan.nextInt();

        System.out.print("Enter Number 2 : ");
        int number2 = scan.nextInt();

        int total = 1;

        for (int i = 0; i<number2; i++){
            total *= number1;
        }
        System.out.println(total);
    }
}