package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
        System.out.println("Location of minimum slider:"+min_slider.getLocation());
        System.out.println("Height & width of the element:"+min_slider.getSize());

        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Location of maximum slider:"+max_slider.getLocation());
        System.out.println("Height & width of the element:"+max_slider.getSize());

        Actions action = new Actions(driver);
        action.dragAndDropBy(min_slider,100, 0).perform();
        System.out.println("After movement Location of minimum slider:"+min_slider.getLocation());
        System.out.println("After movement Height & width of the element:"+min_slider.getSize());

        Actions act = new Actions(driver);
        act.dragAndDropBy(max_slider,-200, 0).perform();
        System.out.println("After movement Location of maximum slider:"+max_slider.getLocation());
        System.out.println("After movement Height & width of the element:"+max_slider.getSize());
    }
}
