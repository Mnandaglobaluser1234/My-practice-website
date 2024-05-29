package new_prr.my_rrr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_pro {

	

public WebDriver driver;
	
@Test(priority = 1)
public void ultimateqa1() {
	System.setProperty("webdriver.chrome.driver", "C:\\nanda files\\chromedriver-win64\\chromedriver.exe/");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ultimateqa.com/automation/");
}

@Test(priority = 2)
public void ultimateqa2() {
	driver.findElement(By.linkText("Fake Landing Page")).click();
	driver.findElement(By.linkText("Services")).click();
}

@Test(priority = 3)
public void ultimateqa3() {	
	driver.findElement(By.linkText("About")).click();
}

@Test(priority = 4) 
public void ultimateqa4() {	
	driver.findElement(By.linkText("Blog")).click();
}

@Test(priority = 5) 
public void ultimateqa5() {
	driver.findElement(By.linkText("Education")).click();	
}

@Test(priority = 6) 
public void ultimateqa6() {
	driver.findElement(By.linkText("Education")).click();
	driver.findElement(By.linkText("Free Courses")).click();
}

}
