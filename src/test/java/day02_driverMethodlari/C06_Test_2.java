package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Test_2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");

        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");

        // 3. Tekrar YouTube’sayfasina donelim
        Thread.sleep(2000);
        driver.navigate().back();

        // 4. Yeniden Amazon sayfasina gidelim
        Thread.sleep(2000);
        driver.navigate().forward();

        // 5. Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
        driver.navigate().refresh();

        // 6. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();
    }
}
