package day24CustomMethod_Return_extra;

public class day_24_repeatingCharacter_Remove {
    public static void main(String[] args) {



        String str = "aabcdssswsd";
        for (int i = 0; i < str.length(); i++) {
          int frequency = repaetingCharacters(str, str.charAt(i));
          if (frequency == 1){
              System.out.print(str.charAt(i));
          }
            System.out.print("");
        }

    }
                                            // "aaa"          "a"
    public static int repaetingCharacters( String str, char ch){
        int count=0;
        for (char each:str.toCharArray()){
            if (each == ch){
                count++;
            }
        }

        return count;

    }
}
