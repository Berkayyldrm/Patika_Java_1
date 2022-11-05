import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word){
        int count = 0;
        for (int i = 0; i < (word.length() / 2) ; i++) {
            Character x = word.charAt(i);
            Character y = word.charAt(word.length() - i - 1);
            if (x.equals(y)) {
                count ++;
            }
        }
        return count == word.length() / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String word = input.nextLine();
        System.out.println("String : " + word);
        boolean checkPalindrome = isPalindrome(word);
        if (checkPalindrome) System.out.println(word + " is a palindrome");
        else System.out.println(word + " is not a palindrome");

    }
}