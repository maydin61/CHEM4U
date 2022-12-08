package day24CustomMethod_Return_extra;

public class wormingUpTask {
    public static void main(String[] args) {


        initialsOfThePerson("Aydin", "Muhammet");  // Two string must be added to run name and surname ;
        initialsOfThePerson("Aydin", "Cemal Halid");  // Two string must be added to run name and surname ;
        initialLetters("Simsek Fatih");                           // arguments assigned to parameters

        emailDomain("maydin@ichc.ro");


        findingWord("Java is fun, learn Java");



    }

    public static void initialsOfThePerson(String firstName, String lastName) {
        int lengthFirstName = firstName.length();
        int lengthLastName = lastName.length();
        System.out.println(firstName.charAt(0) + ". " + lastName.charAt(0) + ". ");
    }

    public static void emailDomain(String email) {
        // maydin@ichc.ro

        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
        System.out.println("email domain is    : " + domain);

        String extention = email.substring(email.indexOf('.') + 1);
        System.out.println("email extention is : " + extention);

        String emailAddress = email.substring(0, email.lastIndexOf('@'));
        System.out.println("used email name    :" + emailAddress);


    }

    public static void findingWord(String text) {
        int frequency = 0;
        String str = "Java";
        int counter = 0;
        String dummy = text;
        while (dummy.contains("Java")) {
            frequency++;
            dummy = text.replaceFirst(str, "");


        }
        System.out.println("Java: " + frequency);
    }

    public static void initialLetters(String text) {
        String surname = text.substring(0, text.lastIndexOf(' '));
        System.out.println("surname: " + surname);

        String name = text.substring(text.indexOf(' ') + 1);
        System.out.println("surname: " + name);
    }




}
