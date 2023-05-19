package practice_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {

    public static void main(String[] args) {

        // ................Exercise3..................
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("100");

        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("45");

        //Click on Calculate
        driver.findElement(By.id("calculate")).click();

        //Get the result
        driver.findElement(By.id("answer")) ;

        //Print the result
        System.out.println(driver.findElement(By.id("answer")).getText());

        driver.close();





    }
}
