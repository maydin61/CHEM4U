package JAVA_coding.src.MUHTAR_Practice.day_37_OOP_Inheritance_Continue_SuperKeyword;

public class Animals {
    public Animals(String name, char gender, String size, int age, String colour) {

    }

    public class Animal {

        public String name;
        public char gender;
        public String size;
        public int age;
        public String colour;

        public void setInfo (String name, char gender, String size, int age, String colour) {
            this.name = name;
            this.gender = gender;
            this.size = size;
            this.age = age;
            this.colour = colour;
        }

        public void eat(){
            System.out.println(name+" is eating");
        }
        public void drink(){
            System.out.println(name+" iis drinking");
        }
        public void move(){
            System.out.println(name+" is moving");
        }
        public void sleep(){
            System.out.println(name+" is sleeping");
        }


        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", size='" + size + '\'' +
                    ", age=" + age +
                    ", colour='" + colour + '\'' +
                    '}';
        }
    }


/*
        name, breed, gender, size, age, colour
        setInfo(),eat(), drink(),move(), sleep(), toString()

        Dog extends Animal:
                bark()

        Cat extends Animal:
                scratch()

        Tiger extends Animal:
                roar()

        Fish extend Animal:
                swim()
 */
}
