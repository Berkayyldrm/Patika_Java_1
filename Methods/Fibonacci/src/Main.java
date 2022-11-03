import java.util.Scanner;

public class Main {

    static int fibonacci(int a){
        if (a == 1 || a == 2){
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int res = fibonacci(number);
        System.out.println(res);
    }
}