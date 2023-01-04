package JAVA_coding.src.SELF_work.Questions_Unit3;

public class ques5 {
    public static void main(String[] args) {

        System.out.println(mt5("apple"));

    }
    public static boolean mt5(String str){
        boolean ch=true;
        if (str.isEmpty()){
            ch=false;
        }
        if ( ! str.contains("a")){
            ch=false;
        } else if (str.contains("z")) {
            ch=false;
        }
        ch = str.substring(0,1).equals("a")? ch:false;
        return ch;
    }
}
