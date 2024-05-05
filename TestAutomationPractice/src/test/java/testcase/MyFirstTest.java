package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyFirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get("https://american-technology.office-qa.auzmor.com/login");
        driver.findElement(By.xpath("//*[@id=\"officeApp\"]/div[1]/div[2]/div[2]/form/div[1]/div[1]/label/div/input")).sendKeys("monika.gedam@american-technology.net");
        driver.findElement(By.xpath("//*[@id=\"officeApp\"]/div[1]/div[2]/div[2]/form/div[1]/div[2]/label/div[1]/input")).sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"officeApp\"]/div[1]/div[2]/div[2]/form/button")).click();
    }
}
