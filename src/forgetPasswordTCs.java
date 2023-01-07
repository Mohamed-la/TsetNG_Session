import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class forgetPasswordTCs
{
   static HomePageLocators homeLoc = null;
   static  LoginPageLocators loginLoc = null;
   static WebDriver driver = null;


         @BeforeMethod
         public void openBrowser() throws InterruptedException {
         String driverPath = "C:\\Users\\mabdelq1\\IdeaProjects\\test_project\\drivers\\chromedriver.exe";
         String driverType = "webdriver.chrome.driver";
         System.setProperty(driverType,driverPath);
         driver = new ChromeDriver();

         Thread.sleep(2000);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

         driver.navigate().to("https://the-internet.herokuapp.com/");
         Thread.sleep(2000);

   }

         @Test(priority = 1)
         public void forgetPasswordTC() throws InterruptedException
         {
           driver.findElement(By.cssSelector("a[href=\"/forgot_password\"]")).click();
           Thread.sleep(3000);
           Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/forgot_password");
         }


         @AfterMethod
         public void closeBrowser() throws InterruptedException {
             Thread.sleep(1000);
             driver.quit();

         }
}
