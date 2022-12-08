package week13_03_12_2022.Access_Modifier.encapsulation;

public class TeacherObject {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Aydin", 34);

        Teacher teacher2 = new Teacher("Aliya",45);
        teacher2.setName("Veli");
        teacher1.setID(44);

        System.out.println("teacher2 = " + teacher2);
        System.out.println("teacher1 = " + teacher1);
        System.out.println(teacher1.getID());


    }
}
