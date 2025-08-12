// Given an array of integers and a target number, return all unique pairs [a, b] where:
// a + b = target

// Pairs must be unique (no duplicates).
// Output should be an array of pairs.

// Example:
// Input: nums = [2, 7, 11, 15, -2, 9, 1], target = 9  
// Output: [[2, 7], [-2, 11]]


public class target {

    public static void main(String[] args) {
        int arr[]= {1,2,2,3,5,-1,5,6,4};
        int target = 4;
        int x1 =0;
        int x2 = 0;

        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j <i; j++) {
            if (arr[i]+arr[j]==target) {
                x1 = arr[i]        ;
                x2 = arr[j];
                System.out.print(x1+""+x2 + " ");
            }

           }
           
            
        }
    }
}