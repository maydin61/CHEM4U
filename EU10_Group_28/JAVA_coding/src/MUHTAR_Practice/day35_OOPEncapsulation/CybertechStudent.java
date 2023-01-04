package JAVA_coding.src.MUHTAR_Practice.day35_OOPEncapsulation;

public class CybertechStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String programingLanguage ;
    public static String secretCode;

    public CybertechStudent(String name, char gender, int age, int batchNumber, int groupNumber,
                            String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }
    static {
        schoolName = "Cydeo";
        programingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printScreetCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(name+" is attending class. ");
    }
    public void study(){
        System.out.println(name+" is studying.");
    }

    public String toString() {
        return "CybertechStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programing language='" + programingLanguage + '\'' +
                '}';
    }
}

