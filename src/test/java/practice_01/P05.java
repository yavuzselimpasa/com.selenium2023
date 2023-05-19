package practice_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

    public static void main(String[] args) throws InterruptedException {

        //    1-Driver oluşturalim
        WebDriverManager.chromedriver().setup();

        //    2-Java class'imiza chnomedriver. exetyi tanitalim
        WebDriver driver=new ChromeDriver();

        //    3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();

        //    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.get("http://www.babayigit.net/murat/testpage.html");

        //    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        //        alanlarına gerekli bilgileri yazsın
        driver.findElement(By.xpath("//*[@id=\"ad\"]")).sendKeys("selenium");
        driver.findElement(By.xpath("//*[@id=\"soyad\"]")).sendKeys("excitement");
        driver.findElement(By.xpath("//*[@id=\"yas\"]")).sendKeys("35");
        driver.findElement(By.xpath("//*[@id=\"meslek\"]")).sendKeys("QA");
        driver.findElement(By.xpath("//*[@id=\"dogum_yeri\"]")).sendKeys("palace");
        driver.findElement(By.xpath("//*[@id=\"mezun_okul\"]")).sendKeys("university");
        driver.findElement(By.xpath("//*[@id=\"cocuk_sayisi\"]")).sendKeys("2");

        //    7-Submit tuşuna bassın.
        driver.findElement(By.xpath("/html/body/center/form/input[8]")).click();

        //    8- All information was entered correctly.. yazısının göründüğünü test etsin
        if (driver.findElement(By.xpath("//*[@id=\"uyari\"]")).isDisplayed()){
            System.out.println("All information was entered correctly..Testi PASSED");
        }else {
            System.out.println("All information was entered correctly..Testİ FAİLED");
        }

        //    9- Clear butonu ile tüm butonları temizlesin
        driver.findElement(By.xpath("/html/body/center/form/input[9]")).click();

        //    10- Manuel olarak temizlendiğini görecek kadar beklesin
        Thread.sleep(3000);

        //    11- Sayfayı kapatsın
        driver.close();

    }
}
