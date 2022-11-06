import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while(right>0){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Username : ");
            userName = input.nextLine();
            System.out.print("Enter password : ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("123")){
                System.out.println("Welcome the Machine");
                do {
                    System.out.println("1- Deposit cash \n2- Withdraw cash \n3- Check balance \n4- Exit");
                    System.out.println("Select Transaction");
                    select = input.nextInt();
                    switch (select){
                        case (1):{
                            System.out.print("Enter amount of money : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case (2): {
                            System.out.print("Enter amount of money : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case (3):{
                            System.out.println("Your balance : " + balance);
                            break;
                        }
                        default:{
                            System.out.println("You're exit");
                            break;
                        }
                    }

                }while (select != 4);
            }else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right==0) System.out.println("You have been blocked.");
                else System.out.println("Remaining right : " + right);
            }
        }
    }
}