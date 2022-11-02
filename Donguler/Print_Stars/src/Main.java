public class Main {
    public static void main(String[] args) {

        int n = 4;

        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=0; i<=n; i++){
            System.out.print(" ");
            for(int j=n; j>n-i; j--){
                System.out.print(" ");
            }
            for (int k = n+2; k >= (2 * i); k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}