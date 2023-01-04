package JAVA_coding.src.SELF_work.Questions_Unit4;

public class q3 {
    public static class A{
        int count;
        public void m(){
            count++;
        }
        public void m(int n){
            count*=n;
        }

        public static void main(String[] args) {
            A obj = new A();
            obj.m(5);
            obj.m();
            obj.count += 10;
            obj.m(2);
            System.out.println(obj.count);
        }
    }
}
