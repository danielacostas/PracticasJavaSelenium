import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    Login login = new Login();

    @Test
    public void testLogin(){
        login.invokeFacebook();
        login.login();
        login.openProfile();
    }

    @Test
    public void testLogout(){
        login.logout();
    }

}
