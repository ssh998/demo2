package day4;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zuoye4 {
	public WebDriver driver;
	String nal="http://localhost:8080/Exam_ssh/adminLogin.do";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void houtai() throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys("admin");//输入管理员账号admin
		driver.findElement(By.id("pass")).sendKeys("admin");//输入密码：admin
		driver.findElement(By.name("B1")).click();//点击登录
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("添加考试类型")).click();//点击添加考试类型
		driver.findElement(By.name("testName")).sendKeys("测试基础");//添加试卷测试基础
		driver.findElement(By.id("testTime")).sendKeys("120分钟");//添加考试时间120分钟
		driver.findElement(By.name("submit")).click();//点击提交按钮
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("添加试题")).click();//点击添加试题
		driver.findElement(By.name("title")).sendKeys("功能测试的概念");//添加题目
		WebElement s1=driver.findElement(By.id("score"));//定位分数下拉框
		Select s=new Select(s1);
		s.selectByIndex(3);//选择下拉框第四个
		WebElement a=driver.findElement(By.id("level"));//定位难度下拉框
		Select s11=new Select(a);
		s11.selectByVisibleText("中等");//选择中等难度
		driver.findElement(By.name("choices")).sendKeys("选项1:选项2:选项3");
		driver.findElement(By.id("standardAnswer")).sendKeys("1:2:2:3");
		driver.findElement(By.name("submit")).click();//点击确定
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("浏览全部试题")).click();//点击浏览全部试题
		WebElement a1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]"));
		System.out.println(a1.getText());//打印全部试题
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("添加考生数据")).click();//点击添加考生数据
		driver.findElement(By.id("id")).sendKeys("3623301561591994");
		driver.findElement(By.name("realname")).sendKeys("杨哲");
		driver.findElement(By.name("stuNumber")).sendKeys("20171231115");
		driver.findElement(By.name("className")).sendKeys("170305");
		driver.findElement(By.name("address")).sendKeys("江西先锋");
		driver.findElement(By.name("phone")).sendKeys("15070337408");
		driver.findElement(By.name("email")).sendKeys("1538758215@qq.com");
		driver.findElement(By.name("humanId")).sendKeys("362330199812092015");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("浏览全部考生")).click();
		WebElement a2=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]"));
		System.out.println(a2.getText());//打印全部考生
		Thread.sleep(2000);
		
		
		
		
	}
}
