import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginChrome {

    //Launch in incognito mode
    ChromeOptions options = new ChromeOptions().addArguments("---incognito");
    WebDriver driver = new ChromeDriver(options);

    public void invokeFacebook (){
        //Open navigator and go to Facebook's page
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.facebook.com");
    }

    public void login(){
        //Accept cookies
        String xpathCookie="/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]";
        WebElement searchField = driver.findElement(By.xpath(xpathCookie));
        searchField.click();

        //Enter credentials
        searchField = driver.findElement(By.name("email"));
        searchField.click();
        searchField.sendKeys("email");
        searchField = driver.findElement(By.name("pass"));
        searchField.click();
        searchField.sendKeys("password");
        searchField.sendKeys(Keys.ENTER);

        //Wait 5 secs
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openProfile(){
        //Click on profile
        String xpathPerfil = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]";
        WebElement searchField = driver.findElement(By.xpath(xpathPerfil));
        searchField.click();

        //Wait 3 secs
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void logout(){
        //Click on top right tab
        String xpathPestaña = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]";
        WebElement searchField = driver.findElement(By.xpath(xpathPestaña));
        searchField.click();

        //Logout
        String css = "div:nth-child(4) > .oajrlxb2 > .ow4ym5g4";
        searchField = driver.findElement(By.cssSelector(css));
        searchField.click();
    }

}
