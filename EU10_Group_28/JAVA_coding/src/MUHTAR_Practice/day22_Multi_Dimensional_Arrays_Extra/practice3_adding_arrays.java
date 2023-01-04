package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class practice3_adding_arrays {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil","Aykhan","Irene","Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza","Allison", "Fei zhou","Ahmet", "Elena","Mikael","Muhtar"};
        String[] batch25Group3 = {"Fady","Break", "Clock","Cihad","Muhtar"};

        String [] batch25Groups = new String[batch25Group1.length+batch25Group2.length+batch25Group3.length];


        for (int i = 0; i < batch25Group1.length; i++) {
            batch25Groups[i]=batch25Group1[i];
        }
        for (int j = 0; j < batch25Group2.length; j++) {
            batch25Groups[batch25Group1.length+j]=batch25Group2[j];
        }
        for (int k = 0; k < batch25Group3.length; k++) {
            batch25Groups[batch25Group1.length+batch25Group2.length+k]=batch25Group3[k];
        }
        System.out.println(Arrays.toString(batch25Groups));

    }
}
