import java.util.ArrayList;
import java.util.Collections;

public class longestPalindromicsubstring {

    public static void main(String[] args) {
        String x = "";
        boolean found = false;
        ArrayList<Character> list1 = new ArrayList<>();
        for (int i = 0; i <x.length(); i++) {
            list1.add(x.charAt(i));
        }
        ArrayList<Character> list2 = new ArrayList<>(list1);
        Collections.reverse(list2);
    
            if(list2.equals(list1)){
                System.out.println("Longest palindrome substring : "+list1);
            
        }
        else{
            for (int i = 0; i <x.length(); i++) {
                 list1.remove(list1.size()-1);
            if (list1.equals(list1.reversed())) {
                found=true;
            }
            if (found) {
                System.out.println(list1);
                break;
            }
            
            } 
            

    }

}
}