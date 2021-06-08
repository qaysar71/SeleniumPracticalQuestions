package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLInkInNewTab
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        String onClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys(onClickTab);

       // driver.close();
    }
}
