public class voidAndReturnMethod {
    public static void main(String[] args) {
        add(4,7);
        add(5,8,90);


    }
    public static int add(int i, int j){
        int result = i+j;
        System.out.println(result);
        return result;
    }
    public static int add(int i, int j, int k){
        System.out.println(i+j+k);
        return i+j+k;
    }
}
