package week13_03_12_2022.warmUP;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Teacher extends ArrayList<Teacher> {
    public String name,surnameName;
    public char gender;
    public int dateOfBirth;
    public int age;
    public long ID;

        public Teacher(String name, String surnameName, char gender, int dateOfBirth, long ID) {
            this.name = name;
            this.surnameName = surnameName;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.ID = ID;

            int currentYear = LocalDateTime.now().getYear();
            int yearOfTDateBirth = dateOfBirth;

            this.age = currentYear- yearOfTDateBirth;

        }


        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", surnameName='" + surnameName + '\'' +
                    ", gender=" + gender +
                    ", dateOfBirth=" + dateOfBirth +
                    ", age=" + age +
                    ", ID=" + ID +
                    '}';
        }
    }
