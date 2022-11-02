import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        while(true) {
            System.out.print("Enter Number : ");
            int number = scan.nextInt();
            if (number % 2 == 1) break;
            if (number % 4 == 0) total += number;
        }
        System.out.println("Total : " + total);
    }
}