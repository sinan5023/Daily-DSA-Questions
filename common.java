import java.util.Arrays;
import java.util.stream.IntStream;

public class common {

    public static void main(String[] args) {
        
        int arr1[]={1,2,2,3,4,3,4};
        int arr2[]={4,3,2,3,1};
        int arr3[]={1,2,3,3,4};
        int newarr[]=new int[arr1.length];
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    x1=arr1[i];
                }
            }
            for (int j = 0; j < arr3.length; j++) {
                if (arr1[i]==arr3[j]) {
                    x2=arr1[i];
                }
            }
            if (x1==x2) {
                newarr[i]=x1;

            }
        }
                 int[] uniqueArr = IntStream.of(newarr).distinct().toArray();
                  System.out.println(Arrays.toString(uniqueArr));
        

       

    }
}