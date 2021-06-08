package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeyboardActionMultipleKeys
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

       WebElement input1 =  driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2 =  driver.findElement(By.xpath("//textarea[@id='inputText2']"));
         input1.sendKeys("Welcome to Selenium");

        Actions action = new Actions(driver);

        //Command+A
        action.keyDown(Keys.COMMAND);
        action.sendKeys("A");
        action.keyUp(Keys.COMMAND);
        action.perform();

        //Command+C

        action.keyDown(Keys.COMMAND);
        action.sendKeys("C");
        action.keyUp(Keys.COMMAND);
        action.perform();

        //TAB - shift to input2 box

        action.sendKeys(Keys.TAB).perform();

        //Command+V

        action.keyDown(Keys.COMMAND);
        action.sendKeys("V");
        action.keyUp(Keys.COMMAND);
        action.perform();

        //compare text

        if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
            System.out.println("Text copied");
        }else
            System.out.println("Text not copied");








    }
}
