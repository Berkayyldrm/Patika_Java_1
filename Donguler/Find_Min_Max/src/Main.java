import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count of numbers : ");
        int count = input.nextInt();
        int max_number = 0, min_number = 0;
        for (int i = 0; i < count; i++) {
            System.out.print(i+1 + ". Enter number : ");
            int number = input.nextInt();

            if (i==0) {
                min_number = number;
                max_number = number;
            }

            if (number > max_number){
                max_number = number;
            }
            if (number < min_number){
                min_number = number;
            }
            System.out.println("Max Value : " + max_number);
            System.out.println("Min Value : " + min_number);

        }
    }
}