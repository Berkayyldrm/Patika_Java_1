import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter heat : ");
        int heat = scan.nextInt();

        if (heat<5) {
            System.out.print("Go to snowboarding");
        }
        if (heat>=5 && heat<15) {
            System.out.print("Go to cinema");
        }
        if (heat>=15 && heat<25) {
            System.out.print("Go to picnic");
        }
        if (heat>=25) {
            System.out.print("Go to swimming");
        }
    }
}