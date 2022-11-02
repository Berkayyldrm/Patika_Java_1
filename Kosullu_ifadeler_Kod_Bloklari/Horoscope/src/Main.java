import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day : ");
        day = scan.nextInt();
        System.out.print("Enter month(numerical) : ");
        month = scan.nextInt();

        if (month == 1){
            if (day >= 22){
                System.out.println("aquarius");
            }else System.out.println("capricorn");
        }else if (month == 2){
            if (day >= 20){
                System.out.println("pisces");
            }else System.out.println("aquarius");
        }else if (month == 3){
            if (day >= 21){
                System.out.println("aries");
            }else System.out.println("pisces");
        }else if (month == 4){
            if (day >= 21){
                System.out.println("taurus");
            }else System.out.println("aries");
        }else if (month == 5){
            if (day >= 22){
                System.out.println("gemini");
            }else System.out.println("taurus");
        }else if (month == 6){
            if (day >= 23){
                System.out.println("cancer");
            }else System.out.println("gemini");
        }else if (month == 7){
            if (day >= 23){
                System.out.println("leo");
            }else System.out.println("cancer");
        }else if (month == 8){
            if (day >= 23){
                System.out.println("virgo");
            }else System.out.println("leo");
        }else if (month == 9){
            if (day >= 23){
                System.out.println("libra");
            }else System.out.println("virgo");
        }else if (month == 10){
            if (day >= 23){
                System.out.println("scorpio");
            }else System.out.println("libra");
        }else if (month == 11){
            if (day >= 22){
                System.out.println("sagittarius");
            }else System.out.println("scorpio");
        }else if (month == 12){
            if (day >= 22){
                System.out.println("capricorn");
            }else System.out.println("sagittarius");
        }
    }
}