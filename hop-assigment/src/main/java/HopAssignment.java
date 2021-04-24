import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HopAssignment {

	public static void main(String[] args) {

		String chromeDriverPath = "src/main/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://www.moneyhop.co/send/");
		// Maximize window
		driver.manage().window().maximize();
		// Click on Request a callback button
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text jss10 jss8']"))
				.click();
		driver.findElement(By.xpath("//input[ @name ='name']"))
				.sendKeys("Test engineer assignment and other details can be anything");
		driver.findElement(By.xpath("//input[@name ='email']")).sendKeys(" test@test.com");
		driver.findElement(By.xpath("//input[@name ='phone']")).sendKeys("894466499");
		driver.findElement(By.xpath("//input[@name ='city']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@name= 'amount']")).sendKeys("50");
		driver.findElement(
				By.xpath("//button[@class= 'MuiButtonBase-root MuiButton-root MuiButton-text jss120 false undefined']"))
				.click();
		System.out.println("Your request has beens Recived:Success");

	}

}