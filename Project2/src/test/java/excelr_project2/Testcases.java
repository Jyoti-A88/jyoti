package excelr_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcases {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void launchingApp() throws Exception {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//launch application
	@Test(priority = 1)
	public  void logintomain() throws Exception  {
	driver.manage().window().maximize();
	login obj=new login(driver);
	
	obj.signinn();
	obj.username();
	obj.pwd();
	obj.lbtn();
	}
	//select jackets under men tops
	@Test(priority = 2)
	public  void mensjacketsel() throws Exception  {
		driver.manage().window().maximize();
		login obj=new login(driver);
		
		obj.men();
		obj.top();
		obj.cat();
		obj.jacket();
		}
	//Add to cart functionality
	@Test(priority = 3)
	public  void addtocart() throws Exception  {
		driver.manage().window().maximize();
		login obj=new login(driver);
		
		obj.gearb();
		obj.bag();
		obj.selbag();
		obj.addcart();
		}
	@Test(priority = 4)
	public  void placeorder() throws Exception  {
		driver.manage().window().maximize();
		login obj=new login(driver);
		
		obj.cartclick();
		obj.cout();
		obj.firstn();
		obj.lastn();
		obj.company();
		obj.addr();
		obj.cityn();
		obj.stat();
		obj.pin();
		obj.countr();
		obj.phone();
		obj.stat1();
		obj.nextbutton();
		obj.placeorderbutton();
		}


}
