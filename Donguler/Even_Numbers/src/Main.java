import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scan.nextInt();

        for (int i=0 ; i<number ; i++){
            if (i%2==0) System.out.println(i);
        }
        System.out.println("Full Division to 3 and 4");
        double total = 0;
        int count = 0;
        for (int i=0 ; i<number ; i++){
            if (i%3==0 && i%4==0){
                count++;
                total += i;
                System.out.println(i);
            }
        }
        double avg = total / count;
        System.out.println("Average value is : " + avg);

    }
}