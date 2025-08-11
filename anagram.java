// Check if Two Strings are Anagrams or not in JavaScript?
//input : text1:gum , text2: mug
//output : the string is an anagram 


public class anagram {
    public static void main(String[] args) {
        String txt1 = "python";
        String txt2 = "typhon";
        int count = 0;
        if(txt1.length()==txt2.length()){

                for (int i = 0; i <txt1.length(); i++) {
                  for (int j = 0; j <txt1.length(); j++) {
                    if(txt1.charAt(i)==txt2.charAt(j)){
                          count++;
                    }
                  }
                }
                if(count == txt1.length()){

                    System.out.println("the string is anagram");
                }
                else{
                    System.out.println("the sttring is not an anagram!");

                }
            
          
        }
        else{
        System.out.println("the String is not an anagram");
        }
    }
}
