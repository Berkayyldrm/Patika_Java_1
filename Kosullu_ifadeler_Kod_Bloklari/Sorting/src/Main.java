import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2 ,n3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        n1 = scan.nextInt();
        System.out.print("Enter number : ");
        n2 = scan.nextInt();
        System.out.print("Enter number : ");
        n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n2>n3) System.out.println("a > b > c");
            else if (n3>n2) System.out.println("a > c > b");
        } else if (n2 > n1 && n2 > n3) {
            if (n1>n3) System.out.println("b > a > c");
            else if (n3>n1) System.out.println("b > c > a");
        } else if (n3 > n2 && n3 > n1){
            if (n1>n2) System.out.println("c > a > b");
            else if (n2>n1) System.out.println("c > b > a");
        }
        if (n1 == n2 && n1 == n3) System.out.println("a = b = c");
        if (n1 == n2 && n1 > n3) System.out.println("a = b > c");
        if (n1 == n3 && n1 > n2) System.out.println("a = c > b");
        if (n2 == n3 && n2 > n1) System.out.println("b = c > a");
        if (n1 == n2 && n1 < n3) System.out.println("c > a = b");
        if (n1 == n3 && n1 < n2) System.out.println("b > a = c");
        if (n2 == n3 && n2 < n1) System.out.println("a > b = c");

        
    }
}