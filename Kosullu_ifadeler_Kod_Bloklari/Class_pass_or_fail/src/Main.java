import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physic, turkish, chem, music;
        Scanner scan = new Scanner(System.in);
        double check_wrong_value = 0.0;

        System.out.println("Enter math note: ");
        math = scan.nextInt();
        if(math<0 || math>100){
            math = 0;
            check_wrong_value += 1;
        }

        System.out.println("Enter physic note: ");
        physic = scan.nextInt();

        if(physic<0 || physic>100){
            physic = 0;
            check_wrong_value += 1;
        }

        System.out.println("Enter turkish note: ");
        turkish = scan.nextInt();

        if(turkish<0 || turkish>100){
            turkish = 0;
            check_wrong_value += 1;
        }

        System.out.println("Enter chem note: ");
        chem = scan.nextInt();

        if(chem<0 || chem>100){
            chem = 0;
            check_wrong_value += 1;
        }

        System.out.println("Enter music note: ");
        music = scan.nextInt();

        if(music<0 || music>100){
            music = 0;
            check_wrong_value += 1;
        }

        double total = math + physic + chem + turkish + music;
        double avg = total / (5.0 - check_wrong_value);
        System.out.println(avg);
        if(avg>=55){
            System.out.println("You've passed");
        }else{
            System.out.println("You've failed");
        }
    }
}