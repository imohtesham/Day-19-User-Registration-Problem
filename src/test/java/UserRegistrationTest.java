
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration uservalidation=new UserRegistration();
        boolean result=uservalidation.firstName("Mohd");
        Assert.assertEquals("Firstname",true,result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration uservalidation1=new UserRegistration();
        boolean result1=uservalidation1.firstName("nihhh");
        Assert.assertEquals("Firstname",false,result1);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration uservalidation2=new UserRegistration();
        boolean result2=uservalidation2.lastName("Ibrahim");
        Assert.assertEquals("Lastname",true,result2);
    }

    @Test
    void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration uservalidation3=new UserRegistration();
        boolean result3=uservalidation3.lastName("himmm");
        Assert.assertEquals("Email",false,result3);
    }


    @Test
    void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration uservalidation4=new UserRegistration();
        boolean result4=uservalidation4.emailId(  "ibrahim92@gmail.com");
        Assert.assertEquals("Email",true,result4);
    }

    @Test
    void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistration uservalidation5=new UserRegistration();
        boolean result5=uservalidation5.emailId(  "abc.gmail.com");
        Assert.assertEquals("Email",false,result5);
    }

    @Test
    void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration uservalidation6=new UserRegistration();
        boolean result6=uservalidation6.phoneNumber(  "8801848744");
        Assert.assertEquals("Phone Number",true,result6);
    }

    @Test
    void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration uservalidation7=new UserRegistration();
        boolean result7=uservalidation7.phoneNumber(  "6896678363333");
        Assert.assertEquals("Phone Number",false,result7);
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration uservalidation8=new UserRegistration();
        boolean result8=uservalidation8.password(  "Password@1");
        Assert.assertEquals("Phone Number",true,result8);
    }

    @Test
    void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserRegistration uservalidation9=new UserRegistration();
        boolean result9=uservalidation9.password(  "wue8yerjr");
        Assert.assertEquals("Phone Number",false,result9);
    }
    /**
     * Unit test for validating mood of the User
     */
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        UserRegistration am=new UserRegistration();
        String result = am.analyseMood("happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnEntryFailed() {
        UserRegistration am1=new UserRegistration();
        String results1 = am1.analyseMood("sad");
        Assert.assertEquals("Entry Failed", results1);
    }

}