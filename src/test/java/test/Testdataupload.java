package test;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testdataupload extends kvian {

	// Login
	public static void Login(WebDriver driver) {

		driver.findElement(By.id("txtUserName")).sendKeys("KVSHeadMistress1072");
		driver.findElement(By.id("txtPassword")).sendKeys("SBSBHF3651072");
		driver.findElement(By.id("btnSignIn")).click();
	}

	// Test data upload
	public static void Testdata(WebDriver driver) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dvMenu']/li[5]/a")));
		driver.findElement(By.xpath("//*[@id='dvMenu']/li[5]/a")).click();

		driver.findElement(By.xpath("//*[@id='dvMenu']/li[5]/ul/li[2]/a")).click();
	}

	// Selecting K V Hassan
	public static void Kvhassan(WebDriver driver) {
		WebElement school = driver.findElement(By.id("ddlSchool"));
		school.click();
		school.sendKeys(Keys.ARROW_DOWN);
		school.sendKeys(Keys.ENTER);
	}

	// Selecting The Class
	public static void Classselection(WebDriver driver, int m) {
		WebElement w = driver.findElement(By.id("ddlClass"));

		WebDriverWait a = new WebDriverWait(driver, 10);
		a.until(ExpectedConditions.elementToBeClickable(By.id("ddlClass")));

		w.click();

		for (int i = 0; i < m; i++) {
			w.sendKeys(Keys.ARROW_DOWN);
		}
		w.sendKeys(Keys.ENTER);

	}

	public static void Testselection(WebDriver driver, int m) {
		WebElement w = driver.findElement(By.id("ddlTest"));
		w.click();

		for (int i = 0; i < m; i++) {
			w.sendKeys(Keys.ARROW_DOWN);
		}
		w.sendKeys(Keys.ENTER);

	}

	public static void Heightweight(WebDriver driver, int minh, int maxh, int minw, int maxw) {

		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {

			Random rand = new Random();

			int height = rand.nextInt((maxh - minh) + 1) + minh;
			String id1 = "txtScore1" + i;
			driver.findElement(By.id(id1)).clear();
			driver.findElement(By.id(id1)).sendKeys(Integer.toString(height));

			int weight = rand.nextInt((maxw - minw) + 1) + minw;
			String id2 = "txtScore2" + i;
			driver.findElement(By.id(id2)).clear();
			driver.findElement(By.id(id2)).sendKeys(Integer.toString(weight));

		}

		driver.findElement(By.id("btnconfirm")).click();
		WebDriverWait a = new WebDriverWait(driver, 10);
		a.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.xpath("//*[@id='ModalMessage']/div/div/div[3]/button")).click();

//			while(driver.findElement(By.xpath("//*[text(),'Unable to save data try again after some time.']")).isDisplayed()) {
//				
//				driver.findElement(By.xpath("//*[@id='ModalMessage']/div/div/div[3]/button")).click();
//				driver.findElement(By.id("btnconfirm")).click();
//				//WebDriverWait a = new WebDriverWait(driver, 10);
//				a.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
//				driver.findElement(By.id("btnSave")).click();
//				
//			}

	}

	public static void Crunch(WebDriver driver, int minc, int maxc) {
		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {

			Random rand = new Random();

			int crunch = rand.nextInt((maxc - minc) + 1) + minc;

			String id1 = "txtScore1" + i;
			driver.findElement(By.id(id1)).sendKeys(Integer.toString(crunch));
		}

	}

	public static void Broad(WebDriver driver) {
		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {

			Random rand = new Random();

			int meter = 1;
			int minj = 0;
			int maxj = 99;
			int cm = rand.nextInt((maxj - minj) + 1) + minj;
			int mm = rand.nextInt(9) + 1;

			String id1 = "txtScore1" + i;
			String id2 = "txtScore2" + i;
			String id3 = "txtScore3" + i;

			driver.findElement(By.id(id1)).sendKeys(Integer.toString(meter));
			driver.findElement(By.id(id2)).sendKeys(Integer.toString(cm));
			driver.findElement(By.id(id3)).sendKeys(Integer.toString(mm));

		}
	}

	public static void Flamingo(WebDriver driver) {
		WebDriverWait a = new WebDriverWait(driver, 10);
		a.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("divCoachTest")));

		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {

			Random rand = new Random();
			int fall = rand.nextInt(6) + 0;

			String id = "txtScore1" + i;
			driver.findElement(By.id(id)).sendKeys(Integer.toString(fall));
		}

	}

	public static void Sitandreach(WebDriver driver) {
		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {

			Random rand = new Random();

			int icm = rand.nextInt(5) + 1;
			int imm = rand.nextInt(10) + 0;
			int fcm = rand.nextInt(22) + 9;
			int fmm = rand.nextInt(10) + 0;

			String idicm = "txtScore2" + i;
			String idimm = "txtScore3" + i;
			String idfcm = "txtScore5" + i;
			String idfmm = "txtScore6" + i;

			driver.findElement(By.id(idicm)).sendKeys(Integer.toString(icm));
			driver.findElement(By.id(idimm)).sendKeys(Integer.toString(imm));
			driver.findElement(By.id(idfcm)).sendKeys(Integer.toString(fcm));
			driver.findElement(By.id(idfmm)).sendKeys(Integer.toString(fmm));

		}
		driver.findElement(By.id("btnconfirm")).click();
		WebDriverWait a = new WebDriverWait(driver, 10);
		a.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();

		while (driver.findElement(By.cssSelector("[class='modal-content'][class='modal-title'] p ")).getText()
				.contains("Unable to save data try again after some time.")) {

			driver.findElement(By.xpath("//*[@id='ModalMessage']/div/div/div[3]/button")).click();
			driver.findElement(By.id("btnconfirm")).click();
			a.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
			driver.findElement(By.id("btnSave")).click();
		}

	}

	public static void Catchingandrecieveing(WebDriver driver) {
		for (int i = 1; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {
			for (int j = 0; j < 4; j++) {
				String id = "cb" + i + j;
				driver.findElement(By.id(id)).click();
			}

		}
	}

	public static void Pushup(WebDriver driver) throws InterruptedException {
		for (int i = 0; i < (driver.findElements(By.id("divCoachTest")).size() - 1); i++) {
			String id1 = "txtScore1" + i;
			Random rand = new Random();

			int num = rand.nextInt((15 - 5) + 1) + 5;

			driver.findElement(By.id(id1)).clear();
			driver.findElement(By.id(id1)).sendKeys(Integer.toString(num));
			Thread.sleep(2000L);

		}

		driver.findElement(By.id("btnconfirm")).click();
		WebDriverWait a = new WebDriverWait(driver, 10);
		a.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));

		driver.findElement(By.id("btnSave")).click();
	}

}
