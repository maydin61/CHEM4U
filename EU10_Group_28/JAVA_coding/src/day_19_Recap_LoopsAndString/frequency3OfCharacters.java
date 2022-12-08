package day_19_Recap_LoopsAndString;

public class frequency3OfCharacters {
    public static void main(String[] args) {
        String str = "aabsa";
        String result = "";      // a9b1c2 .....


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(0); // a character is selected
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(j);  // each charters
                if (ch == eachCharacter) {
                    count++;
                }
                //  "" used to conversion of char to string
                if (result.contains(""+ ch)) continue;
            }
           result+=ch;
           result+=count;

        }
        System.out.println(" " + result);
    }
}