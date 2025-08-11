public class duplicate {
    public static void main(String[] args) {
    
        int arr[]= {1,2,3,3,3,4,4};
        int newarr[]= new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    newarr[i]=arr[j];
                    arr[j]=0;
                }
                else{

                }
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}
