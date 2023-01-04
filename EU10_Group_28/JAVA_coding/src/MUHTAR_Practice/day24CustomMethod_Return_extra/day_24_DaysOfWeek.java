package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

public class day_24_DaysOfWeek {
    public static void main(String[] args) {
        weekOfDays(2);
        weekOfDays(8);
    }

    public static void weekOfDays(int number) {
        if (number < 1 || number > 7) {
            System.out.println("Invalid Day");
            return; // exits weeks of day
        }
        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
            {
                if (number == 3) {
                    System.out.println("Wednesday");
                    {
                        if (number == 4) {
                            System.out.println("Tuesday");
                        }
                        if (number == 5) {
                            System.out.println("Friday");
                            {

                                if (number == 6) {
                                    System.out.println("Saturday");
                                } else {

                                    System.out.println("Sunday");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}