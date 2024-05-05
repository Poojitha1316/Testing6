package utilities;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws FileNotFoundException{
        FileReader fr = new FileReader("C:\\Users\\pooji\\IdeaProjects\\TestAutomationPractice\\src\\test\\resources\\configfiles\\config.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));
    }
}