package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\file.properties");
		prop.load(fis);
		
		String browserName=System.getProperty("browser");
		//String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		String timeout=prop.getProperty("timeout");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File (System.getProperty("user.dir")+"\\src\\main\\java\\resources\\"+result+"screenshot.png"));
		}
}
