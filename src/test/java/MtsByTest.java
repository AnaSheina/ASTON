import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class MtsByTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void endSetUp() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Проверка названия блока")
    public void testBlockName() {
        WebElement blockName = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        Assert.assertEquals(blockName.getText(), "Онлайн пополнение\nбез комиссии");
    }

    @Test
    @DisplayName("Проверка наличия логотипов")
    public void testPayLogo() {
        List<WebElement> payLogos = driver.findElements(By.xpath("//div[@class='pay__partners']/ul/li"));
        Assert.assertFalse(payLogos.isEmpty(), "Логотипы платежных систем не найдены");
        for (WebElement payLogo : payLogos) {
            Assert.assertTrue(payLogo.isDisplayed(), "Логотип не отображается");
        }
    }

    @Test
    @DisplayName("Проверка работы ссылки")
    public void testLink() {
        WebElement link = driver.findElement(By.xpath("//div[@class='pay__wrapper']/a"));
        driver.findElement(By.xpath("//button[contains(@class, \"cookie__cancel\")]")).click();
        link.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"), "Ссылка не работает");
    }

    @Test
    @DisplayName("Проверка работы кнопки Продолжить")
    public void testContinueButton() {
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumInput = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='connection-email']"));
        WebElement continueButton = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));

        phoneInput.sendKeys("297777777");
        sumInput.sendKeys("100");
        emailInput.sendKeys("test@test.com");
        continueButton.submit();
    }
}
