import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select km : ");
        int km = scan.nextInt();
        int opening_price = 10;
        double price_for_km = 2.2;
        double price;
        if(opening_price + (price_for_km * km) < 20){
            price = 20;
        }else{
            price = opening_price + (price_for_km * km);
        }
        System.out.println("Total price : " + price);

    }
}