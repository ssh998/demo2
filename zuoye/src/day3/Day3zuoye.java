package day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3zuoye {
	public WebDriver driver;
	String nal="http://localhost:8080/Banksys_ssh/";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545289346793");
		driver.findElement(By.id("loginValidate_password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("135654");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[3]/td/div/input")).click();
		driver.findElement(By.name("money")).sendKeys("135");
		driver.findElement(By.id("smoneyValidate_0")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
	}
}
