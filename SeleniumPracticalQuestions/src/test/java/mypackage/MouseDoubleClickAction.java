package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDoubleClickAction
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame("iframeResult");

       WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
       field1.clear();
       field1.sendKeys("Welcome to Selenium");

       WebElement clickCopyText =  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

       Actions action = new Actions(driver);
       action.doubleClick(clickCopyText).build().perform();//perform double clicl action



    }
}
