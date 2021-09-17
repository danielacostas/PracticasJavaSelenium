import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    ChromeOptions options = new ChromeOptions().addArguments("---incognito");
    //WebDriver driverFirefox = new FirefoxDriver();

    WebDriver driver = new ChromeDriver(options);

    public void invokeFacebook (){

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.facebook.com");
    }

    public void login(){
        String xpathCookie="/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]";
        WebElement searchField = driver.findElement(By.xpath(xpathCookie));
        searchField.click();
        searchField = driver.findElement(By.name("email"));
        searchField.click();
        searchField.sendKeys("email");
        searchField = driver.findElement(By.name("pass"));
        searchField.click();
        searchField.sendKeys("password");
        searchField.sendKeys(Keys.ENTER);
    }

    public void openProfile(){
        String xpathPerfil = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]";
        WebElement searchField = driver.findElement(By.xpath(xpathPerfil));
        searchField.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void logout(){
        String xpathPestaña = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]";
        WebElement searchField = driver.findElement(By.xpath(xpathPestaña));
        searchField.click();

        //String xpathLogout = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]";
        String css = "div:nth-child(4) > .oajrlxb2 > .ow4ym5g4";
        searchField = driver.findElement(By.cssSelector(css));
        searchField.click();
    }

}
