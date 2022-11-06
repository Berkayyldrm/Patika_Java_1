import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> list = new ArrayList<>();
    public static boolean isFind(int i) {
        if (list.contains(i)) {
            return true;
        } else {
            list.add(i);
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Frequencies");
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (isFind(arr[i])) continue;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr [j]) {
                    count ++;
                }
            }
            System.out.println(arr[i] + " Frequency : " + count);
            count = 1;
        }
    }
}