import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scan.nextInt();
        System.out.println("Power of two ");
        for (int i = 1 ; i <= n ; i *= 2) System.out.println(i);
        System.out.println("Power of two ");
        for (int i = 1 ; i <= n ; i *= 3) System.out.println(i);
    }
}