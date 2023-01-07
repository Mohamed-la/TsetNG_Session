import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLocators
{

    public static WebElement loginclick(WebDriver driver)
    {
        String loginString = "a[href =\"/login\"]";
        By loginBy = By.cssSelector(loginString);
        WebElement loginElement = driver.findElement(loginBy);
        return loginElement;
    }


}
