package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

public class newTrialsInSecondWeek {
    public static void main(String[] args) {
        short s = (13 - ((5 / 5) * 2)) + (-12);
        System.out.println(s);

    // ==========
        boolean x = ('a' != 'z') && false;
        boolean y;
        if (x || 0 == (21 - 10 + 11)) y = true;
        else y = false;
        System.out.println(y);
        System.out.println(x);
     // ============
     long l = 19;
     short shrt = (short) l;
        System.out.println(shrt+10);
        // ========
        int aa = 102;
        int bb = --aa ;
        int  cc = -+aa ;
        // --aa =>a soldaki sayidan eksilt,
        // ++aa => sol daki sayiyi artir,
        // aa-- => a-sag dakisayi kadar ekdilt
        System.out.println(bb);
        System.out.println(cc);

        //==========
        int num = 19;
        System.out.println(num++ + ",");
        System.out.println(num = 0);
        System.out.println(","+ num-- );



    }
}
