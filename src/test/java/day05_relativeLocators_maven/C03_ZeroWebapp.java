package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ZeroWebapp {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();

        //3. Login alanine “username” yazdirin
        driver.findElement(By.id("user_login")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");

        //4. Password alanina “password” yazdirin
        driver.findElement(By.name("user_password")).click();
        driver.findElement(By.name("user_password")).sendKeys("password");

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.name("submit")).click();

        //6. Back tusu ile sayfaya donun
        driver.navigate().back();

        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id=\"onlineBankingMenu\"]/div/strong")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).click();
        driver.findElement(By.id("sp_amount")).sendKeys("100");
        Thread.sleep(2000);

        //9. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).click();
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
        Thread.sleep(2000);

        //10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
       WebElement submittedYazisi= driver.findElement(By.id("alert_content"));
        if (submittedYazisi.isDisplayed()){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
