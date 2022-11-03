import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number){
        int temp = number; int lastDigit; int reverseNumber = 0;
        while(temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp = temp / 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.println("Number : " + number);
        boolean checkPalindrome = isPalindrome(number);
        if (checkPalindrome) System.out.println(number + " is a palindrome number");
        else System.out.println(number + " is not a palindrome number");

    }
}