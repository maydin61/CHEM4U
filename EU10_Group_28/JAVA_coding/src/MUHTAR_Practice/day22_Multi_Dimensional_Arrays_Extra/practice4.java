package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class practice4 {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[] batch25Groups = new String[batch25Group1.length + batch25Group2.length + batch25Group3.length];

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String[] batch24Groups = new String[batch24Group1.length + batch24Group2.length + batch24Group3.length];

        String[] CydeoStudents = new String[batch24Groups.length + batch25Groups.length];
        for (int i = 0; i < batch24Group1.length; i++) {
            CydeoStudents[i] = batch24Group1[i];
        }
        for (int i = 0; i < batch24Group2.length; i++) {
            CydeoStudents[batch24Group1.length + i] = batch24Group2[i];
        }
        for (int i = 0; i < batch24Group3.length; i++) {
            CydeoStudents[batch24Group1.length + batch24Group2.length + i] = batch24Group3[i];
        }
        for (int i = 0; i < batch25Groups.length; i++) {
            CydeoStudents[batch24Group1.length + batch24Group2.length + batch24Group3.length + i] = batch25Groups[i];

        }
        System.out.println(Arrays.toString(CydeoStudents));
    }
}