import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Toolsqa {

    WebDriver driver = new ChromeDriver();

    public void invokeBrowser(){

        //Launch navigator and go to Toolsqa's page
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.toolsqa.com");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Dismiss advertising
        String xClass = "/html/body/div[5]/div/div/main/button";
        WebElement searchField = driver.findElement(By.xpath(xClass));
        searchField.click();
        }

        public void getMenuList(){
            System.out.println("===============================");
            System.out.println("Menu Options");
            String cssNavBar = ".navbar__links.d-none.d-lg-flex";
            WebElement navBar = driver.findElement(By.cssSelector(cssNavBar));

            List<WebElement> opciones = navBar.findElements(By.tagName("li"));
            for (WebElement o : opciones){
                System.out.println(o.getText());
            }
            System.out.println("===============================");
        }

        public void getSocialMedia(){
            System.out.println("===============================");
            System.out.println("Social Media");
            String facebook = driver.findElement(By.linkText("Facebook")).getAttribute("href");
            System.out.println(facebook);
            String twitter = driver.findElement(By.linkText("Twitter")).getAttribute("href");
            System.out.println(twitter);
            String linkedin = driver.findElement(By.linkText("Linkedin")).getAttribute("href");
            System.out.println(linkedin);
            String youtube = driver.findElement(By.linkText("Youtube")).getAttribute("href");
            System.out.println(youtube);
            System.out.println("===============================");
        }


        public void searchPostman(){
            String lupa = "/html/body/header/nav/div/div/div[3]/div/div[2]/form/input";
            WebElement searchField = driver.findElement(By.xpath(lupa));
            searchField.click();
            searchField.sendKeys("postman");
            searchField.sendKeys(Keys.ENTER);

        }

        public void getArticleList(){
            System.out.println("===============================");
            String articles = "/html/body/div[1]/div[2]/div/div";
            WebElement articulos = driver.findElement(By.xpath(articles));

            //Get list of 10 articles
            List<WebElement> articleList = articulos.findElements(By.tagName("a")).subList(0,10);
            for (WebElement a : articleList){
                String name = a.findElement(By.tagName("img")).getAttribute("alt");
                System.out.println(name + ": " + a.getAttribute("href"));
            }
            System.out.println("===============================");
        }
}