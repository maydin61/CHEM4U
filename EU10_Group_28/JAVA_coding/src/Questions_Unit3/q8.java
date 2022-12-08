package Questions_Unit3;

public class q8 {
    public static void main(String[] args) {

        m2("the sun set quickuj fdg dgdfg gdgf");

    }
    public static void m2(String s){
        String a= s.substring(10);
        if (a.length()>s.length()){
            System.out.println(a);
        }else {
            System.out.println(s);
        }
    }
}
