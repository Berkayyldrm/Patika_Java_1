import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price;
        double new_price = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price:");
        price = scan.nextInt();
        if(price>0 && price<1000){
            new_price = price + price * 0.18;
        }else if(price>=1000){
            new_price = price + price * 0.08;
        }
        System.out.println(new_price);
    }
}