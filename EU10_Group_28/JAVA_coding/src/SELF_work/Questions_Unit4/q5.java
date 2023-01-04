package JAVA_coding.src.SELF_work.Questions_Unit4;

public class q5 {
    public static class Sport{
        String name;
        int numOfPlayers;
        boolean teamBased;

        public void makeSport(String name, int players, boolean teams){
            name= name;
            numOfPlayers = players;
            teamBased = teams;
        }
        public String toString(){
            String msg= "The sport is "+name+ " and has "+numOfPlayers+" players total ";
            if (teamBased){
                msg+="divided into teams";
            }else {
                msg += "but there is no teams";
            }
            return msg;
        }

        public static void main(String[] args) {
            Sport soccer =new Sport();
            soccer.makeSport("Soccer",22,true);
            System.out.println(soccer);
        }
    }
}
