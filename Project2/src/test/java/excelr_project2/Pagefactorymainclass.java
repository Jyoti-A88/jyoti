package excelr_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pagefactorymainclass {
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void launchingApp() throws Exception {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

//add to cart items without signin
	@Test(priority = 1)
	public void addtocart() throws Exception {
		driver.manage().window().maximize();
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.wn();
		obj.tp();
		obj.img();
		obj.sz();
		obj.clr();
		obj.cart();
	}

	// launch application
	@Test(priority = 2)
	public void logintomain() throws Exception {
		driver.manage().window().maximize();
		login obj = new login(driver);

		obj.signinn();
		obj.username();
		obj.pwd();
		obj.lbtn();
	}

	// Sort items by position
	@Test(priority = 3)
	public void sortbyposition() throws Exception {
		driver.manage().window().maximize();
		login obj = new login(driver);
		Pagefactorymtd obj1 = new Pagefactorymtd(driver);

		obj.men();
		obj.top();
		obj.cat();
		obj.jacket();
		obj1.sort();
		Thread.sleep(2000);
	}

	// Sort items by product name
	@Test(priority = 4)
	public void sortbyproductname() throws Exception {
		driver.manage().window().maximize();
		login obj = new login(driver);
		Pagefactorymtd obj1 = new Pagefactorymtd(driver);

		obj.men();
		obj.top();
		obj.cat();
		obj.jacket();
		obj1.sort1();
		Thread.sleep(2000);
	}

	// Sort items by price
	@Test(priority = 5)
	public void sortbyprice() throws Exception {
		driver.manage().window().maximize();
		login obj = new login(driver);
		Pagefactorymtd obj1 = new Pagefactorymtd(driver);

		obj.men();
		obj.top();
		obj.cat();
		obj.jacket();
		obj1.sort2();
		Thread.sleep(2000);
	}

	// Show 12 items per page
	@Test(priority = 6)
	public void showitemsperpage() throws Exception {
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.wn();
		obj.tp();
		obj.items();

	}

	// Show items in list view
	@Test(priority = 7)
	public void showitemsperpage1() throws Exception {
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.wn();
		obj.tp();
		obj.listview();

	}

	// land on sale page and select womens sale deal
	@Test(priority = 8)
	public void salepage() {
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.sale1();
		obj.womensale1();

	}

	// item is added to wishlist
	@Test(priority = 9)
	public void addwishlist() throws Exception {
		driver.manage().window().maximize();
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.wn();
		obj.tp();
		obj.img();
		obj.wishlist();
	}

	// item is added for compare
	@Test(priority = 10)
	public void addtocompare() throws Exception {
		driver.manage().window().maximize();
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.wn();
		obj.tp();
		obj.img();
		obj.compare1();
	}

	// land on privacy and cookies page
	@Test(priority = 11)
	public void cookiespage() {
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.cooks();

	}
	// land on searchterms page
	@Test(priority = 12)
	public void searchtermspage() {
		Pagefactorymtd obj = new Pagefactorymtd(driver);

		obj.searchterms();

	}

}
