import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " : is leap year");
                }else System.out.println(year + " : is not leap year");
            }else System.out.println(year + " : is leap year");
        }else System.out.println(year + " : is not leap year");
    }
}