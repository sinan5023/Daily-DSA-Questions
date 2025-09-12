
import java.util.ArrayList;

public class movieTime {

    public static void main(String[] args) {
        int arr[] = {90, 85, 75, 60, 120, 150, 125};
        int time = 250;
        ArrayList<Integer> newarr = new ArrayList<>();
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                if (i == j) {
                } else {
                    sum = arr[i] + arr[j];
                    if (sum <= 250 && sum > temp) {
                        temp = sum;
                        x = i;
                        y = j;

                    }
                }
            }

        }
        newarr.add(arr[x]);
        newarr.add(arr[y]);
        System.out.print(arr[x] + arr[y]);
        System.out.println(newarr);

    }
}
