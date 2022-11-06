import java.util.Scanner;

public class Main {
    static void pattern(int n){
        System.out.print(n+" ");
        if(n>0){
            pattern(n-5);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        pattern(number);
    }
}