package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dataentry extends kvian {

	// Login
	public static void Login(WebDriver driver) {

		driver.findElement(By.id("txtUserName")).sendKeys("KVSHeadMistress1072");
		driver.findElement(By.id("txtPassword")).sendKeys("SBSBHF3651072");
		driver.findElement(By.id("btnSignIn")).click();
	}

	// Selecting K V Hassan
	public static void Kvhassan(WebDriver driver) {
		WebElement school=driver.findElement(By.id("ContentPlaceHolder1_ddlSchool"));
		school.click();
		school.sendKeys(Keys.ARROW_DOWN);
		school.sendKeys(Keys.ENTER);
	}

	// Selecting Student medicle
	public static void Mediclerecords(WebDriver driver) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='dvMenu']/li[2]/a")));
		driver.findElement(By.xpath("//ul[@id='dvMenu']/li[2]/a")).click();
				
		driver.findElement(By.xpath("//*[@id='dvMenu']/li[2]/ul/li[3]/a")).click();
		
	}
	
	// Selecting The Class
	public static void Classselection(WebDriver driver, int m) {
		driver.findElement(By.id("ContentPlaceHolder1_ddlClass")).click();

		for (int i = 0; i < m; i++) {
			driver.findElement(By.id("ContentPlaceHolder1_ddlClass")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("ContentPlaceHolder1_ddlClass")).sendKeys(Keys.ENTER);

		// press view
		driver.findElement(By.id("ContentPlaceHolder1_btnview")).click();

	}

	// Updating details
	public static void Entry(WebDriver driver) {

		for (int i = 0; i < 49; i++) {

			String id1 = "ContentPlaceHolder1_GvMedicalProfile_ddlhatfoot_" + i;
			driver.findElement(By.id(id1)).click();
			for (int j = 0; j < 2; j++) {
				driver.findElement(By.id(id1)).sendKeys(Keys.ARROW_DOWN);
			}
			driver.findElement(By.id(id1)).sendKeys(Keys.ENTER);

			String id2 = "ContentPlaceHolder1_GvMedicalProfile_ddlScoliosis_" + i;
			driver.findElement(By.id(id2)).click();
			for (int j = 0; j < 2; j++) {
				driver.findElement(By.id(id2)).sendKeys(Keys.ARROW_DOWN);
			}
			driver.findElement(By.id(id2)).sendKeys(Keys.ENTER);

			String id3 = "ContentPlaceHolder1_GvMedicalProfile_ddlKyphosis_" + i;
			driver.findElement(By.id(id3)).click();
			for (int j = 0; j < 2; j++) {
				driver.findElement(By.id(id3)).sendKeys(Keys.ARROW_DOWN);
			}
			driver.findElement(By.id(id3)).sendKeys(Keys.ENTER);

			String id4 = "ContentPlaceHolder1_GvMedicalProfile_ddlLodosis_" + i;
			driver.findElement(By.id(id4)).click();
			for (int j = 0; j < 2; j++) {
				driver.findElement(By.id(id4)).sendKeys(Keys.ARROW_DOWN);
			}
			driver.findElement(By.id(id4)).sendKeys(Keys.ENTER);

			// medicle checkup YES
			String id5 = "ContentPlaceHolder1_GvMedicalProfile_txtMedicalCK_" + i;
			driver.findElement(By.id(id5)).clear();
			driver.findElement(By.id(id5)).sendKeys("YES");

			// Date update
			String id6 = "ContentPlaceHolder1_GvMedicalProfile_txtdate_" + i;
			driver.findElement(By.id(id6)).clear();
			driver.findElement(By.id(id6)).sendKeys("22/08/2019");

			// everything update
			String id7 = "ContentPlaceHolder1_GvMedicalProfile_btnupdate_" + i;
			driver.findElement(By.id(id7)).click();

			driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[3]/button")).click();

		}
	}

}
