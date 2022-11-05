import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int near = num - arr[0];
        if (near < 0) near = near * -1;
        int temp;
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            temp = num - arr[i];
            if(temp<0) temp = temp * -1;

            if (temp < near) {
                near = num - arr[i];
                if (near < 0) near = near * -1;
                if (arr[i] >= num) max = arr[i];
                else if (arr[i] <= num) min = arr[i];
            }
        }
        System.out.println("Smaller than number and nearest to number : " + min);
        System.out.println("Higher than number and nearest to number : " + max);
    }
}