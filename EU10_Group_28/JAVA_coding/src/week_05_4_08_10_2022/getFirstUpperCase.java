package week_05_4_08_10_2022;

public class getFirstUpperCase {
    public static void main(String[] args) {
      //  Scanner scanner=new Scanner(System.in);
        String word="Hello";          // convert the required character to lower or upper case
                                            // System.out.println(string11.length());
        word=word.toUpperCase();

        System.out.println(""+word.charAt(0)+word.charAt(1)); // "" considered as string than do operation string
        System.out.println(+word.charAt(0)+""+word.charAt(1)); // "" considered as string than do operation char and letter
        System.out.println(word.charAt(0)+""+word.charAt(1)); // "" considered as string than do operation


        System.out.print(word.charAt(0));
        System.out.println(word.charAt(1));

        System.out.print(word.charAt(0)+word.charAt(1)); // adding of letter H(72) and E(69) in print out



    }
}
