package JAVA_coding.src.SELF_work.Questions_Unit4;

import java.util.ArrayList;

public class q11 {
    public static class Bed{
        String size;
        ArrayList <Pillow> pillows = new ArrayList<>();

        public Bed (String size, int numOfPillows){
            this.size = size;
            for (int i = 0; i < numOfPillows; i++) {
                this.pillows.add(new Pillow ());
            }
        }
    }
    static class Pillow {
        String material;

        public static void main(String[] args) {
            Bed bed = new Bed("King",4);
            System.out.println(bed.pillows.size());
        }
    }
}
