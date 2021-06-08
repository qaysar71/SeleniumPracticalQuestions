package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



public class BrokenLinks
{
    public static void main(String[] args) throws IOException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Broken URL
        // step 1  get all url's tied up to  the links  using Selenium
        // Java methods will call URL's  and get  the status code
        // if status code >400 then that url is not working ->link which tied to url is broken
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        SoftAssert sa = new  SoftAssert();

        for(WebElement link : links){
           String url = link.getAttribute("href");

           HttpURLConnection httpConn = (HttpURLConnection) new URL(url).openConnection();
            httpConn.setRequestMethod("HEAD");
            httpConn.connect();
            int respCode = httpConn.getResponseCode();
            System.out.println(respCode);
            sa.assertTrue(respCode<400,"The link with Text"+"   "  + link.getText()+" is broken with code"+ respCode);


        }

        sa.assertAll();




    }
}
