package practice_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    /*
    . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver. exetyi tanitalim
3-Driver'in tum ekranı kaplamasini sagu ayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de" adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/" adresine gidip
9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
    */
    public static void main(String[] args) throws InterruptedException {
        //1-Driver oluşturalim
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //2-Java class'imiza chnomedriver. exetyi tanitalim
        WebDriver driver=new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //5-"https://www.ott0.de" adresine gidelim
        driver.get("https://www.otto.de");
        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        String ottoTitle = driver.getTitle();
        String ottoUrl = driver.getCurrentUrl();
        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")) {
            System.out.println("OTTO yazısı her ikisinde de vardır. Test BAŞARILI");
        } else {
            System.out.println("En az birinde OTTO yoktur. TEST FAILED");
        }
        System.out.println("=============================================");

        //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com");

        //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        driver.getTitle();
        String expectedTitle="Quarter";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title testi passed");
        }else {
            System.out.println("Title testi failed");
        }
        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

        //11-Sayfayı yenileyelim
        driver.navigate().refresh();

        //12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();

        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();



    }

}
