import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	public static WebDriver driver = null;
	public static void main(String x[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adise\\eclipse-workspace\\Minor2\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(3000);
		//fromCity
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div/ul/li[1]/div/p/span")).click();
		//toCity
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Ongole");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/ul/li[1]/div/p/span")).click();
		Thread.sleep(2000);
		//selectDate
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
		Thread.sleep(5000);
		//train
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div/nav/ul/li[5]/a/span[2]")).click();
		Thread.sleep(3000);
		//from city
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Tadepalligudem");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div/ul/li/div/div/p[2]/span")).click();
		//to city
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div/ul/li[1]/div/div/p[2]/span")).click();
		Thread.sleep(2000);
		//date
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[4]")).click();
		Thread.sleep(1000);
		//class
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a")).click();
		Thread.sleep(5000);
		//flight
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/nav/ul/li[1]/a/span[2]")).click();
		Thread.sleep(3000);
		//from city
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Banglore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]/div/div[1]/p[1]")).click();
		Thread.sleep(1000);
		//to city
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/ul/li[1]/div/div[1]/p[1]")).click();
		Thread.sleep(2000);
		//departure
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[5]/div")).click();
		Thread.sleep(1000);
		//select returnDate
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label/p")).click();
		Thread.sleep(1000);
		//change returnDate
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[2]/div/p[1]")).click();
		Thread.sleep(1000);
		//search 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/p/a")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}