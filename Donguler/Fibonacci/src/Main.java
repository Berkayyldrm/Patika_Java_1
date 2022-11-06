import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int temp_1 = 0;
        int temp_2 = 1;
        int temp_last ;
        for (int i = 1; i < number; i++) {
            temp_last = temp_1 + temp_2;
            System.out.println(temp_1 + " + " + temp_2 + " = "+ temp_last);
            temp_1 = temp_2;
            temp_2 = temp_last;
        }
    }
}