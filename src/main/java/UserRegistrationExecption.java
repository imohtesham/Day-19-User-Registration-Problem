import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationExecption {

    static Scanner scanner= new Scanner(System.in);

    public static void userFirstNameException() throws CustomException{

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        System.out.println("Enter the firstname");
        String firstName = scanner.next();
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if(result==false){
            throw new CustomException("Invalid first name");
        }else{
            System.out.println("First name is Vaild");
        }

    }

    public static void userLastNameException() throws CustomException {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern1 = Pattern.compile(lastNamePattern);
        System.out.println("Enter the lastname");
        String lastName = scanner.next();
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        if(result1==false){
            throw new CustomException("Invalid last name");
        }else{
            System.out.println("last name is Vaild");
        }


    }

    public static void userEmailException() throws CustomException {
        String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern2 = Pattern.compile(emailPattern);
        System.out.println("Enter the Email");
        String email = scanner.next();
        Matcher matcher2 = pattern2.matcher(email);
        boolean result2 = matcher2.matches();
        if(result2==false){
            throw new CustomException("Invalid email");
        }else{
            System.out.println("Email is Vaild");
        }

    }

    public static void mobileNumberValidationException() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        System.out.println("Enter the Email");
        String phoneNumber = scanner.next();
        Matcher matcher3 = pattern3.matcher(phoneNumber);
        Boolean result3 = matcher3.matches();
        if(result3==false){
            throw new CustomException("Invalid Phone Number");
        }else{
            System.out.println("Phone Number is Vaild");
        }
    }

    public static void passwordValidationException() throws CustomException {

        String PasswordPattern4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";
        Pattern pattern7 = Pattern.compile(PasswordPattern4);
        System.out.println("Enter the Password");
        String password4 = scanner.next();
        Matcher matcher7 = pattern7.matcher(password4);
        boolean result7 = matcher7.matches();
        if(result7==false){
            throw new CustomException("Invalid Password follow the password rules");
        }else{
            System.out.println("Password is Vaild");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        System.out.println("Welcome to Exception Handling");
        try {
            UserRegistrationExecption.userFirstNameException();
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Custom Exception is handled");
        }
        try {
            UserRegistrationExecption.userLastNameException();
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Custom Exception is handled");
        }
        System.out.println("****Rest of codes****");
        try {
            UserRegistrationExecption.userEmailException();
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Custom Exception is handled");
        }
        try {
            UserRegistrationExecption.mobileNumberValidationException();
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Custom Exception is handled");
        }
        try {
            UserRegistrationExecption.passwordValidationException();
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Custom Exception is handled");
        }

    }


}