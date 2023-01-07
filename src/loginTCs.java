import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class loginTCs

{
static WebDriver driver=null;
@BeforeMethod
    public void openBrowser()
{
    String driverPath = "C:\\Users\\mabdelq1\\IdeaProjects\\2-TestNG_training\\drivers\\chromedriver.exe";
    String driverType = "webdriver.chrome.driver";
System.setProperty(driverType,driverPath);
driver=new ChromeDriver();
driver.navigate().to("http://the-internet.herokuapp.com/");

}
@Test(dependsOnMethods = {"TC_B"})
    public void TC_A()
{
driver.findElement(By.linkText("Form Authentication")).click();
    driver.findElement(By.name("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]")).click();
Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
}

@Test(enabled = true , priority =1)
public void TC_B()
{
    driver.findElement(By.linkText("Form Authentication")).click();
    driver.findElement(By.name("jjjjjjj")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPasswords!");
    driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]")).click();
    Assert.assertTrue(driver.findElement(By.className("error")).isDisplayed());

}

@AfterMethod
    public void closeBrowser()
{


}




}










//   static HomePageLocators homeLoc = null;
//   static  LoginPageLocators loginLoc = null;
//   static WebDriver driver = null;

//         @BeforeMethod
//         public void openBrowser() throws InterruptedException
//         {
//         String driverPath = "C:\\Users\\mabdelq1\\IdeaProjects\\2-TestNG_training\\drivers\\chromedriver.exe";
//         String driverType = "webdriver.chrome.driver";
//         System.setProperty(driverType,driverPath);
//         driver = new ChromeDriver();
//
//         Thread.sleep(2000);
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//         driver.navigate().to("https://the-internet.herokuapp.com/");
//         Thread.sleep(2000);
//         homeLoc =  new HomePageLocators();
//         loginLoc = new LoginPageLocators();
//         }

//         @Test(priority = 1)
//         public void validLogin() throws InterruptedException
//         {
//            System.out.println("Test Case 1 : Valid user name and password ");
//            // Test case 1 : valid login
//            // step 1.1 : open form authentication
//            homeLoc.loginclick(driver).click();
//            // step 1.2 : write username
//            loginLoc.enterUserName(driver).sendKeys("tomsmith");
//            // step 1.3 : write password
//            loginLoc.enterPassword(driver).sendKeys("SuperSecretPassword!");
//            // step 1.4 : click login
//            driver.findElement(loginLoc.pressEnter()).click();
//
//             Thread.sleep(2000);
//             // step 1.5 : verify
//          //     System.out.println(!loginLoc.logOutElement(driver).isDisplayed());
//     //        Assert.assertTrue(loginLoc.logOutElement(driver).isDisplayed());
//             Assert.assertEquals(driver.findElement(By.id("flash")).getText().contains("logged"),true);
//
//
//
//
////     //        Assert.assertTrue(loginLoc.YouloggedintoasecureareaElement(driver).isDisplayed());
//
////             SoftAssert soft = new SoftAssert();
////             System.out.println("Assertion 1 ");
////             soft.assertTrue(!loginLoc.logOutElement(driver).isDisplayed(),"Check logout button is visible on UI page");
////             System.out.println("Assertion 2 ");
////             soft.assertEquals(loginLoc.YouloggedintoasecureareaElement(driver).isDisplayed(), true , "");
////             soft.assertAll(); // hard assert
////             System.out.println("Assertion all ");
//
//         }
//
//
//         @Test(priority = 2)
//         public void invalidLogin() throws InterruptedException {
//
//             System.out.println("Test Case 2 : Invalid user name and password ");
//             driver.navigate().to("https://the-internet.herokuapp.com/");
//             Thread.sleep(2000);
//             // Test case 2 : invalid login
//             // step 2.1 : open form authentication
//             homeLoc.loginclick(driver).click();
//             // step 2.2 : write username
//             loginLoc.enterUserName(driver).sendKeys("tomsmith");
//             // step 2.3 : write password
//             loginLoc.enterPassword(driver).sendKeys("SuperSecretPassword!!");
//             // step 2.4 : click login
//             driver.findElement(loginLoc.pressEnter()).click();
//             // step 2.5 : verify
//     //      System.out.println(!loginLoc.logOutEle(driver).isDisplayed());
//             Assert.assertTrue(loginLoc.logOutEle(driver).isDisplayed(),"icon is not visisble");
////             Thread.sleep(2000);
//
//         }
//
//         @AfterMethod
//         public void closeBrowser() throws InterruptedException {
//             Thread.sleep(1000);
//             driver.quit();
//
//         }

