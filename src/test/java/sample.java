import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="C:\\Users\\Yoganadan\\Desktop\\Savi\\Cheque Dummy.jpg";
		System.setProperty("webdriver.chrome.driver", "D:\\Savithri\\New_FundsIndia\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement ele=driver.findElement(By.id("file-upload"));
		ele.sendKeys(filepath);
		WebElement uplo=driver.findElement(By.id("file-submit"));
		uplo.click();

	}

}
