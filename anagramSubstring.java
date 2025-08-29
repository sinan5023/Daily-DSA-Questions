import java.util.ArrayList;
import java.util.Arrays;

public class anagramSubstring {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("eat","ate","tea","tan","nat","bat"));
        int count =0;
         ArrayList<ArrayList<String>> finalarr = new ArrayList<>();
                for (int i = 0; i < arr.size(); i++) {
                    for (int j =0; j < arr.size(); j++) {
                        if (i==j) {
                            
                        }
                        else{
                             ArrayList<String> temp = new ArrayList<>();
                        temp.add(arr.get(0));
                        String str1 = temp.get(0);
                        String str2 =arr.get(j);
                        // Step 1: If lengths differ, not an anagram
        
                        if (str1.length() != str2.length()) {
        
                            System.out.println("Not an Anagram");
        
                            return;
        
                        }
                        // Step 2: Convert to lowercase and char arrays
        
                        char[] arr1 = str1.toLowerCase().toCharArray();
        
                        char[] arr2 = str2.toLowerCase().toCharArray();

        
                        // Step 3: Sort both arrays
        
                        Arrays.sort(arr1);
        
                        Arrays.sort(arr2);

        
                        // Step 4: Compare
        
                        if (Arrays.equals(arr1, arr2)) {
                            finalarr.add(temp);
                            
                        } else {
                        }
                        }
                    }
                    arr.remove(0);
           
        }
        System.out.println(finalarr);
    }
    
}