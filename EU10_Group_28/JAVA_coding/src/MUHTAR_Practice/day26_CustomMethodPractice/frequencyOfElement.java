package JAVA_coding.src.MUHTAR_Practice.day26_CustomMethodPractice;

public class frequencyOfElement {
    public static void main(String[] args) {

        int [] numbers={1,23,3,3,2,44,5,5,2,77,7};
        int n = repeatedElement(numbers, 2);
        System.out.println("repeated time for given element :"+ n);

        String  [] sentence ={"aydin", "hamza","aydin","ay", "ay"};
        String str1= repeatedElement(sentence, "aydin");
        System.out.println("repeated time for string based on given str: "+str1);

        double  [] doubles ={1.3,4.5,1.3,4.6};
        double doubleNmb= repeatedElement(doubles, 1.3 );
        System.out.println("repeated time for double based on given doubles: "+(int)doubleNmb);

        char  [] chSet ={'a','a','b','a'};
        int  chRepeated= repeatedElement(chSet, 'a');
        System.out.println("repeated time for charsSet based on given chars: "+(int)chRepeated);



    }
                                        // {1,23,3,3,33,44,5,5,77,77,7}
    public static int repeatedElement(int [] array, int element){
        int count=0;
        for (int each:array){
        if ( each == element){
            count++;
        }
        }
        return count;
    }
    public static String repeatedElement(String  [] array, String str){
        int count=0;
        for (String each:array){
            if ( each == str){
                count++;
            }
        }
        return String.valueOf(count);
    }
    public static double repeatedElement(double  [] array, double doubleDigit){
        int count=0;
        for (double each:array){
            if ( each == doubleDigit){
                count++;
            }
        }
        return count;
    }
    public static int repeatedElement(char  [] array, char ch){
        int count=0;
        for (char each:array){
            if ( each == ch){
                count++;
            }
        }
        return count;
    }

}
