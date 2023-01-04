package JAVA_coding.src.SELF_work.TaskGeneral_from_85;

public class printLetterCombination_91 {
    public static void main(String[] args) {
        //char myChar= 'z';
        //System.out.println(myChar);
        for (char i = 'z'; i >='v'; i--) {
            for (char j = 'z'; j >='v'; j--)
                System.out.println(((char)i+""+(char)j));
        }

    }
}
