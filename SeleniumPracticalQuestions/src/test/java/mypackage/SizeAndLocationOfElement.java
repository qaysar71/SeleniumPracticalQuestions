package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationOfElement
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        //size
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getSize().getHeight());
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getSize().getWidth());
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getRect().getDimension().getWidth());
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getRect().getDimension().getHeight());


        //location
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getLocation().getX());
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getLocation().getY());

        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getRect().getX());
        System.out.println(driver.findElement(By.xpath("//div[@id='divLogo']//img")).getRect().getY());


    }
}




