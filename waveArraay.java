// Rearrange a given array into a wave-like form such that:

// a1≥a2≤a3≥a4≤a5…

// Example 1:
// Input: [3, 6, 5, 10, 7, 20]  
// Output: [6, 3, 10, 5, 20, 7]
import java.util.Arrays;

public class waveArraay {

    public static void main(String[] args) {
        int arr[] = {3,6,5,10,7,20};
        int temp =0;
        for (int i = 0; i < arr.length; i+=2) {
           if (arr[i]>arr[i+1]) {   
           }
           else{
             temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}