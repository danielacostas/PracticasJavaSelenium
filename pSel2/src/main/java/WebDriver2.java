import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriver2 {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.toolsqa.com");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

/*        WebElement searchField = driver.findElement(By.id("accept-cookie-policy")); //Accept cookies
        searchField.click();*/

        String xClass = "/html/body/div[5]/div/div/main/button";
        WebElement searchField = driver.findElement(By.xpath(xClass));
        searchField.click();

        String lupa = "/html/body/header/nav/div/div/div[3]/div/div[2]/form/input";
        searchField = driver.findElement(By.xpath(lupa));
        searchField.click();
        searchField.sendKeys("postman");
        searchField.sendKeys(Keys.ENTER);

        //WebElement articleList = driver.findElements(By.);

    }
}
