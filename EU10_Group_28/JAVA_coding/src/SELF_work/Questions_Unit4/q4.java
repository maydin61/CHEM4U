package JAVA_coding.src.SELF_work.Questions_Unit4;

public class q4 {
    public class Box{
        double width;
        double length;
        public String print(){
            return "Width: "+ width+ "length: "+length;
        }
        public void setInfo(double width, double length){
            this.width=width;
            this.length=length;
        }

    }
    class UseBoxes {
        public void main(String[] args) {
            Box box = new Box();
            box.setInfo(5,11);
            System.out.println(box);
        }
    }
}
