package day_20_Arrays;

public class uniqueElementOfArray {
    public static void main(String[] args) {
        String [] words= {"Java", "Python", "C##","Java","Python"};

        for (int j = 0; j < words.length; j++) {   // second dimension

            String element = words[j];   // Java , then Python etc......

            int countElement = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    countElement++;
                }
            }
        if ( countElement == 1){      // counted once a time
            System.out.println(element);
             }
        }
    }
}
