package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

       WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement  italy = driver.findElement(By.xpath("//div[@id='box106']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(stockholm,italy).build().perform();
    }
}
