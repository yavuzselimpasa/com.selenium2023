package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.drive","src/resources/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // implicitlyWait web sayfasi acilincaya kadar driverin ,
        // bizim belirledigimiz maximum bekleyecegi sure

        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta Konum : "+driver.manage().window().getPosition());
        System.out.println("Baslangicta boyut : "+driver.manage().window().getSize());

        Thread.sleep(1000);

        driver.manage().window().maximize();
        System.out.println("Maximize konum :"+driver.manage().window().getPosition());
        System.out.println("Maximize boyut :"+driver.manage().window().getSize());


        Thread.sleep(1500);

        driver.manage().window().minimize();
        System.out.println("Minimize konum :"+driver.manage().window().getPosition());
        System.out.println("Minimize boyut :"+driver.manage().window().getSize());

        Thread.sleep(1500);

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum :"+driver.manage().window().getPosition());
        System.out.println("Fullscreen boyut :"+driver.manage().window().getSize());

        Thread.sleep(1500);

        driver.manage().window().setPosition(new Point(75,60));
        //pencere istenilen konuma getirir.
        driver.manage().window().setSize(new Dimension(500,400));
        //pencere istenilen boyuta getirir.

        Thread.sleep(3000);
        driver.close();


    }
}
