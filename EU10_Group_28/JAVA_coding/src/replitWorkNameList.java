import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class replitWorkNameList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"hello, why, by, apple, note"};

       int temp= Integer.parseInt(arr[0]);
        for (int i=0;i<5;i++){
           // arr[i] = input.nextLine();
           arr[i]=arr[i+1];
          arr[arr.length-1]= String.valueOf(temp);

        } System.out.println(Arrays.toString(arr));
    }
}





