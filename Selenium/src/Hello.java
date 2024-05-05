import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver diver=new ChromeDriver();
    }
}
