package day31_CustomClass_Constructor.Scrum_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    // public String BA;
   //  public String SM;

    ArrayList < Tester > testersList =new ArrayList<>();
    ArrayList < Developer > devopsList =new ArrayList<>();

    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester addTester1){
      testersList.add(addTester1);
    }
    public void addMultipleTesters(Tester [] addTesters2){
        testersList.addAll(Arrays.asList(addTesters2));
    }
    public void addDeveloper(Developer addDeveloper1){
        devopsList.add(addDeveloper1);
    }
    public void addDevelopers(Developer [] addDevelopers2){
        devopsList.addAll(Arrays.asList(addDevelopers2));
    }
    public void removeTester(int  employeeID){
        testersList.removeIf(p-> p.employeeID == employeeID);
    }
    public void removeDeveloper(int employeeID){   // developer use the ID as employer ID
        devopsList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers =" + testersList +   testersList.size()+ // modify
                ", total number of developers =" + devopsList + devopsList.size()+
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
