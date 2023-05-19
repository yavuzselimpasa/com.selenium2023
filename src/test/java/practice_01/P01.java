package practice_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    //...............Exercise-1:.................
    //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {

        //Set Path
        WebDriverManager.chromedriver().setup();

        //Create a chrome driver
        WebDriver driver=new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Open google home page https://www.google.com
        driver.get("https://www.google.com");

        //On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

        //Wait about 4 sn
        Thread.sleep(4000);

        // Navigate forward to amazon
        driver.navigate().forward();

        //Refresh page
        driver.navigate().refresh();

        // Close/quit the browser
        driver.close();

        //And Last step print "All is well" on console
        System.out.println("All is well");

    }
}
