package day05_relativeLocators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //             Class Work: Relative Locators
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i 3 farkli relative locator ile locate edin ve test edin
        //    aslinda biz Berlin elementini id='pid7_thumb' seklinde locate edebiliriz
        //    relative locator, locate edilemeyen webelementler icin tasarlanmistir
        //    biz ornek olmasi icin Berlin elementi uzerinde deniyoruz
        //    (aradigimiz webelementin bir ozelligi) + locate edilebilen bir web element'e

        // A- tag'i img, NYC'nin altinda
        WebElement NYC = driver.findElement(By.id("pid3_thumb"));
        WebElement berlinA=driver.findElement(RelativeLocator.with(By.tagName("img")).below(NYC));

        if (berlinA.getAttribute("id").equals("pid7_thumb")){
            System.out.println("berlinA locate testi passed");
        }else {
            System.out.println("berlinA locate testi failed");
        }

        // B- tag'i img, Boston'in saginda
        WebElement boston=driver.findElement(By.id("pid2_thumb"));
        WebElement berlinB=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));

        if (berlinB.getAttribute("id").equals("pid7_thumb")){
            System.out.println("berlinB locate testi passed");
        }else {
            System.out.println("berlinB locate testi failed");
        }


        // C- tag'i img, Sailor'in ustunde
        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement berlinC=driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).above(sailor));
        if (berlinB.getAttribute("id").equals("pid7_thumb")){
            System.out.println("berlinC locate testi passed");
        }else {
            System.out.println("berlinC locate testi failed");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
