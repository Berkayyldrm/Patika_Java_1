import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scan.nextInt();

        int count = 0;
        int number_temp = number;
        while(number_temp!=0) {
            number_temp /= 10;
            count++;
        }

        int total = 0;
        for (int i = 0; i<count; i++){
            total += number%10;
            number /= 10;
        }
        System.out.println("Total: " + total);
    }
}