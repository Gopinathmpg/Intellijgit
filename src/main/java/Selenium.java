import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Selenium {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skysports.com");
        Thread.sleep(3000);
        File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(a, new File("C:\\intellijscreen\\Skysportsscreen.jpg"));
        driver.quit();





    }

}
