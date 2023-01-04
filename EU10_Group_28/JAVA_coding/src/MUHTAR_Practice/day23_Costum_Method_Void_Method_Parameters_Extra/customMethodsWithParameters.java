package JAVA_coding.src.MUHTAR_Practice.day23_Costum_Method_Void_Method_Parameters_Extra;

public class customMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEvenNumber(12);
        ageOfPerson(1971);
        printNumberBetween(12,23);

    }

    //creat a function that can check if the number is odd or even
    public static void oddOrEvenNumber(int number){
            if (number%2 == 0){
                System.out.println(number+" : is even");
            }else {
                System.out.println(number+": is odd");
            }
    }
    // creat a function that can display the age of the person, birth year and age calculation
    public static void ageOfPerson(int birthYear){
        int age= (int) (2022-birthYear);
        System.out.println("Your age is : "+ age);

    }
    public static void printNumberBetween(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.print(i+" ");
        }

    }
}
