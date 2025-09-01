
import java.util.ArrayList;
import java.util.Arrays;

public class productOfAll {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int temp  = arr.get(i);
            arr.remove(i);
            int product = 1;
            for(int num :arr){
                product*=num;
            }
            newarr.add(product);
            arr.add(i,temp);
        }
        System.out.println(newarr);
    }
}