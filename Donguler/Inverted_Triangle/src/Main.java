import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row count : ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>n-i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}