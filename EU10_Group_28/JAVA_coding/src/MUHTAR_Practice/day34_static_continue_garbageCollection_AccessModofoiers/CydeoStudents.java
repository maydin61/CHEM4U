package JAVA_coding.src.MUHTAR_Practice.day34_static_continue_garbageCollection_AccessModofoiers;

public class CydeoStudents {
    public String studentName;
    public static String schoolName;

    public CydeoStudents(String studentName){
        this.studentName=studentName;
        schoolName="Cydeo School";
    }
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudents student1=new CydeoStudents("Aydin");
        CydeoStudents student2=new CydeoStudents("Ahmed");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println("student1 = " + student1);
    }

}
