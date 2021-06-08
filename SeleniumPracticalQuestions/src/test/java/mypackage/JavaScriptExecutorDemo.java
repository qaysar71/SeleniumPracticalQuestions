package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        //Syntax
       // JavascriptExecutor js =(JavascriptExecutor) driver;
       // js.executeScript();

        //flash
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil.flashByJs(logo, driver);


        //Drawing border & take screenshot
        /*WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil.drawBorder(logo, driver );
        TakesScreenshot ts = ( TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(".//screenshot/logojs.png");
        FileUtils.copyFile(src, target);*/

        //getting title of page

       // String title = JavaScriptUtil. getTitleByJS(driver);
       // System.out.println(title);

        //click action

       /* WebElement registerLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        JavaScriptUtil.clickElementByJs(registerLink, driver);*/


        //Generate alert
        /*JavaScriptUtil.generateAlertByJs( driver, "This is my alert...");
        driver.switchTo().alert().accept();*/

       // Refreshing page
        //JavaScriptUtil.refreshBrowserByJS( driver);

        //Scroll page
        //JavaScriptUtil.scrollPageDownByJS(driver);
       // Thread.sleep(5000);
        //JavaScriptUtil.scrollPageUpByJS( driver);

        // Zoom page
        //JavaScriptUtil.zoomPageByJS( driver);

    }
}
