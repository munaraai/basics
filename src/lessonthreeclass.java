
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lessonthreeclass {

	public static void main(String[] args) {
		System.out.println("muna");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.findElement(By.id("email-input")).sendKeys("asaqa001@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("PAssW0RD");
		driver.findElement(By.id("date-input")).sendKeys("10-10-1990");
		driver.findElement(By.id("mobile-input")).sendKeys("962797700235");
		driver.findElement(By.tagName("button")).click();

	}

}
