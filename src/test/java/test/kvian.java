package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.base;
//import org.openqa.selenium.edge.EdgeDriver;

public class kvian extends base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Angular\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://www.fitkvian.com/Secure/LoginPage.aspx");

		/*
		Dataentry values = new Dataentry();
		
		values.Login(driver);

		values.Mediclerecords(driver);

		values.Kvhassan(driver);

		values.Classselection(driver, 39);  //1-4 1st, 5-7 2nd, 8-11 3rd, 12-15 4th, 16-18 5th, 19-22 6th, 23-25 7th, 26-29 8th, 30-32 9th, 33-35 10th, 36-37 11th, 38 12th, 39 promoted

		values.Entry(driver);

		*/
		
		Testdataupload  val = new Testdataupload();
		
		val.Login(driver);
		
		val.Testdata(driver);
		
		val.Kvhassan(driver);
		
		Thread.sleep(1000L);
		
		val.Classselection(driver, 14);   //1-4 1st, 5-7 2nd, 8-11 3rd, 12-15 4th, 16-18 5th, 19-22 6th, 23-25 7th, 26-29 8th, 30-32 9th, 33-35 10th, 36-37 11th, 38 12th, 39 promoted
		
		val.Testselection(driver, 3);
		
//		val.Heightweight(driver, 105, 135, 20, 35);
		
//		val.Crunch(driver, 5, 20);
		
//		val.Broad(driver);
		
//		val.Flamingo(driver);
		
		Thread.sleep(2000L);
		
//		val.Sitandreach(driver);
		
//		val.Catchingandrecieveing(driver);
		
		val.Pushup(driver);
		
	}
}
