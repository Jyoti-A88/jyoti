package excelr_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagefactorymtd {
	WebDriver driver;

	public Pagefactorymtd(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	// Repository
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]/span[2]")
	WebElement women;
	@FindBy(xpath = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a")
	WebElement top;
	@FindBy(className = "product-image-photo")
	WebElement image;
	@FindBy(id = "option-label-size-143-item-170")
	WebElement size;
	@FindBy(id = "option-label-color-93-item-57")
	WebElement colour;
	@FindBy(id = "product-addtocart-button")
	WebElement addcart;
	@FindBy(id = "sorter")
	WebElement srt;
	@FindBy(id = "limiter")
	WebElement itemsperpage;
	@FindBy(id = "mode-list")
	WebElement list;
	@FindBy(xpath = "//*[@id=\"ui-id-8\"]/span")
	WebElement sale;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div/a/span/span[2]")
	WebElement womensale;
	@FindBy(xpath = "/html/body/div[2]/footer/div/ul/li[2]/a")
	WebElement cookies;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[1]/span")
	WebElement wishl;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[2]/span")
	WebElement compitem;
	@FindBy(xpath = "/html/body/div[2]/footer/div/ul/li[1]/a/strong")
	WebElement searchpage;
	public void wn() {
		women.click();
	}

	public void tp() {
		top.click();
	}

	public void img() {
		image.click();
	}

	public void sz() {
		size.click();
	}

	public void clr() {
		colour.click();
	}

	public void cart() {
		addcart.click();
	}

	public void sort() {
		Select obj = new Select(srt);
		obj.selectByVisibleText("Position ");
	}

	public void sort1() {
		Select obj = new Select(srt);
		obj.selectByVisibleText("Product Name  ");
	}

	public void sort2() {
		Select obj = new Select(srt);
		obj.selectByVisibleText("Price ");
	}

	public void items() throws Exception {
		Select obj = new Select(itemsperpage);
		obj.selectByVisibleText("12");
		Thread.sleep(2000);
	}

	public void listview() {
		list.click();
	}

	public void sale1() {
		sale.click();
	}

	public void womensale1() {
		womensale.click();
	}

	public void cooks() {
		cookies.click();
	}

	public void wishlist() throws Exception {
		wishl.click();
		Thread.sleep(2000);
	}

	public void compare1() throws Exception {
		compitem.click();
		Thread.sleep(2000);
	}
	public void searchterms() {
		searchpage.click();
	}


}
