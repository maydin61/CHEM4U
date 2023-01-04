package JAVA_coding.src.MUHTAR_Practice.day_19_Recap_LoopsAndString;

public class findFrequency {
    public static void main(String[] args) {
        String str = "aabcccddd";
        int length = str.length();
        String result = "";

        char ch = 0;
        for (int j = 0; j < str.length(); j++) {


            ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;

            }System.out.print(ch+" "+count);
            }System.out.println(ch+" "+result);

        }
    }

