package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleCookies
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        for(Cookie cookie:cookies){
            System.out.println(cookie.getName()+"  : "+cookie.getValue());
        }

        Cookie cookieobj = new Cookie("myCookie123", "123456");
        driver.manage().addCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("After adding:"+cookies.size());

        driver.manage().deleteCookieNamed("myCookie123");
        driver.manage().deleteCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("after delete:"+cookies.size());

        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("after delete:"+cookies.size());


        driver.quit();

    }
}
