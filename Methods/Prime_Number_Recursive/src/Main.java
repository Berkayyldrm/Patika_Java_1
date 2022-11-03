import java.util.Scanner;

public class Main {

    static void prime(int a, int i){
        if (a == i){
            System.out.println("Prime Number");
            return;
        } else if (a%i == 0) {
            System.out.println("Not Prime Number");
            return;
        }
        prime(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        prime(number, 2);

    }
}