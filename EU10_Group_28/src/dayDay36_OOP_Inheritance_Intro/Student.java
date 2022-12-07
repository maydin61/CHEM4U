package dayDay36_OOP_Inheritance_Intro;

public class Student {

    private String name,schoolName;
    private int age;
    private char gender,grade;

    public static boolean isStudent =true;
    public static boolean isHuman =true;

    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);                //this.name = name;
        setSchoolName(schoolName);     //this.schoolName = schoolName;
        setAge(age);                   //this.age = age;
        setGender(gender);            // this.gender = gender;
        setGrade(grade);              //this.grade = grade;

        // changed to set ........ to check the information given by keyboard(user)
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAge(int age) {
        if (age<5 || age>90){
            System.out.println("invalid age"+ age);
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            return;
        }
        this.grade = grade;
    }

    public String toString() {
        return "revisionEncapsulation{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name+ " is studying");
    }
}
