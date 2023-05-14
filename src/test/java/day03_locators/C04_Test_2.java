package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Test_2 {

    public static void main(String[] args) {

        //    Automation Exercise Link Testi
        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement>sayfadakiLinkElementleri=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=sayfadakiLinkElementleri.size();
        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("link sayisi testi passed");
        }else {
            System.out.println("link sayisi testi failed");
        }

       // 4- Products linkine tiklayin
        WebElement productsLinkElementi=driver.findElement(By.partialLinkText("Products"));

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi =driver.findElement(By.id("sale_image"));
      if (specialOfferElementi.isDisplayed()){
          System.out.println("special offer testi passed");
      }else {
          System.out.println("special offer testi passed");
      }

        //6- Sayfayi kapatin
        driver.close();


    }
}
