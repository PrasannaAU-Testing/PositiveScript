package ecommerce_demosite;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PositiveTestScript  {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// Search webPage to be tested
		driver.findElement(By.id("APjFqb")).sendKeys("rahul shetty ecommerce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@value='Google Search']")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='yuRUbf']//a[@jsname='UWckNb']")).click();
		Thread.sleep(3000);
		// Get page title
		String page = driver.getTitle();
		System.out.println(page);
		System.out.println("======================================================");
		Thread.sleep(3000);
		// Register new account
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("======================================================");
		// Enter First Name
		WebElement firstname = driver.findElement(By.id("firstName"));
		String fname = "User";
		firstname.sendKeys(fname);
		// Enter Last Name
		WebElement lastname = driver.findElement(By.id("lastName"));
		String lname = "name1";
		lastname.sendKeys(lname);
		// Enter email ID
		WebElement email = driver.findElement(By.id("userEmail"));
		String emailID = "username69@gmail.com";
		email.sendKeys(emailID);
		// Enter Phone No.
		WebElement phoneno = driver.findElement(By.id("userMobile"));
		String phone = "8825956399";
		phoneno.sendKeys(phone);
		// select occupation by using visible text
		String userOccupation = "Engineer";
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@formcontrolname='occupation']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		boolean isOccupationFound = false;
		for (WebElement option : options) {
			if (option.getText().equals(userOccupation)) {
				dropdown.selectByVisibleText(userOccupation);
				isOccupationFound = true;
				break;
			}
		}
		if (isOccupationFound) {
			System.out.println("Occupation found and selected: " + userOccupation);
		} else {
			System.out.println("Occupation not found: " + userOccupation);
		}
		System.out.println("======================================================");
		// Select gender by radio button
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		// Enter Password
		WebElement pass = driver.findElement(By.id("userPassword"));
		String key = "Prasanna@1408";
		pass.sendKeys(key);
		// Enter ConFrim password
		WebElement cpass = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		String ckey = "Prasanna@1408";
		cpass.sendKeys(ckey);
		// Select checkBox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		// Click register button
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(3000);
		// print account notification
		WebElement account = driver.findElement(By.xpath("//h1[@class='headcolor']"));
		String register = account.getText();
		System.out.println(register);
		System.out.println();
		// Click log in
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		// Enter email and password
		driver.findElement(By.id("userEmail")).sendKeys(emailID);
		driver.findElement(By.id("userPassword")).sendKeys(key);
		Thread.sleep(3000);
		// Click login
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		// Select add to card button on second product
		driver.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[2]")).click();
		Thread.sleep(3000);
		// Click orders
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		Thread.sleep(3000);
		// Print item number
		WebElement itemno = driver.findElement(By.xpath("//p[@class='itemNumber']"));
		String itemid = itemno.getText();
		System.out.println("product id :" + itemid);
		System.out.println();
		Thread.sleep(3000);
		// Print product Name
		WebElement productname = driver.findElement(By.xpath("//div[@class='cartSection']/h3"));
		String product = productname.getText();
		System.out.println("product Name :" + product);
		System.out.println();
		Thread.sleep(3000);
		// Print product price
		WebElement productprice = driver.findElement(By.xpath("//div[@class='cartSection']/p[2]"));
		String price = productprice.getText();
		System.out.println("product Price :" + price);
		System.out.println();
		Thread.sleep(3000);
		// Click buy
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		// Print payment mode
		WebElement payment = driver.findElement(By.xpath("//div[@class='payment__type payment__type--cc active']"));
		String paymentmethod = payment.getText();
		System.out.println("Payment mode :" + paymentmethod);
		Thread.sleep(3000);
		// Enter card number
		driver.findElement(By.xpath("//input[@value='4542 9931 9292 2293']")).clear();
		driver.findElement(By.xpath("//input[@value='4542 9931 9292 2293']")).sendKeys("4542 9931 9292 2293");
		// Select Expr. date
		WebElement month = driver.findElement(By.xpath("(//select[@class='input ddl'])[1]"));
		WebElement year = driver.findElement(By.xpath("(//select[@class='input ddl'])[2]"));
		Select m = new Select(month);
		Select y = new Select(year);
		m.selectByIndex(1);
		y.selectByVisibleText("25");
		// Enter CVV
		driver.findElement(By.xpath("(//input[@class='input txt'])[1]")).sendKeys("456");
		// Enter cardHolder name
		driver.findElement(By.xpath("(//input[@class='input txt'])[2]")).sendKeys("Prasanna");
		// Select country
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[2]")).click();
		Thread.sleep(3000);
		// click purchase
		WebElement element = driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		Thread.sleep(3000);
		// Print order ID
		WebElement order_id = driver.findElement(By.xpath("//label[@class='ng-star-inserted']"));
		String Order = order_id.getText();
		System.out.println();
		System.out.println("Order id :" + Order);
		System.out.println();
		// open your order details
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[2]")).click();
		Thread.sleep(5000);
		// print order details table head
		System.out.println("Order Details");
		WebElement tablehead = driver.findElement(By.xpath("//thead[@class='thead-dark']"));
		List<WebElement> head = tablehead.findElements(By.xpath(".//th"));
		for (WebElement thead : head) {
			System.out.print("<---->");
			System.out.print(thead.getText());
		}
		// print order id
		WebElement orderid = driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//th"));
		System.out.println();
		String order = orderid.getText();
		System.out.print(order);
		// Print row details
		WebElement row = driver.findElement(By.xpath("//tr[@class='ng-star-inserted']"));
		List<WebElement> row1 = row.findElements(By.xpath(".//td"));
		for (WebElement firstrow : row1) {
			System.out.print("<---->");
			System.out.print(firstrow.getText());
		}
		// verify order Id
		String orderId = Order.trim().substring(2, Order.length() - 2);
		System.out.println(orderId);
		if (orderId.contentEquals(order)) {
			System.out.println();
			System.out.println();
			System.out.println("Order id is verified");
		} else {
			System.out.println("Order id is not match");
		}
		driver.close();
	}
}

