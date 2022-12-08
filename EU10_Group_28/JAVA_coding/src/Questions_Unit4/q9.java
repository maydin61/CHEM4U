package Questions_Unit4;

public class q9 {
    public static class B{
        static int count;
        public B(){
            count++;
        }
        public B(int i){
            count +=i;
        }

        public B(String word) {  // constructor missing

        }

        public void B(String s){
            count += s.length();
        }
    }
    class Test{
        public  void main(String[] args) {
            new B();
            B a =new B();
            B a2 =new B("word");
            B a3 =new B(5);
            System.out.println(B.count);
        }
    }
}
