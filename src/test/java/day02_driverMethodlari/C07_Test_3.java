package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Test_3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu : "+driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(1500);

        // 4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize konum : "+driver.manage().window().getPosition());
        System.out.println("Maximize boyut : "+driver.manage().window().getSize());

        // 6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fulscreen konum : "+ driver.manage().window().getPosition());
        System.out.println("Fulscreen boyut : "+driver.manage().window().getSize());

        // 8. Sayfayi kapatin
        driver.close();
    }
}
