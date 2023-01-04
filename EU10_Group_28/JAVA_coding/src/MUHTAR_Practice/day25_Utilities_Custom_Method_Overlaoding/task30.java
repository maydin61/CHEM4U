package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

public class task30 {
    public static void main(String[] args) {
        String [ ] t = {"house", "shed", " slide", " zebra", "park","garden"};
        for(String  s:t){
            switch ((s.charAt(1))){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                    break;
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);

                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                    break;
                case 'g':
                    System.out.print(7);
            }
        }
    }
}
