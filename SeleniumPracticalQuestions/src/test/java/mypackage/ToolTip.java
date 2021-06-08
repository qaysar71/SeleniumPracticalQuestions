package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://jqueryui.com/tooltip");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
       String toolTipText =  inputbox.getDomAttribute("title");
        System.out.println(toolTipText);

        driver.close();

    }
}
