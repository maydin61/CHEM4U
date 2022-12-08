package Day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog  dog1= new Dog();       //
        dog1.name = "Luck";
        dog1.breed= "Husky";
        dog1.age = 4;
        dog1.gender='M';
        dog1.dogcolor="White";
        dog1.size = "Small";


        
        Dog  dog2= new Dog();
        dog2.name = "Ann";
        dog2.breed= "Bulldog";
        dog2.age = 6;
        dog2.gender='F';
        dog2.dogcolor="Black";
        dog2.size = "Medium";

        Dog  dog3= new Dog();
        Dog  dog4= new Dog();
        Dog  dog5= new Dog();
        dog3.setInfo("Karabas", 3, 'M'," German","Large","Grey");
        dog4.setInfo("Suslu",2,'M',"Sng","small","white");
        dog5.setInfo("Nameless",6,'F',"brandless","Medium","mixed");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog2.eat();
        dog3.breed();
        dog1.sleeping();

        Dog [] dogs= {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaledogArrayList = new ArrayList<>();
        ArrayList<Dog> maledogArrayList = new ArrayList<>();
        femaledogArrayList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        maledogArrayList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        System.out.println(femaledogArrayList);

        for (Dog each:femaledogArrayList) {
            femaledogArrayList.removeIf(p -> ! (p.gender == 'M'));
                System.out.println(each.name);

        }
    }
}
