public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0.0;
        for (double number : numbers) {
            sum += (1 / number);
        }
        System.out.println(sum);
    }
}