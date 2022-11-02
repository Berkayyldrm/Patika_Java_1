import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physic, chem, turkish, history, music;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter math note: ");
        math = scan.nextInt();

        System.out.println("Enter physic note: ");
        physic = scan.nextInt();

        System.out.println("Enter chem note: ");
        chem = scan.nextInt();

        System.out.println("Enter turkish note: ");
        turkish = scan.nextInt();

        System.out.println("Enter history note: ");
        history = scan.nextInt();

        System.out.println("Enter music note: ");
        music = scan.nextInt();

        int total = math + physic + chem + turkish + history + music;
        double mean = total / 6.0;

        boolean check_pass;
        check_pass = (mean>=60);
        System.out.println(check_pass? "Pass": "Fail");
    }
}