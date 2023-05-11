package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Test_1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 2. Sayfa basligini(title) yazdirin
        System.out.println("Sayfanin basligi : "+ driver.getTitle());

        // 3. Sayfa basliginin “Amazon” icerdigini test edin
        Thread.sleep(1500);
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title Amazon iceriyor , Test PASSED");
        }else {
            System.out.println("Title Amazon icermiyor , Test FAILED");
        }

        // 4. Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url : "+driver.getCurrentUrl());

        // 5. Sayfa url’inin “amazon” icerdigini test edin.
        expectedIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){
            System.out.println("url amazon iceriyor , URL test PASSED");
        } else {
            System.out.println("url amazon icermiyor , URL test FAILED");
        }

        // 6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        // 7. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        expectedIcerik="alisveris";
        String actualPageSource=driver.getPageSource();

        if (actualPageSource.contains(expectedIcerik)){
            System.out.println("sayfa kaynak kodlari alisveris iceriyor, test passed");
        }else {
            System.out.println("sayfa kaynak kodlari alisveris icermiyor, test failed");
        }

        // 8. Sayfayi kapatin.

        Thread.sleep(3000);
        driver.close();

    }
}
