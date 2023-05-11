package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_Test_5 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        // (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String expectedIcerik="facebook";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Sayfa basligi : "+driver.getTitle()+" iceriyor");
        }else {
            System.out.println("facebook icermiyor dogru baslik : "+driver.getTitle());

        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
      expectedIcerik="facebook";
      String  actualUrl=driver.getCurrentUrl();
      if (actualUrl.contains(expectedIcerik)){
          System.out.println("sayfa url facebook iceriyor");
      }else {
          System.out.println(driver.getCurrentUrl());
      }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

       // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        expectedIcerik="Walmart.com";
        String actualWalmart=driver.getTitle();
        if (actualWalmart.contains(expectedIcerik)){
            System.out.println("Sayfa basligi : "+expectedIcerik);
        }else {
            System.out.println("sayfa basligi walmart.com icermiyor");
        }

        //6. Tekrar “facebook” sayfasina donun
        Thread.sleep(2000);
        driver.navigate().back();
        //7. Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();
    }
}
