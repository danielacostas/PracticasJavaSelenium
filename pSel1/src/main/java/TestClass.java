import org.testng.annotations.Test;

public class TestClass {

    LoginChrome loginChrome = new LoginChrome();
    LoginFirefox loginFirefox = new LoginFirefox();

    @Test
    public void testLogin(){
        loginChrome.invokeFacebook();
        loginChrome.login();
        loginChrome.openProfile();
        loginFirefox.invokeFacebook();
        loginFirefox.login();
        loginFirefox.openProfile();
    }

    @Test
    public void testLogout(){
        loginChrome.logout();
        loginFirefox.logout();
    }

}
