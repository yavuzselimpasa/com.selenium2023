package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

       // web driver olusturma
        WebDriver driver = new ChromeDriver();

        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

    }
}
