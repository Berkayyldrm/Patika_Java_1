import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<String> hSet = new HashSet<>();
        int[] arr = {2, 2, 3, 7, 2, 3, 2, 10, 12, 3, 8, 1, 8, 9, 4, 21, 1, 33, 9, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        //System.out.println(arr[i]);
                        list.add(arr[i]);
                        break;
                    }
                }
            }
        }
        for (Integer x : list)
            hSet.add(String.valueOf(x));

        for (String x : hSet)
            System.out.println(x);
    }
}