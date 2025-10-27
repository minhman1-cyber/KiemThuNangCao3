import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        // Khởi tạo ChromeDriver (WebDriverManager có thể tự setup nếu bạn đã cài)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dangKyTest() throws InterruptedException {
        // 1️⃣ Mở trang đăng ký
        driver.get("https://demo.automationtesting.in/Register.html");

        // 2️⃣ Nhập thông tin cơ bản
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Minh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Do");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123 Nguyen Trai, HCMC");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("minh@example.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0123456789");

        // 3️⃣ Chọn giới tính & sở thích
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox2")).click(); // Movies

        // 4️⃣ Chọn ngôn ngữ
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(1000);
        WebElement english = driver.findElement(By.xpath("//a[text()='English']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", english); // Tránh lỗi bị quảng cáo che
        driver.findElement(By.xpath("//label[contains(text(),'Skills')]")).click(); // click ra ngoài

        // 5️⃣ Chọn kỹ năng
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        // 6️⃣ Chọn năm / tháng / ngày sinh
        new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1995");
        new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']"))).selectByVisibleText("June");
        new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("15");

        // 7️⃣ Nhập mật khẩu
        driver.findElement(By.id("firstpassword")).sendKeys("123456");
        driver.findElement(By.id("secondpassword")).sendKeys("123456");

        // 8️⃣ (Tuỳ chọn) Upload ảnh
        // driver.findElement(By.id("imagesrc")).sendKeys("/Users/minh/Desktop/test.jpg");

        // 9️⃣ Submit form
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(3000);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
