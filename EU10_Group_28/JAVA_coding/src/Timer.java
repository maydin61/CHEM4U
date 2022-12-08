import java.util.Scanner;

public class Timer {

    private static Thread Tread;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the minutes");
        int minutes = scan.nextInt();
        scan.close();
        for (int i = minutes; i > 0; i--) {
            for (int z=59;z>=0; z--){
                System.out.println("\r"+(i-1)+"minutes and "+ z+ "second left");
                Tread.sleep(1000);
            }
        }
        System.out.println("\n\n");
            

    }
}
