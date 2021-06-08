package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

        action.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.SPACE).perform();
        Thread.sleep(3000);


    }
}
