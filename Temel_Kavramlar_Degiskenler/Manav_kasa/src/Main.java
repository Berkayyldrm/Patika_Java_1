import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Pear kg : ");
        double pear = scan.nextInt() * 2.14;

        System.out.print("Apple kg: ");
        double apple = scan.nextInt() * 3.67;

        System.out.print("Tomato kg: ");
        double tomato = scan.nextInt() * 1.11;

        System.out.print("Banana kg: ");
        double banana = scan.nextInt() * 0.95;

        System.out.print("Eggplant kg: ");
        double eggplant = scan.nextInt() * 5.00;

        double total = pear + apple + tomato + banana + eggplant ;
        System.out.println("Total : " + total);
    }
}