
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// You are given an array of integers. Write a function that groups all duplicate numbers together in subarrays, while keeping the order of first appearance.

// Example Input:
// [4, 3, 2, 4, 1, 3, 2, 2]

// Expected Output:
// [[4, 4], [3, 3], [2, 2, 2], ]

public class DuplicateSubarrays {
    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(4, 3, 2, 4, 1, 3, 2, 2,1));
        ArrayList <ArrayList<Integer>> mainarray = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList <Integer> temp = new ArrayList<>();
            temp.add(arr.get(i));
            for (int j = i+1; j < arr.size(); j++) {
                    if (arr.get(i)==arr.get(j)) {
                        temp.add(arr.get(j)); 
                    }
            }
            mainarray.add(temp);
            arr.removeAll(Collections.singleton(arr.get(i)));
        }
        System.out.println(arr);
        System.out.println(mainarray);
    }
}
