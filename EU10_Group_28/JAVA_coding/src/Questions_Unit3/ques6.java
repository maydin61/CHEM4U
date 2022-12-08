package Questions_Unit3;

public class ques6 {
    public static void main(String[] args) {

        System.out.println(mt6("mark"));


    }
    public static int [] mt6 (String str ){

    int [] arr = new int[str.length()];
    int n=10;
        for (int i = 0; i < arr.length; i++) {
            if (n == 20 || n ==50 || n ==70){
                continue;
            }
            arr[i]= n;
            n*=10;
        }
        return arr;
    }
}
