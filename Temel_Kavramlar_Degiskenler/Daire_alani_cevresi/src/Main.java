import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter circle radius : ");

        int radius = scan.nextInt();

        double pi = 3.14;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        System.out.println(area);
        System.out.println(circumference);

        System.out.print("Enter center angle of circle : ");
        int theta = scan.nextInt();
        double piece_of_circle = ((pi * radius * radius * theta)/360);
        System.out.println("Area of piece : " + piece_of_circle);


    }
}