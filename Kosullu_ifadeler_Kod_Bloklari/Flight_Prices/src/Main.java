import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select KM : ");
        int km = scan.nextInt();
        System.out.print("Select Age : ");
        int age = scan.nextInt();
        System.out.print("Select \n1:One way \n2:Round trip : ");
        int type = scan.nextInt();

        double price_per_km = 0.1;
        double price = price_per_km * km;
        if (km < 0 || age<0 || age>150 || (type != 1 && type != 2)){
            System.out.println("Wrong values");
        } else {
            if (age < 12) {
                price = price - price * 0.5;
            } else if (age < 24) {
                price = price - price * 0.1;
            } else if (age > 65) {
                price = price - price * 0.3;
            }
            if (type == 2) {
                price = price - price * 0.2;
                price = price * 2;
            }
            System.out.println("Total Price : " + price + " TL");
        }
    }
}