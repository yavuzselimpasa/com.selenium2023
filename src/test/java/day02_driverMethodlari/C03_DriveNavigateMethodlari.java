package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C03_DriveNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        Thread.sleep(1500);

        driver.navigate().to ("https://www.trendyol.com");
        Thread.sleep(1500);

        driver.navigate().back(); // bir onceki web sayfasina geri doner.
        Thread.sleep(1500);

        driver.navigate().forward(); // bir sonraki web sayfasina gider.
        Thread.sleep(1500);

        driver.navigate().refresh(); // sayfayi yeniler.
        Thread.sleep(1500);

        driver.close();
    }
}
