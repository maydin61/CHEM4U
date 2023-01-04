package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor.Scrum_Task;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers objects

        Tester tester1 = new Tester("Ahmed", 12, "QA",75_000);
        Tester tester2 = new Tester("Hamza", 13, "SDET",98500);
        Tester tester3 = new Tester("Aydin", 14, "SE",105_000);
        Tester tester4 = new Tester("Cemal", 24, "SDET",85_000);


        Tester [] testers = {tester2,tester3,tester4};
        // 4 developer objects
        Developer developer1=new Developer("Hafsa",34,"DevOp",90000);
        Developer developer2=new Developer("Erenay",44,"Java Developer",87000);
        Developer developer3=new Developer("Almula",22,"C##",98000);
        Developer developer4=new Developer("Sundus",10,"C Sharp",99000);

        Developer [] developers = {developer2,developer3,developer4};
        // 1 scrum team object
        ScrumTeam scrumTeam1= new ScrumTeam("Muhammet","Simsek","Halid", 14);

        scrumTeam1.addTester(tester1);
        scrumTeam1.addDeveloper(developer1);

        scrumTeam1.addMultipleTesters(testers);
        scrumTeam1.addDevelopers(developers);

        System.out.println("scrumTeam1 = " + scrumTeam1);

        System.out.println("--------------");

        for (Tester eachTeaster : scrumTeam1.testersList){
            System.out.println(eachTeaster.name+ " : "+ eachTeaster.salary+" : "+ eachTeaster.jobTitle);
        }
        System.out.println("==========");

        for (Developer eachDeveloper : scrumTeam1.devopsList) {
            System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary+" : "+ eachDeveloper.jobTitle);
        }
        scrumTeam1.removeTester(14);
        scrumTeam1.removeDeveloper(10);
        System.out.println(scrumTeam1);
    }
}
