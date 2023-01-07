import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class retrainOne {

    @BeforeTest
    public void openBrowaser()
    {
        System.out.println("open chrom browser");
    }


    @Test(priority = 1)
    public void TestCaseOne()
    {
        // Test Valid username and password //
         System.out.println("TestCase1: Valid username and password");
    }

    @Test(priority = 1)
    public void TestCaseTwo()
    {
        // Test Valid username and password //
        System.out.println("TestCase2: Invalid username and password");
    }

    @AfterTest
    public void closeBrowser()
    {

        System.out.println("quitting chrome");
    }

}
