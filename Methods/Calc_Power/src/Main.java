import java.util.Scanner;

public class Main {
    static int exponential(int n1, int n2) {

        if (n2 == 0 | n1 == 1) {
            return 1;
        }
        return exponential(n1,n2-1) * n1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base value : ");
        int num1 = input.nextInt();

        System.out.print("Enter a power value : ");
        int num2 = input.nextInt();

        System.out.println("Result : " + exponential(num1, num2));
    }
}