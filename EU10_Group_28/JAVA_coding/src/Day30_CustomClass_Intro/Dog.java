package Day30_CustomClass_Intro;

public class Dog {

    public String name;
    public int age;
    public char gender;
    public String breed;
    public String  size;
    public String dogcolor;
    public String dogSize;

    public void setInfo(String dogName, int dogAgge,char dogGender, String dogBreed, String dogSize, String dogcolor){
            name = dogName;
            age = dogAgge;
            gender = dogGender;
            breed = dogBreed;
            size = dogSize;
            dogcolor = dogcolor;

            // user enter from keyboard the value up
    }

 // instant method  access modifier   return multiple copy
                       public          void                   eat(){
                           System.out.println(name+ " is eating");
    }
                        public           void             breed(){
                            System.out.println(name+" is breed");
                        }
                        public            void        sleeping(){
                            System.out.println(name+" is sleeping");
                        }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", dogcolor='" + dogcolor + '\'' +
                '}';
    }

}
