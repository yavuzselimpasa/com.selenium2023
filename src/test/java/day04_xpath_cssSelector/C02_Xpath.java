package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButtonElementi=driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButtonElementi.isDisplayed()){
            System.out.println("Delete button testi passed");
        }else {
            System.out.println("Delete button testi failed");
        }

        //4- Delete tusuna basin
        deleteButtonElementi.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElemants=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (addRemoveElemants.isDisplayed()){
            System.out.println("Add/Remove element testi passed");
        }else {
            System.out.println("Add/Remove element testi failed");
        }



       Thread.sleep(5000);
        driver.close();
    }
}
