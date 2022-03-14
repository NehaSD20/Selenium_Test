	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.*;	

public class Selenium_Test {
		
			//@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\neha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
				 WebDriver driver =new ChromeDriver();
				 driver.get("https://planetos.com");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				 driver.manage().window().maximize();
				 
				//TC_01-Login to PlanetOS
		
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div/div/a[1]")).click();
				 driver.findElement(By.name("email")).sendKeys("neha.sonawane10@gmail.com");
				 driver.findElement(By.name("password")).sendKeys("Star@123");
				 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/form/button")).click();
				 
				 //TC_02 -Search variable----id = react-select-2--value
				 WebElement From = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div/input"));
				From.sendKeys("present weather");
			    From.sendKeys(Keys.ARROW_DOWN);
			    Thread.sleep(3000);
			    From.sendKeys(Keys.ENTER);
			    
			    //TC_03- Search country 
			    WebElement Country = driver.findElement(By.xpath("//*[@id=\"react-select-3--value\"]/div/input"));
			    Country.sendKeys("Estonia");
				Country.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
			    Country.sendKeys(Keys.ENTER);
			    
			   
			// TC_04 -Verify Variable as present weather
			String actualString = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText();
			System.out.println(actualString);
			String expectedString = "present weather";
			System.out.println(expectedString);
			Assert.assertTrue(actualString.contains(expectedString));
			
			
			//TC_04 Verify Country as Estonia
			String actualString1 = driver.findElement(By.xpath("//*[@id=\"react-select-3--value-0\"]")).getText();
	        
			System.out.println(actualString1);
			String expectedString1 = "Estonia";
			System.out.println(expectedString1);
			Assert.assertTrue(actualString1.contains(expectedString1));
			
	}

}
