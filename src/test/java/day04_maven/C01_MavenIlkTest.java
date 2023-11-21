package day04_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {

        /*
             mahserin ilk 4 webdriver ayarlarini yapmakti
             ama bu adim mecburi degildir
             Selenium 4.8 ile webdriver'ini olusturdugundan
             biz disaridan wbdriver tanimlamasak da
             Selenium kendi driver'ini kulanacaktir
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // testotomasyunu.com anasafya gidin
        driver.get("https://www.testotomasyonu.com");

        // url'in testotomasyonu icerdigini test edin


        // sayfayi kapaatin
        Thread.sleep(3000);
        driver.quit();
    }
}
