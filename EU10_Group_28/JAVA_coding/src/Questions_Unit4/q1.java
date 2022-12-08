package Questions_Unit4;

public class q1 {
    public class Test{
        String name;
        int numOfTests;
        {
            this.name = name;
            this.numOfTests= numOfTests;
        }
               // static
        public void main(String[] args) {    // static is problem here
            Test t = new Test();
            t.setInfo("smoke test", 15);

        }

        private void setInfo(String smoke_test, int i) {

        }
    }
}
