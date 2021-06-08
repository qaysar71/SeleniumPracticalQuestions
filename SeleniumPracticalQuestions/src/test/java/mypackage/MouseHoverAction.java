package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();

      WebElement desktopMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement macMenu = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        Actions action = new Actions(driver);
        action.moveToElement(desktopMenu).moveToElement(macMenu).click().perform();
    }
}
