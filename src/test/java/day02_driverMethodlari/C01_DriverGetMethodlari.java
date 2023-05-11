package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // girilen URL linkine  goturur.

        driver.getTitle(); // baslik dondurur.

        driver.getCurrentUrl(); // gidilen url'yi dondurur.

        driver.getPageSource(); // girilen web sayfasinin kaynak kodlarini donrurur.

        driver.getWindowHandle(); // acilan web penceresinin unique hash kodlarini dondurur.

        driver.getWindowHandles(); // acilan tum web pencerelerinin unique hash kodlarini dondurur.

        Thread.sleep(3000); // milisaniye olarak girilen sure boyunca kodu bekletir.
        driver.close(); // acilan sayfayi kapatir.

    }
}
