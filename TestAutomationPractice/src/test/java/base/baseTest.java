package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public  static Properties prop=new Properties();
    public static FileReader fr;
    public void setup(){
        if(driver==null){
            FileReader fr = new FileReader("C:\\Users\\pooji\\IdeaProjects\\TestAutomationPractice\\src\\test\\resources\\configfiles\\config.properties");
            prop.load(fr);
        }
        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver= new FirefoxDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver= new EdgeDriver();
        }
        driver.get(prop.getProperty("testurl"));
    }
    public void tearDown(){

    }
}