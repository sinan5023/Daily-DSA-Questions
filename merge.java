
// Given a list of intervals, merge all overlapping intervals.
// Example:
// intervals = [[1,3],[2,6],[8,10],[15,18]] → Output: [[1,6],[8,10],[15,18]]
//this is a partial answer because the array need to be sorted first and then
//compare all the pairs of intervals 

public class merge {

    public static void main(String[] args) {

        int arr[][] = {{8,15},{15,18}};
        boolean foundone= false;
        boolean foundtwo= false;


        for (int i = arr[0][0]; i <=arr[0][1]; i++) {
           if (arr[1][0]==i) {
               foundone=true;
           }
           

        }
        if(foundone){
            System.out.println(arr[0][0]+" "+arr[1][1]);
        }
        else{
            System.out.println("no intervals found");
        }
    }
}


