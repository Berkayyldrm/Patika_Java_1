import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = input.nextInt();
        int i = 0;
        while(i <= n1){
            i++;
            if(n1%i == 0 && n2%i == 0){
                System.out.println("EBOB : " + i);
            }
        }
        int j = 0;
        while(j <= n1*n2){
            j++;
            if(j%n1 == 0 && j%n2 == 0){
                System.out.println("EKOK : " + j);
                break;
            }
        }

    }
}