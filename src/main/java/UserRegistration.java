import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scan = new Scanner(System.in);

    public boolean firstName(String firstName) {
        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
    public boolean lastName(String lastName) {
        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern1 = Pattern.compile(lastNamePattern);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        return result1;
    }
    public boolean emailId(String email){
        String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

        Pattern pattern2 = Pattern.compile(emailPattern);
        Matcher matcher2 = pattern2.matcher(email);
        boolean result2 = matcher2.matches();
        return result2;
    }
    public boolean phoneNumber(String num){
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(num);
        Boolean result3 = matcher3.matches();
        return result3;
    }
    //RRule4 – Has exactly 1 Special Character
    public static boolean password(String pass) {
        String PasswordPattern4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";

        Pattern pattern7 = Pattern.compile(PasswordPattern4);
        Matcher matcher7 = pattern7.matcher(pass);
        boolean result7 = matcher7.matches();
        return result7;
    }
    public void emailSamples(String next) {
        System.out.println("Enter Email samples : ");
        String email = scan.next();
        Pattern pattern6 = Pattern.compile("[a-zA-Z0-9]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher matcher6 = pattern6.matcher(email);
        if (matcher6.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter password in valid format");
        }
    }
    public static String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else return null;
    }
}



