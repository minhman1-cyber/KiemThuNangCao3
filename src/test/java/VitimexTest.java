import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class VitimexTest {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
    }

    @Test
    public void yc1() throws InterruptedException {
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href = '/collections/ao-nam']")).click();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = {"yc1"})
    public void yc2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href = '/collections/ao-nam']")).click();
        Thread.sleep(10000);
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/products/atr5029']") // phần tử cha hoặc hình sản phẩm
        ));
        actions.moveToElement(product).perform();
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-variantid = '1157243028' and @data-handle='/products/atr5029']")
        ));
        button.click();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
