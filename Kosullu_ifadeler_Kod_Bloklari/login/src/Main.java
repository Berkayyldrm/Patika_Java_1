import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter username : ");
        username = scan.nextLine();

        System.out.print("Enter password : ");
        password = scan.nextLine();

        if(username.equals("Patika")&& password.equals("java123")){
            System.out.println("You're in");
        }else if(!username.equals("Patika")){
            System.out.println("Wrong username");
        }else{
            System.out.println("Wrong password");
            System.out.print("Do you wanna reset your password(y/n) : ");
            String check = scan.nextLine();
            if (check.equals("y")){
                System.out.print("Enter new password : ");
                String new_password = scan.nextLine();
                if(new_password.equals("java123")){
                    System.out.println("New password is same with old password.");
                }else{
                    System.out.println("New password created.");
                }
            }
        }
    }
}