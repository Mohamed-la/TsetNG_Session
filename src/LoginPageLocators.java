import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators
{

    public static WebElement enterUserName(WebDriver driver)
    {
        return driver.findElement(By.cssSelector("input[type=\"text\"]"));
    }
    public static WebElement enterPassword(WebDriver driver)
    {
        return  driver.findElement(By.xpath("//input[@type=\"password\"]"));
    }

    public static By pressEnter()
    {
        return By.xpath("//button[@type=\"submit\"]");
    }

    public static WebElement logOutEle (WebDriver driver)
    {
        return driver.findElement(By.className("flash"));


    }

    public static WebElement logOutElement (WebDriver driver)
    {
      return  driver.findElement(By.linkText("Logout"));
    }
    public static WebElement YouloggedintoasecureareaElement(WebDriver driver)
    {
        return  driver.findElement(By.id("flash"));
    }


}
