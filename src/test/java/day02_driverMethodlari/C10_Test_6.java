package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_Test_6 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https:/www.youtube.com");
        String expectedIcerik="youtube";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println(expectedIcerik);
        }else {
            System.out.println("dogru baslik : "+ driver.getTitle());
        }

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        expectedIcerik="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println(expectedIcerik);
        }else {
            System.out.println("dogru url : "+driver.getCurrentUrl());
        }
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

        //Youtube sayfasina geri donun
        Thread.sleep(2000);
        driver.navigate().to("https:/www.youtube.com");

        //Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();

        //Amazon sayfasina donun
        Thread.sleep(2000);
        driver.navigate().back();

        //Sayfayi tamsayfa yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        Thread.sleep(3000);
        expectedIcerik="Amazon";
        String actualYeniTitle=driver.getCurrentUrl();
        if (actualYeniTitle.contains(expectedIcerik)){
            System.out.println(expectedIcerik);
        }else {
            System.out.println("dogru title : " + driver.getTitle());
        }
            //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın
        expectedIcerik="https://www.amazon.com/";
        String actualYeniUrl=driver.getCurrentUrl();
        if (actualYeniUrl.contains(expectedIcerik)){
            System.out.println(expectedIcerik);
        }else {
            System.out.println("dogru url : "+driver.getCurrentUrl());
        }

        //Sayfayi kapatin
        driver.close();



    }
}
