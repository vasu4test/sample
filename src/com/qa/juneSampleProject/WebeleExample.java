package com.qa.juneSampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebeleExample {
	
	
	
	public static WebDriver driver;
	
	
	public WebeleExample()
	{
		driver =new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='_39M2dM']//input[@type='text']")).sendKeys("9626727072");
	
		driver.findElement(By.xpath("//div[@class='_39M2dM']//input[@type='password']")).sendKeys("vasu1234");
		
		driver.findElement(By.xpath("//div[@class='_1avdGP']")).click();
		
		//driver.findElement(By.linkText("Electronics")).click();
		
		
	}
	
	/*

	
	public void sele() throws InterruptedException
	{
		WebElement wb=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/a/span"));
		
		Select con=new Select(wb);
		
		Thread.sleep(3000);
		
		con.deselectByVisibleText("Mi");
				
		//con.selectByIndex(4);
		
	}
	
	public void mouseAction()
	{
		WebElement wb1=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/a/span"));
		
		WebElement wb2=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a/span"));
		
		
		Actions act=new Actions(driver);
		
		Actions act1=act.moveToElement(wb1).click();
		
			
		
	}



	
	public keyBoardAction()
	
		{
		
		WebElement wb3=driver.findElement(By.linkText("Electronics"));
		
		WebElement wb4=driver.findElement(By.linkText("Mi"));
		
	   Actions na=new Actions(driver);
		
	   Actions na1=na.moveToElement(wb4).build().perform();
		
		//WebElement wb1=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/a/span"));
		
		//WebElement wb2=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a"));
		
		//Actions act=new Actions(driver);
		
		//Action act1=act.clickAndHold(wb1).moveToElement(wb2).build().perform();
		
	}
	*/	
	public void exit()
	{
		driver.manage().deleteAllCookies();
		driver.close();
		
	}
	
	
	
	public static void main(String[] args)throws Exception {
	
		
		WebeleExample web=new WebeleExample();
		
		WebElement wb3=driver.findElement(By.linkText("Electronics"));
		
		
		
		WebElement wb4= driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a"));
		
		//WebElement wb4=driver.findElement(By.linkText("Mi"));
		
		//wb3.click();
		
			
	   Actions na=new Actions(driver);
		
	    na.click(wb3).moveToElement(wb4).doubleClick().build();
	    
	    na.perform();
		
	    // sample enterypdate
		
	    
	    
	    //server u
		//web.keyBoardAction();
		
		//web.sele();
		
		//web.mouseAction();
		
		//Select con=new Select(wb);
		
		//con.deselectByVisibleText("Mi");
		
		//con.selectByIndex(4);
		
		//web.exit();
		
		
	}
	
}
