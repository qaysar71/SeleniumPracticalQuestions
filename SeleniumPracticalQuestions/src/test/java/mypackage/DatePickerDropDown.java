package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DatePickerDropDown
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//label[@for='dob']")).click();

        //Month and year selection
        Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        month_drp.selectByVisibleText("Oct");

        Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year_drp.selectByVisibleText("1990");

        String date ="15";
        //Date selection
        List<WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement ele : allDates){
           String dt =  ele.getText();

           if(dt.equals(date)){
               ele.click();
               break;
           }
        }

    }
}
