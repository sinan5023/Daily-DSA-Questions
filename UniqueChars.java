public class UniqueChars {
    public static void main(String[] args) {
        String str = "hello";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}