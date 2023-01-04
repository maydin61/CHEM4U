package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

public class day_24_valueInArrayOrNot {
    public static void main(String[] args) {

        presentOfValue(10);
        System.out.println("========");
        presentOfValue(1);


    }
    public static void presentOfValue(int number) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int element : arr) {
            if (element == number) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }
            break;
        }
        return ;
    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false
					Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */