import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        double length;
        double area;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first triangle side");
        a = scan.nextInt();

        System.out.println("Enter the second triangle side");
        b = scan.nextInt();

        c = Math.sqrt(a*a + b*b);
        length = a + b + c;
        area = a * b / 2.0;

        System.out.println(c);
        System.out.println(length);
        System.out.println(area);
    }
}