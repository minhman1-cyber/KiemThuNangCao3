import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void dangKyTest() throws InterruptedException {
        driver.get("https://hoctotlamhay.vn/register");
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("hello1");
        driver.findElement(By.id("user_email")).sendKeys("blabla1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password1");
        driver.findElement(By.xpath("//button[@class = 'btn btn-primary w-100' and contains(text(), 'Đăng ký')]")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = {"dangKyTest"})
    public void dangNhapTest() throws InterruptedException {
        driver.get("https://hoctotlamhay.vn/login");
        Thread.sleep(3000);
        driver.findElement(By.id("user_email")).sendKeys("blabla1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password1");
        driver.findElement(By.xpath("//button[@class = 'btn btn-primary w-100' and contains(text(), 'Đăng nhập')]")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getPageSource().contains("Ngôn ngữ C++"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
