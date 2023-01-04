package JAVA_coding.src.PracticeWith_ADAM.week07_22_10_2022;

public class countingNamesInSentence {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";
        String temp = "";
        String result = "";

        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            if (ch != ' ') {
                temp+=ch;
                continue;
            }
            String search = temp;
            int counter = 0;
            String dummy = names;
            while (dummy.contains(search)) {
                counter++;
                dummy = names.replaceFirst(search, "");
            }
            if (!result.contains(search))
                result+=search+"-" +counter+" ";
            temp = "";                  //return to original text
        }

        System.out.println("result = " + result);
    }
}
