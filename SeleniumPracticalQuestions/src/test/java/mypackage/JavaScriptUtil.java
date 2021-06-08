package mypackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil
{
    public static void drawBorder(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);

    }

    public static String getTitleByJS(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = js.executeScript("return document.title;").toString();
        return title;

    }

    public static void clickElementByJs(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    public static void generateAlertByJs(WebDriver driver, String message)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert(' " + message + "')");

    }

    public static void refreshBrowserByJS(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go[0]");

    }

    public static void scrollPageUpByJS(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

    }

    public static void scrollPageDownByJS(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public static void zoomPageByJS(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(" document.body.style.zoom='50'");

    }

    public static void flashByJs(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgColor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 50; i++) {
            changeColor("#000000", element, driver);//1
            changeColor(bgColor, element, driver);//2
        }

    }
    public static void changeColor(String color,WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(" arguments[0].style.backgroundColor='"+ color +"'",element);

        try {
           Thread.sleep(20);

        }catch(InterruptedException e){

    }

    }
}



