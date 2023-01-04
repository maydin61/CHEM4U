package JAVA_coding.src.MUHTAR_Practice.day26_CustomMethodPractice;

public class task4_addingStarInsteadOfCharacter {
    public static void main(String[] args) {

        String [] str={"one", "hi", "hold"};

        String s= convertLetterToStar(String.valueOf(str));
        System.out.print(s);



}
    public static String [] hidePass(String [] srt) {
        int index = 0;
        String [] resultsOfHiddenPass=new String [srt.length];
        for (String element : srt) {
            //convert to letter to star
            String result = convertLetterToStar(element);
            resultsOfHiddenPass[index++]=result;

        }
        return resultsOfHiddenPass;

    }
        private static String convertLetterToStar(String s){
            String temp="";
            for (int i = 0; i < s.length(); i++) {
                temp+="*";

            }
            return temp;
        }
}
/*
Task 4 : Hide Passwords

Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ ***, **, **** ]
 */