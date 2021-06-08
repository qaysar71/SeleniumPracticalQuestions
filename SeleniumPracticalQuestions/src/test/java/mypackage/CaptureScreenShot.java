package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot
{
    public static void main(String[] args) throws IOException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        //Fuul Page Screenshot
       /* TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(".//screenshot//homepage.png");
        FileUtils.copyFile(src,target);*/

        // screenshot of section/portion of the  page
       /* WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File target = new File(".//screenshot//Featured products.png");
        FileUtils.copyFile(src,target);*/

      WebElement element = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src = element.getScreenshotAs(OutputType.FILE);
        File target = new File(".//screenshot//Logo.png");
        FileUtils.copyFile(src,target);



        driver.close();
    }
}
