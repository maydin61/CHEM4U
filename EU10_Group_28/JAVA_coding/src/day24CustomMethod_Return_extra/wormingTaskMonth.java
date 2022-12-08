package day24CustomMethod_Return_extra;

public class wormingTaskMonth {

    public static void main(String[] args) {
        month(12);
        month(10);
        month(13);
        nameOfWeek(4);
    }





    public static void month(int number){
        String name="";
        if (number>=1 && number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":(number==5)?"May":
                    (number==6)?"Jun":(number==7)?"July":(number==8)?"August":(number==9)?"Sept":(number==10)?"Oct":
                            (number==11)?"Nov":"Dec";
        }else{
            name="invalid";
        }
        System.out.println("name of month: "+name);
    }
    public static void nameOfWeek(int dayNumber) {
        String day = "";
        if (dayNumber >= 1 && dayNumber <= 7) {
            day = (dayNumber == 1) ? "Mon" : (dayNumber == 2) ? "Tu" : (dayNumber == 3) ? "Wen" : (dayNumber == 4) ? "Th" : (dayNumber == 5) ? "Fr" :
                    (dayNumber == 6) ? "Saturday" : "Sunday";
        }
        System.out.println("name of the week is : "+day);
    }
}
