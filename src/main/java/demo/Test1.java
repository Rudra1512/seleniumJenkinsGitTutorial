package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() throws InterruptedException {
       // String projectPath = System.getProperty("user.dir");
       // System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait()
    }
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();


    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}

