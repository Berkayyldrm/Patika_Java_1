import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N Number count : ");
        int number = scan.nextInt();
        double total = 0;
        for (double i = 1 ; i <= number; i++){
            total += 1/i;
        }
        System.out.println(total);
    }
}