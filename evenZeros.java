import java.util.ArrayList;

public class evenZeros {
    public static void main(String[] args) {
        String text = "100115100001200";
        int count  = 0;
        
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> newlist = new ArrayList<>();

        for (char ch : text.toCharArray()) {
            if (ch =='0') {
                count++;
                newlist.add(ch);
            }
            else{
                list.add(ch);
            }
        }

        if(count%2==0){
            // count = count/2;
            // for (int i = 0; i < count; i++) {
            //    list.add(i,'0');
            // }
            // for (int i = 0; i < count; i++) {
            //     list.add('0');
            // }
            count = count/2;
            newlist.addAll(count,list);
            
           StringBuilder sb = new StringBuilder();
        for (char ch : newlist) {
            sb.append(ch);
        }

        String result = sb.toString();
        System.out.println(result);
        }
        else{
            System.out.println(-1);
        }

       

       
    }
}
