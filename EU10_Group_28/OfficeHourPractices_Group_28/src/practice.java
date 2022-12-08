import java.io.FilterOutputStream;

public class practice {
    public static void main(String[] args) {
        String text="Code";

        int size=text.length();

        for (int i = 0; i <=size ; i++) {
            String strg= text.substring(0,size);
        }
            System.out.println(text.substring(0,size));
    }
}
