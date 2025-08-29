// Find the length of the longest subarray where the number of 0s and the number of 1s are equal.

// Input:
// [0, 1, 0, 1, 1, 0, 0]
// Output:
// 6
public class lengthSubarray {

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0};
        int count0 = 0 ;
        int count1 = 0;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count0++;
            }
            else{
                count1++;
            }
           

        }
        int newCOunt = 0 ;
        int finalCount = 0 ;
        if (count0>count1) {
        
            newCOunt = count0-count1;
            finalCount = (count0+count1)-newCOunt;
            
        }
        else{
           newCOunt = count1 - count0;
           finalCount = (count1 + count0)-newCOunt;
        }
        for (int i = 0; i <finalCount; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("lenght : " +arr.length);
        
        
    }
}