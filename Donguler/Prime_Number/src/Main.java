public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) break;
                if (i / j == 1){
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}