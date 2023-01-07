import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class voidMainMethodTCs
{
    public static void main(String[] args)throws InterruptedException
    {
// bridge between the browser and java code
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mabdelq1\\IdeaProjects\\test_project\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/?hl=en");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("result-stats")).isDisplayed());

       driver.findElement(By.linkText("Images")).click();
        Thread.sleep(3000);
       driver.quit();
    }
}
