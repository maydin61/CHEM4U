package day_17_BranchingStatementsWhileAndDo;

public class branchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'F'; i++) {
           if (i=='C'){              //   continue, will skip the condition given
               continue;
           }
           if (i=='E'){
               break;           // break; will stop the looping after that condition.
           }
            System.out.println(i);
        }
    }
}
