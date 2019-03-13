package zuoye01;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zuoye05 {
	public WebDriver driver;
	String nal1="file:///D:/qqÎÄ¼þ/1538758215/FileRecv/Ò³Ãæ/pop.html";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal1);
	}
	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("goo")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String handler:windowHandles) {
			System.out.println(handler);
			driver.switchTo().window(handler);
			String title=driver.getTitle();
			if("test".equals(title)) {
				WebElement user=driver.findElement(By.id("accountID"));
				user.sendKeys("test");
			}
		}
	}
}