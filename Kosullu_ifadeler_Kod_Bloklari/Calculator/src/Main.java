import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner scan = new Scanner(System.in);
        System.out.print("First Number : ");
        n1 = scan.nextInt();

        System.out.print("Second Number : ");
        n2 = scan.nextInt();

        System.out.println("1-Addition \n2-Extraction \n3-Multiply \n4-Division");
        System.out.print("Seçiniz : ");
        select = scan.nextInt();

        switch (select){
            case(1):{
                System.out.println(n1+n2);
                break;
            }
            case(2):{
                System.out.println(n1-n2);
                break;
            }
            case(3):{
                System.out.println(n1*n2);
                break;
            }
            case(4):{
                if(n2 !=0) {
                    System.out.println(n1 / n2);
                }else {
                    System.out.println("Not division to zero");
                }
                break;
            }
            default:{
                System.out.println("Wrong selection");
            }
        }


    }
}