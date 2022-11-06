import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimension of Array : ");
        int dim = input.nextInt();
        int[] arr = new int[dim];

        for (int i = 0; i < dim; i++) {
            System.out.print(i+1 + ". Element of Array : ");
            int num = input.nextInt();
            Arrays.fill(arr, i, i+1, num);
        }
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}