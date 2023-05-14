package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna Nutella yazdirip
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.sendKeys("Nutella");// istenen webelemente girilen yaziyi gönderir.

        // Enter tusuna basarak arama yapin
        aramaKutusuElementi.submit();// enter tusuna basar

        Thread.sleep(3000);
        driver.close();
    }
}
