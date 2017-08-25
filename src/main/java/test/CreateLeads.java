package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\lib\\chromedriver_win32\\chromedriver.exe");
          driver= new ChromeDriver();   
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //open url
          driver.navigate().to("http://leaftaps.com/opentaps");
          //enter username 
          driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
          //enter password 
          driver.findElement(By.id("password")).sendKeys("crmsfa");
          //click login
          driver.findElement(By.xpath(".//*[@id='login']/p[3]/input")).click();
          //click crm/sfa
          driver.findElement(By.xpath(".//*[@id='button']/a/img")).click();
          //click Leads tab  .//*[@id='ext-gen608']
          driver.findElement(By.linkText("Leads")).click();
          
          
          //click find Leads .//*[@id='ext-gen864']
          driver.findElement(By.linkText("Find Leads")).click();
          
          //click on Email
          driver.findElement(By.linkText("Email")).click();
          //enter mail id 
          driver.findElement(By.xpath("//*[@name='emailAddress']")).sendKeys("abc@mail.com");
          
          driver.findElement(By.xpath("//*/button[text()='Find Leads']")).click();
          
          int index = 1;
       //   WebElement baseTable = driver.findElement(By.className("x-grid3-row-table"));
        //  List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
          Thread.sleep(10000);
    //      System.out.println(tableRows.get(index).getText());
       //   System.out.println(driver.findElement(By.xpath(".//*[@id='ext-gen1068']")).getText());
          String name1 =driver.findElement(By.xpath("//*[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a")).getText();
          System.out.println(driver.findElement(By.xpath("//*[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a")).getText());    
          driver.findElement(By.xpath("//*[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a")).click();
          //driver.close();
          driver.findElement(By.xpath("//*[@class='frameSectionExtra']/a")).click();
          
System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());

//driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.xpath("//*[@value='Create Lead']")).click();

System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
String name2 =driver.findElement(By.id("viewLead_firstName_sp")).getText();
if( name1.equals(name2)){
	System.out.println("name matches");
}
else {
	System.out.println("name does not match");
}

driver.close();
	}

}
