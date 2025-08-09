// create a palindrome for a given n number, extends 5 positions both side 
// Input: n = 3
// Output: -1 0 1 2 3 2 1 0 -1

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class palindrome {
    public static void main(String[] args) {

       
        int count = 5;
        Integer arr[]=new Integer [5];

        for (int i =0; i <5; i++) {
            arr[i]=count--;
        }

        List<Integer> numberList = Arrays.asList(arr);
        Collections.reverse(numberList);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       Collections.reverse(numberList);
       for (int i = 1; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }

    }
}
