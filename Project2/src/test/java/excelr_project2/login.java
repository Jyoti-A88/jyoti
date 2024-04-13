package excelr_project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class login {
	WebDriver driver;

	public login(WebDriver driver) {

		this.driver = driver;
	}
    By signin=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	By usernm = By.id("email");
	By pass = By.id("pass");
	By loginbtn = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span");
	By Mens=By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By tops=By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a");
	By category=By.className("filter-options-title");
	By jackets=By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a");
	By gear=By.xpath("//*[@id=\"ui-id-6\"]/span[2]");
	By bags=By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[1]/a");
	By selimg1=By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]/div/a/span/span/img");
	By acart=By.id("product-addtocart-button");
	By cartbutton=By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	By checkout=By.id("top-cart-btn-checkout");
	By usermail=By.id("customer-email");
	By fn=By.name("firstname");
	By ln=By.name("lastname");
	By comp=By.name("company");
	By address=By.name("street[0]");
	By city=By.name("city");
	By country1=By.name("country_id");
	
	By state=By.name("region_id");
	By pincode=By.name("postcode");
	By phnum=By.name("telephone");
	By next1=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span");
	By pod=By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
	
	
	public void signinn() {
		driver.findElement(signin).click();
	}
	
	public void username() {
		driver.findElement(usernm).sendKeys("jyotinaveen8884@gmail.com");
	}

	public void pwd() {
		driver.findElement(pass).sendKeys("Jyoti@123");

	}

	public void lbtn() throws Exception {
		driver.findElement(loginbtn).click();
		Thread.sleep(2000);

	}
	public void men() {
		driver.findElement(Mens).click();

	}
	public void top() {
		driver.findElement(tops).click();

	}
	public void cat() {
		driver.findElement(category).click();

	}
	
	public void gearb() {
		driver.findElement(gear).click();

	}
	public void bag() {
		driver.findElement(bags).click();

	}
	public void selbag() {
		driver.findElement(selimg1).click();

	}
	public void addcart() throws Exception {
		driver.findElement(acart).click();
		Thread.sleep(2000);

	}
	public void jacket() {
		driver.findElement(jackets).click();

	}
	public void cartclick() {
		driver.findElement(cartbutton).click();
	}
	public void cout() throws Exception {
		driver.findElement(checkout).click();
		Thread.sleep(3000);
	}

	/*
	 * public void mail() {
	 * driver.findElement(usermail).sendKeys("jyoti123@gmail.com"); }
	 */	public void firstn() {
		driver.findElement(fn).sendKeys("jyoti");
	}
	public void lastn() {
		driver.findElement(ln).sendKeys("A");
	}
	public void company() {
		driver.findElement(comp).sendKeys("excellr");
	}
	public void addr() {
		driver.findElement(address).sendKeys("at hubli");
	}
	public void cityn() {
		driver.findElement(city).sendKeys("hubli");
	}
	public void countr() {
		WebElement country=driver.findElement(country1);
		Select obj= new Select(country);
		obj.selectByVisibleText("India");
	}
	public void stat() {
		WebElement state1=driver.findElement(state);
		Select obj1= new Select(state1);
		obj1.selectByVisibleText("Arizona");
	}
	public void pin() {
		driver.findElement(pincode).sendKeys("087965");
	}
	public void phone() {
		driver.findElement(phnum).sendKeys("80278664534");
	}
	public void stat1() {
		WebElement state1=driver.findElement(state);
		Select obj1= new Select(state1);
		obj1.selectByVisibleText("Karnataka");
	}
	public void nextbutton() {
		driver.findElement(next1).click();

	}
	public void placeorderbutton() {
		driver.findElement(pod).click();

	}


}
