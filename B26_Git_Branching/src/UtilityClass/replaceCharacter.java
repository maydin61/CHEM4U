public class replaceCharacter {
    public static void main(String[] args) {
        String str="Robert Down Junior";
        char srt1 = str.charAt(0);
        int  srt2 = str.indexOf(" ");
        int srt3 = str.lastIndexOf(" ");

        System.out.println(srt1+"."+str.charAt(srt2+1)+"."+str.substring(srt3));


    }
}
