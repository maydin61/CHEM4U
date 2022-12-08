public class intro {
    public static void main(String[] args) {
        int x=12;
        int y=23;
        sum(x,y);

        double z=2.5;
        sum(x,z);

        float k=17;
        sum(k,z);




    }
    public static int sum(int nmb1, int nmb2){
        int result = nmb1+nmb2;
        System.out.println(result);
        return result;
    }
    public static double sum(int nmb1, double nmb2){
        double result = nmb1+nmb2;
        System.out.println(result);
        return (double) result;
    }
    public static float sum(float nmb1, double nmb2){
        double result = nmb1+nmb2;
        System.out.println(result);
        return (float) result;
    }
}
