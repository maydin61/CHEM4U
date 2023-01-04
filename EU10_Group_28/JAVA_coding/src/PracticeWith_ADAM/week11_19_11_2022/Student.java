package JAVA_coding.src.PracticeWith_ADAM.week11_19_11_2022;

import java.time.LocalDate;

public class Student {
    public Student(String name, char gender, LocalDate dateOfBirth, int age) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getDayOfYear()-dateOfBirth.getDayOfYear();
    }

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;


    public Student(String osman) {

    }
}

/*
Adam B — Today at 10:43 PM
Task 4 :

1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
 */