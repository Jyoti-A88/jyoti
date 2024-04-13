package excelr_project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TS1toTS10 {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void launchingApp() throws Exception {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void disply() {
		driver.findElement(By.xpath( "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		Boolean dis = driver.findElement(By.id("email")).isDisplayed();
		Boolean pass = driver.findElement(By.id("pass")).isDisplayed();
		Boolean dis1 = driver.findElement(By.id("email")).isEnabled();
		Boolean pass1 = driver.findElement(By.id("pass")).isEnabled();
		if (dis == true && dis1 == true) {
			System.out.println("Username field is displayed and enabled");
		} else {
			System.out.println("Username field is not displayed and not enabled");
		}

		if (pass == true && pass1 == true) {
			System.out.println("Password field is Displayed and Enabled");
		} else {
			System.out.println("password field is not Displyed and not enabled");
		}
		//Validate the watermark in Username and password field.
		String username = driver.findElement(By.id("email")).getAccessibleName();
		String passwd = driver.findElement(By.id("pass")).getAccessibleName();
		System.out.println("watermark text username: " + username);
		System.out.println("watermark text password: " + passwd);
	}


	@DataProvider(name = "logindata")
	public Object[][] logindata() throws Exception {
		Object[][] logindetails = new Object[7][2];
		//Validate with invalid credentials
		logindetails[0][0] = "jyoti123@gmail.com";
		logindetails[0][1] = "Jyoti23";
		Thread.sleep(1000);
	
		//Validate with invalid Username and valid Password.
		logindetails[1][0] = "jyoti_user";
		logindetails[1][1] = "Jyoti@123";
		Thread.sleep(1000);
		//Validate with valid Username and invalid Password
		logindetails[2][0] = "jyotinaveen8884@gmail.com";
		logindetails[2][1] = "1234";
		Thread.sleep(1000);
		//Validate with valid Username and password field is empty.
		logindetails[3][0] = "jyotinaveen8884@gmail.com";
		logindetails[3][1] = "  ";
		Thread.sleep(1000);
		//Validate with Username field is empty and valid Password
		logindetails[4][0] = "  ";
		logindetails[4][1] = "Jyoti@123";
		Thread.sleep(1000);
		//Validate with Username and password fields are empty.
		logindetails[5][0] = "  ";
		logindetails[5][1] = "  ";
		Thread.sleep(1000);
		//Validate with valid credentials
		logindetails[6][0] = "jyotinaveen8884@gmail.com";;
		logindetails[6][1] ="Jyoti@123";
		Thread.sleep(1000);
		return logindetails;
	}

	@Test(dataProvider = "logindata")
	public void loginfunctionality(String username, String password) throws Exception {
		driver.findElement(By.xpath( "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		//Validate the Login button is clickable.
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span")).click();
		Thread.sleep(2000);
	}
//Validate the Username and password fields are availabe and displayed.
		@AfterTest
	public void clo() {
		driver.close();
	}

}




