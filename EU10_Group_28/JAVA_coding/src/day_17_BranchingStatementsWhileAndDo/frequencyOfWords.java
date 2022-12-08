package day_17_BranchingStatementsWhileAndDo;

public class frequencyOfWords {
    public static void main(String[] args) {
        String str="Java Java and  Python Python and Java ";
        int frequencyOfJava=0;
        int frequencyOfPython=0;
        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequencyOfJava++;

        }while (str.contains("Python")) {
            str=str.replaceFirst("Python","");
            frequencyOfPython++;
        }
        System.out.println("frequency of Java: "+frequencyOfJava);
        System.out.println("frequency of Python: "+frequencyOfPython);


        /* you can use ti if statement in a while and make it also

        if ( str.contains("Java"))
         str = str.replaceFirst("Java", "");
            frequencyOfJava++;

        if (str.contains("Python") {
            str=str.replaceFirst("Python","");
            frequencyOfPython++;

        */
    }
}
