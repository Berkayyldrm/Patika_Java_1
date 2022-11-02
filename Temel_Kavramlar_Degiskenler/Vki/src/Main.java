import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter height(meter) : ");
        double height = scan.nextDouble();

        System.out.print("Please enter weight : ");
        int weight = scan.nextInt();

        double vki = weight / (height * height);
        System.out.print("VKI : " + vki);
    }
}