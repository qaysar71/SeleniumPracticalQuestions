package mypackage;

import com.sun.glass.events.KeyEvent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class UploadFile
{
    public static void main(String[] args) throws AWTException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.monsterindia.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();

        //using sendKeys
       // driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/qaysarabla/Downloads/file-sample_150kB.pdf");

        //using robot class
        WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", button);// click action on the button

        /*1.copy the path
        2.COMMAND+V
        3.ENTER
         */
        Robot rb = new Robot();
        rb.delay(5000);

        StringSelection ss = new StringSelection("/Users/qaysarabla/Downloads/file-sample_150kB.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        rb.delay(5000);
        rb.keyPress(KeyEvent.VK_COMMAND);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_COMMAND);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(5000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);








    }
}
