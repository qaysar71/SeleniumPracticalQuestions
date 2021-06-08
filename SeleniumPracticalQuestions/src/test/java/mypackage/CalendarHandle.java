package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalendarHandle
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='travel_date']")).click();

        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).
                getText().contains("May")){
                driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }






        List<WebElement> allDates=driver.findElements(By.cssSelector(".day"));

      /*  for(WebElement date : allDates){
            String dt = date.getText();
            if(dt.equalsIgnoreCase("22")){
                date.click();
                break;
            }
        }*/

        int count = driver.findElements(By.cssSelector(".day")).size();

        for(int i=0; i<count;i++){
           String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
           if(text.equalsIgnoreCase("21")){
               driver.findElements(By.cssSelector(".day")).get(i).click();
               break;
           }
        }
    }
}
