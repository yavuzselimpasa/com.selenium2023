package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Test_1 {

    public static void main(String[] args) throws InterruptedException {
        //1-  bir class olusturun
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2-  https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3-  Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-  Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedIcerik="Spend less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title test passed");
        }else {
            System.out.println("Title testi failed");
        }

        //6-  Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();

        //7-  Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();

        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img")).click();

        //9-  Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretElementi=driver.findElement(By.cssSelector("span[class='a-color-price a-text-bold']"));
        String expectedDeger="25$";
        String actualDeger=ucretElementi.getText();
        if (expectedDeger.equals(actualDeger)){
            System.out.println("Gift card testi passed");
        }else {
            System.out.println("Gift card testi failed , gerceklesen deger : "+actualDeger);
        }

        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
