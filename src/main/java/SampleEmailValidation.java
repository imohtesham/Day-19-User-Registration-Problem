import java.util.ArrayList;
import java.util.List;

public class SampleEmailValidation {

    List<String> emails = new ArrayList<String>();

    void validateEmail() {

        // Valid emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        //	Invalid emails
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        //object and calling the validEmail method for checking above emails
        UserRegistration emailcheck = new UserRegistration();
        int arrLength = emails.size();
        for(int i=0; i<arrLength; i++) {
            emailcheck.emailSamples(emails.get(i));
        }

    }

    //Constructor
    public SampleEmailValidation() {

    }

}