// 

public class day11 {

    public static void main(String[] args) {
          int sum =0;  
          int number =12;
        for (int k = 0; k < 4; k++) {
          sum = 0;

        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }
        for (int i = 0; i < digits.length; i++) {
            sum +=digits[i];
        }
        number = sum;
        System.out.println(sum);
        if(sum<10){
            break;
        }
    }
    }

    


       

    }
