package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_webElementMethodlari {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazaon anasayfasina gidip arama kutusunu locate edelim
        driver.get("https://www.amazon.com");

        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.click(); // Web element’e click yapar.

        aramaKutusuElementi.sendKeys("nutella");// Web element’e istenen metni yollar

        //aramaKutusuElementi.submit();// Web element ile islem yaparken ENTER tusuna basma islemini yapar.

        System.out.println(aramaKutusuElementi.isDisplayed());//Web element gorunuyor ise true, yoksa false döner.

        System.out.println(aramaKutusuElementi.isEnabled());//Web element erisilebilir ise true, yoksa false döner.

        System.out.println(aramaKutusuElementi.isSelected());//Web element secili ise true, yoksa false döner.

        System.out.println(aramaKutusuElementi.getText());// varsa webelement uzerindeki yaziyi getirir

        System.out.println(aramaKutusuElementi.getTagName());//input

        System.out.println(aramaKutusuElementi.getAttribute("class"));//nav-input nav-progressive-attribute

        System.out.println(aramaKutusuElementi.getLocation());//(279, 11)

        System.out.println(aramaKutusuElementi.getRect().getDimension());//(618, 38)

        Thread.sleep(3000);
        driver.close();


    }
}
