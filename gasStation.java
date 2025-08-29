import java.util.Arrays;

public class gasStation {

    public static void main(String[] args) {
        //arr-index==gasStation
        //arr[i]==capacity at gasStation
        //costarr = cost to travel to next one 

        int gas[]={2,3,4};
        int cost[]={3,4,3};
         int gassum = Arrays.stream(gas).sum();
         int coststum = Arrays.stream(gas).sum();
        
         if(gassum==coststum){

            for (int i = 0; i <gas.length; i++) {

                if (cost[i]>gas[i]) {
                    
                }
                else{
                    System.out.println(i);
                    break;
                    

                }
            }
         }
         else{

            System.out.println("-1");
         }
         

    }
}